/**
 * @param {character[]} letters
 * @param {character} target
 * @return {character}
 */
var nextGreatestLetter = function(letters, target) {
    let start = 0, end = letters.length-1;
    while(start <= end) {
        let middle = parseInt((start + end)/2);
        if(letters[middle] > target) {
            end = middle - 1;
        } else {
            start = middle + 1;
        }
    }
    return (start >= letters.length) ? letters[0] : letters[start];
};
