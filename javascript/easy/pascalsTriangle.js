/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    let queue = [], i = 0, res = [];
    if(numRows == 0) return res;
    queue.unshift([1]);
    while(i < numRows && queue.length > 0) {
        let level = queue.pop(), temp = [];
        res.push(level);
        for(let j = 0; j < level.length-1; j++) {
            temp.push(level[j] + level[j+1]);
        }
        temp.unshift(1); temp.push(1);
        queue.unshift(temp);
        i++;
    }
    return res;
};
