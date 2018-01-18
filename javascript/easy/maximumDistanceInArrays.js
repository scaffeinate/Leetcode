/**
 * @param {number[][]} arrays
 * @return {number}
 */
var maxDistance = function(arrays) {
    let min = arrays[0][0], max = arrays[0][arrays[0].length-1], maxDistance = 0;
    for(let i = 1; i < arrays.length; i++) {
        let aMin = arrays[i][0], aMax = arrays[i][arrays[i].length-1];
        maxDistance = Math.max(maxDistance, Math.abs(max - aMin), Math.abs(aMax - min));
        min = Math.min(min, aMin);
        max = Math.max(max, aMax);
    }
    return maxDistance;
};
