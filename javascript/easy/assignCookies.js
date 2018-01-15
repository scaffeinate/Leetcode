/**
 * @param {number[]} g
 * @param {number[]} s
 * @return {number}
 */
var findContentChildren = function(g, s) {
    g.sort(function(x,y){
        return x-y;
    });
    s.sort(function(x,y){
        return x-y;
    });
    let i = 0, j = 0;
    while(i < g.length && j < s.length) {
        if(s[j] >= g[i]) {
            i++;
        }
        j++;
    }
    return i;
};
