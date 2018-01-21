/**
 * @param {number} L
 * @param {number} R
 * @return {number}
 */
var countPrimeSetBits = function(L, R) {
    const set = new Set();
    const primes = [2,3,5,7,11,13,17,19,23,29,31];
    for(let prime of primes) {
        set.add(prime);
    }
    let count = 0;
    for(let i = L; i <= R; i++) {
        let numSetBits = 0, n = i;
        while(n > 0) {
            numSetBits += (((n & 1) != 0) ? 1 : 0);
            n >>>= 1;
        }
        if(set.has(numSetBits)) {
            count++;
        }
    }
    return count;
};
