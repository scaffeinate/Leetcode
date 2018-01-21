/**
 * @param {number[]} A
 * @param {number[]} B
 * @return {number[]}
 */
var anagramMappings = function(A, B) {
    const map = new Map(), res = new Array();
    for(let i = 0; i < B.length; i++) {
        map.set(B[i], i);
    }
    for(let i = 0; i < A.length; i++) {
        res.push(map.get(A[i]));
    }
    return res;
};
