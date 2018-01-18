/**
 * @param {number[]} candies
 * @return {number}
 */
var distributeCandies = function(candies) {
    const set = new Set(), share = parseInt(candies.length/2);
    for(let candy of candies) {
        set.add(candy);
    }
    return (set.size > share) ? share : set.size;
};
