/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var reverseStr = function(s, k) {
    let arr = s.split(""), i = 0, j = 0;
    while(j < s.length) {
        if((j - i + 1) == (2 * k)) {
            reverse(arr, i, (i+k-1));
            i = j+1;
        }
        j++;
    }
    reverse(arr, i, Math.min(arr.length-1, (i+k-1)));
    return arr.join("");
};

var reverse = function(arr, i, j) {
    while(i < j) {
        let temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++; j--;
    }    
};
