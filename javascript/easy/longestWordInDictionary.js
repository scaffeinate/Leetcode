/**
 * @param {string[]} words
 * @return {string}
 */
var longestWord = function(words) {
    const queue = new Array(""), visited = new Set(), dict = new Set();
    let longest = "";
    for(let word of words) {
        dict.add(word);
    }
    
    while(queue.length > 0) {
        let current = queue.shift();
        visited.add(current);
        if(current.length > longest.length) {
            longest = current;
        }
        
        for(let i = 0; i < 26; i++) {
            let word = current + String.fromCharCode(i + 97);
            if(dict.has(word) && !visited.has(word)) {
                queue.push(word);
            }
        }
    }
    return longest;
};
