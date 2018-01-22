/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let i = 0, j = 0, longest = 0;
    const map = new Map();
    while(j < s.length) {
        const c = s[j];
        if(map.has(c) && map.get(c) >= i) {
            i = (map.get(c) + 1);
        }
        longest = Math.max(longest, (j-i+1));
        map.set(c, j);
        j++;
    }
    return longest;
};
