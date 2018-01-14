/**
 * @param {string} s
 * @param {string} t
 * @return {character}
 */
var findTheDifference = function(s, t) {
    const arr = new Array(26);
    arr.fill(0);
    for(let c of s) {
        let index = c.charCodeAt(0) - 97;
        arr[index]++;
    }
    
    for(let c of t) {
        let index = c.charCodeAt(0) - 97;
        arr[index]--;
    }
    
    for(let i = 0; i < arr.length; i++) {
        if(arr[i] != 0) {
            return String.fromCharCode(97+i);
        }
    }
};
