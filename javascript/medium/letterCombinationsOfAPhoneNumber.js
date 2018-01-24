/**
 * @param {string} digits
 * @return {string[]}
 */
var letterCombinations = function(digits) {
    const map = { '2': ['a', 'b', 'c'], '3': ['d', 'e', 'f'], '4': ['g', 'h', 'i'], 
                  '5': ['j', 'k', 'l'], '6': ['m', 'n', 'o'], '7': ['p', 'q', 'r', 's'], 
                  '8': ['t', 'u', 'v'],
                  '9': ['w', 'x', 'y', 'z'], '0': [' '] };
    const res = new Array();
    generateCombinations(0, digits, map, "", res);
    return res;
};

var generateCombinations = function(index, digits, map, str, res) {
    if(index === digits.length) {
        if(str.length > 0) {
            res.push(str);    
        }
        return;
    }
    
    let c = digits[index];
    const chars = map[c];
    for(let c of chars) {
        generateCombinations(index+1, digits, map, str+c, res);    
    }
};
