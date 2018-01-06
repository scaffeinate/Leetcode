/**
 * @param {number} rowIndex
 * @return {number[]}
 */
var getRow = function(rowIndex) {
    let queue = [], row = [], index = 0;
    queue.unshift([1]);
    while(index <= rowIndex && queue.length > 0) {
        row = queue.pop();
        let level = [];
        for (let i = 0; i < row.length-1; i++) {
            level.push(row[i] + row[i+1]);
        }
        level.unshift(1); level.push(1);
        queue.unshift(level);
        index++;
    }
    return row;
};
