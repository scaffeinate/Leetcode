/**
 * @param {number} n
 * @return {number}
 */
var countPrimes = function(n) {
    let count = 0, arr = [];
    for(let i = 2; i < n; i++) {
        if(arr[i-2] == 1) continue;
        let j = i, mul = 2;
        count++;
        while((j = (i * mul++)) < n) {
            arr[j-2] = 1;
        }
    }
    return count;
};