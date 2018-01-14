/**
 * @param {number[]} nums
 */
var NumArray = function(nums) {
    this.sums = [];
    let sum = 0;
    for(let num of nums) {
        sum += num;
        this.sums.push(sum);
    }
};

/**
 * @param {number} i
 * @param {number} j
 * @return {number}
 */
NumArray.prototype.sumRange = function(i, j) {
    return (i == 0) ? this.sums[j] : (this.sums[j] - this.sums[i-1]);
};

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = Object.create(NumArray).createNew(nums)
 * var param_1 = obj.sumRange(i,j)
 */
