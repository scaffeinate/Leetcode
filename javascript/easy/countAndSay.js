/**
 * @param {number} n
 * @return {string}
 */
var countAndSay = function(n) {
    return countAndSayRecursive(1, n, "1");
};

var countAndSayRecursive = function(i, n, str) {
    if(i == n) return str;
    let res = "";
    for(let j = 0, count = 1; j < str.length; j++) {
        if(j < str.length-1 && str[j] == str[j+1]) {
            count++;
        } else {
            res += count + str[j];
            count = 1;
        }
    }
    return countAndSayRecursive(i+1, n, res);
};
