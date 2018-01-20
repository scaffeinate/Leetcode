/**
 * @param {number[]} nums
 * @return {number}
 */
var findShortestSubArray = function(nums) {
    const freqMap = new Map(), indexesMap = new Map();
    let shortest = nums.length, maxFreq = 0;
    for(let i = 0; i < nums.length; i++) {
        let freq = (freqMap.has(nums[i]) ? (freqMap.get(nums[i]) + 1) : 1);
        freqMap.set(nums[i], freq);
        maxFreq = Math.max(maxFreq, freq);
        
        if(indexesMap.has(nums[i])) {
            let arr = indexesMap.get(nums[i]);
            arr.min = Math.min(arr.min, i);
            arr.max = Math.max(arr.max, i);
        } else {
            indexesMap.set(nums[i], {min: i, max: i});
        }
    }
    
    for(let i = 0; i < nums.length; i++) {
        if(freqMap.get(nums[i]) === maxFreq) {
            let arr = indexesMap.get(nums[i]);
            shortest = Math.min(shortest, (arr.max - arr.min + 1));
        }
    }
    
    return shortest;
};
