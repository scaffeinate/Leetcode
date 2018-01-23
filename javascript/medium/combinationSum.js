/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
var combinationSum = function(candidates, target) {
    const res = new Array(), temp = new Array();
    generateCombinations(0, target, candidates, temp, res);
    return res;
};

var generateCombinations = function(index, target, candidates, temp, res) {
    if(target === 0) {
        res.push(temp.slice(0));
    } else if(target > 0) {
        for(let i = index; i < candidates.length; i++) {
            temp.push(candidates[i]);
            generateCombinations(i, target-candidates[i], candidates, temp, res);
            temp.pop(candidates[i]);
        }
    }
};
