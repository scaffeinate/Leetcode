/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    let stack = [];
    let map = { '(': ')', '[': ']', '{': '}' };
    for (c of s) {
        if(map[c] !== undefined) {
            stack.push(c);
        } else {
            if(stack.length == 0 || (map[stack.pop()] !== c)) {
                return false;
            }
        }
    }
    return stack.length == 0;
};