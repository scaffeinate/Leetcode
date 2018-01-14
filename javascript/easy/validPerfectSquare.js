/**
 * @param {number} num
 * @return {boolean}
 */
var isPerfectSquare = function(num) {
    return search(1, num, num);
};

var search = function(start, end, num) {
    if(start > end) return false;
    let middle = parseInt((start + end)/2);
    let square = middle * middle;
    if(square === num) {
        return true;
    } else if(square > num) {
        return search(start, middle-1, num);
    } else {
        return search(middle+1, end, num);
    }
};
