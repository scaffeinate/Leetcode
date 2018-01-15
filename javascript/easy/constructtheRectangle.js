/**
 * @param {number} area
 * @return {number[]}
 */
var constructRectangle = function(area) {
    const sqrt = parseInt(Math.sqrt(area));
    let min = area, minPair = [area, 1];
    for(let i = 1; i <= sqrt; i++) {
        if((area % i) === 0) {
            let div = parseInt(area/i), diff = Math.abs(div);
            if(diff < min) {
                min = diff;
                minPair = (i > div) ? [i,div] : [div,i];
            }
        }
    }
    return minPair;
};
