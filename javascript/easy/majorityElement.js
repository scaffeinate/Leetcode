/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let counter = 0, majorityElement = 0;
    for(let num of nums) {
        if(counter == 0) {
            majorityElement = num;
        }

        if(majorityElement == num) {
            counter++;
        } else {
            counter--;
        }
    }
    return majorityElement;
};
