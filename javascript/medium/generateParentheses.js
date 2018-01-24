/**
 * @param {number} n
 * @return {string[]}
 */
var generateParenthesis = function(n) {
    const res = new Array();
    generate(0, 0, n, "", res);
    return res;
};

var generate = function(open, closed, n, str, res) {
    if(open === n && closed === n) {
        res.push(str); return;
    }
    if(open < n) {
        generate(open+1, closed, n, (str + '('), res);
    }
    
    if(closed < open) {
        generate(open, closed+1, n, (str + ')'), res);
    }
};
