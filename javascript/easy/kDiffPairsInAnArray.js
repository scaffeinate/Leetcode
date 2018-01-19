/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findPairs = function(nums, k) {
    if(nums.length === 0) return 0;
    
    nums.sort(function(x,y){ return x-y; });
    
    let i = 0, num = nums[0], count = 0;
    if(binarySearch(i+1, nums.length-1, nums, (num+k))) {
        count++;   
    }
    
    while(i < nums.length) {
        if(nums[i] === num) {
            i++; continue;
        }
        num = nums[i];
        if(binarySearch(i+1, nums.length-1, nums, (num+k))) {
            count++;   
        }
        i++;
    }
    return count;
};

var binarySearch = function(start, end, nums, target) {
    while(start <= end) {
        let middle = parseInt((start + end)/2);
        if(nums[middle] === target) {
            return true;
        } else if(nums[middle] > target) {
            end = middle-1;
        } else {
            start = middle+1;
        }
    }
    return false;
};
