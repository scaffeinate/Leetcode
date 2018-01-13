/**
 * @param {string} num
 * @return {boolean}
 */
var isStrobogrammatic = function(num) {
    let map = { '0': '0', '1': '1', '8': '8', '6': '9', '9': '6' };
    let upsideDown =  "";
    for(let c of num) {
        upsideDown = map[c] + upsideDown;
    }
    return upsideDown === num;
};
