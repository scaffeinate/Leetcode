/**
 * @param {string} s
 * @return {string}
 */
var reverseVowels = function(s) {
    let i = 0, j = s.length-1, res = s.split("");
    while(i < j) {
        if(isVowel(res[i]) && isVowel(res[j])) {
            swap(res, i, j);
            i++; j--;
        } else if(isVowel(res[i])) {
            j--;
        } else if(isVowel(res[j])) {
            i++;
        } else {
            i++; j--;
        }
    }
    return res.join("");
};

var isVowel = function(c) {
    return "aeiouAEIOU".indexOf(c) != -1;
};

var swap = function(arr, i, j) {
    let temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
};
