/**
 * @param {number[]} bits
 * @return {boolean}
 */
var isOneBitCharacter = function(bits) {
    let oneBit = false, i = 0;
    while(i < bits.length) {
        if(bits[i] == 1) {
            oneBit = false;
            i++;
        } else {
            oneBit = true;
        }
        i++;
    }
    return oneBit;
};
