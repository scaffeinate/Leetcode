/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
var combinationSum2 = function(candidates, target) {
    const res = new Array(), temp = new Array(), entries = new Array();
    const map = new Map();
    for(let candidate of candidates) {
        if(!map.has(candidate)) {
            map.set(candidate, 1);
        } else {
            map.set(candidate, map.get(candidate)+1);    
        }
    }
    
    map.forEach(function(v, k, map){
       entries.push([k, v]); 
    });
    
    generateCombinationSum(0, target, entries, temp, res);
    return res;
};

var generateCombinationSum = function(index, target, entries, temp, res) {
    if(target === 0) {
        res.push(temp.slice(0));
    } else if(target > 0) {
        for(let i = index; i < entries.length; i++) {
            const entry = entries[i];
            if(entry[1] > 0) {
                temp.push(entry[0]);
                entry[1]--;
                generateCombinationSum(i, (target-entry[0]), entries, temp, res);
                entry[1]++;
                temp.pop();
            }
        }
    }
};
