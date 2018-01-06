/**
 * @param {number} x
 * @return {number}
 */
var mySqrt = function(x) {
    let start = 1, end = x;
    while(start <= end) {
        let middle = (start + end)/2;
        let sqr = middle * middle;
        if(sqr == x) {
            return middle;
        } else if(sqr > x) {
            end = middle - 1;
        } else {
            start = middle + 1;
        }
    }
    return start-1;
};
