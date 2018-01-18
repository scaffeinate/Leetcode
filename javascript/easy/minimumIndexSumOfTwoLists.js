/**
 * @param {string[]} list1
 * @param {string[]} list2
 * @return {string[]}
 */
var findRestaurant = function(list1, list2) {
    const map = new Map();
    let minSum = list1.length + list2.length, res = new Array();
    for(let i = 0; i < list1.length; i++) {
        map.set(list1[i], i);
    }
    
    for(let i = 0; i < list2.length; i++) {
        if(map.has(list2[i])) {
            minSum = Math.min(minSum, (map.get(list2[i]) + i));
        }
    }
    
    for(let i = 0; i < list2.length; i++) {
        if(map.has(list2[i]) && ((map.get(list2[i]) + i) === minSum)) {
            res.push(list2[i]);
        }
    }
    return res;
};
