/**
 * @param {number} n
 * @return {string[]}
 */

FIZZ = "Fizz", BUZZ = "Buzz", FIZZ_BUZZ = FIZZ + BUZZ;

var fizzBuzz = function(n) {
    const results = new Array();
    for(let i = 1; i <= n; i++) {
        if(isMod(i, 3) && isMod(i, 5)) {
            results.push(FIZZ_BUZZ);
        } else if(isMod(i, 3)) {
            results.push(FIZZ);
        } else if(isMod(i, 5)) {
            results.push(BUZZ);
        } else {
            results.push(i.toString());
        }
    }
    return results;
};

var isMod = function(i, mod) {
    return ((i % mod) == 0);
};
