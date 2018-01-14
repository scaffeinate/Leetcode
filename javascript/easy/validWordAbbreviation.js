/**
 * @param {string} word
 * @param {string} abbr
 * @return {boolean}
 */
var validWordAbbreviation = function(word, abbr) {
    let i = 0, j = 0, num = 0, abbrCounter = 0;
    while(i < word.length && j < abbr.length) {
        if(isNumeric(abbr[j])) {
            num = (num * 10) + getNumber(abbr[j]);
            if(num === 0) {
                return false;
            }
            j++; continue;
        }
        
        abbrCounter += num;
        while(num > 0 && i < word.length) {
            num--; i++;
        }
        
        if(i >= word.length || word[i] !== abbr[j]) {
            break;
        }
        i++; j++;
        abbrCounter++;
    }
    return ((i+num) === word.length) && (j === abbr.length) && ((abbrCounter + num) === word.length);
};

var isNumeric = function(c) {
    return (c.charCodeAt(0) >= '0'.charCodeAt(0)) && (c.charCodeAt(0) <= '9'.charCodeAt(0));
};

var getNumber = function(c) {
    return parseInt(c);
};
