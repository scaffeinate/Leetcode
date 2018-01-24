/**
 * @param {number} s
 * @param {number[]} nums
 * @return {number}
 */
var minSubArrayLen = function(s, nums) {
    let minLen = Number.MAX_SAFE_INTEGER, i = 0, j = 0, sum = 0;
    while(j < nums.length) {
        sum += nums[j];
        while(i <= j && sum >= s) {
            minLen = Math.min(minLen, (j-i+1));
            sum -= nums[i];
            i++;
        }
        j++;
    }
    return (minLen === Number.MAX_SAFE_INTEGER) ? 0 : minLen;
};
