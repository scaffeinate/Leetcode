/**
 * @param {character[]} chars
 * @return {number}
 */
var compress = function(chars) {
    if(chars.length == 0) {
        return 0;
    }
    let i = 0, j = 1, count = 1, c = chars[0];
    while(j < chars.length) {
        if(chars[j] === c) {
            count++;
        } else {
            chars[i] = c;
            i = (count <= 1) ? (i+1) : fillChars(i+1, chars, count);
            c = chars[j];
            count = 1;
        }
        j++;
    }
    chars[i] = c;
    i = (count <= 1) ? (i+1) : fillChars(i+1, chars, count);
    return i;
};

var fillChars = function(index, chars, count) {
    if(count <= 0) return index;
    i = fillChars(index, chars, parseInt(count/10));
    chars[i] = (count%10).toString();
    return i+1;
}
