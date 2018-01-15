/**
 * @param {number[]} nums
 * @return {string[]}
 */
var findRelativeRanks = function(nums) {
    let res = new Array(), sorted = [...nums].sort(function(x,y){return y-x;}), ranksMap = new Map(); 
    for(let i = 0; i < sorted.length; i++) {
        if(i < 3) {
            const rank = ((i === 0) ? "Gold Medal" : ((i === 1) ? "Silver Medal" : "Bronze Medal"));
            ranksMap.set(sorted[i], rank);
        } else {
            ranksMap.set(sorted[i], (i+1).toString());
        }
    }
    for(let num of nums) {
        res.push(ranksMap.get(num));
    }
    
    return res;
};
