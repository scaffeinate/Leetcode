/**
 * @param {string} compressedString
 */
var StringIterator = function(compressedString) {
    this.compressedString = compressedString;
    this.i = 0;
    this.count = 0;
    this.char = 0;
};

/**
 * @return {character}
 */
StringIterator.prototype.next = function() {
    if(!this.hasNext()) return " ";
    let i = this.i, compressedString = this.compressedString;
    if(this.count <= 0) {
        this.char = compressedString[i];
        i++;
        let count = 0;
        while(i < compressedString.length) {
            let c = compressedString[i];
            if(!StringIterator.isNumeric(c)) {
                break;
            }
            count = (count * 10) + StringIterator.getValue(c);
            i++;
        }
        this.count = count;
        this.i = i;
    }
    
    this.count--;
    return this.char;
};

/**
 * @return {boolean}
 */
StringIterator.prototype.hasNext = function() {
    return this.i < this.compressedString.length || this.count > 0;
};

StringIterator.isNumeric = function(c) {
    let code = c.charCodeAt(0);
    return code >= '0'.charCodeAt(0) && code <= '9'.charCodeAt(0);
};

StringIterator.getValue = function(c) {
    return c.charCodeAt(0) - '0'.charCodeAt(0);    
};

/** 
 * Your StringIterator object will be instantiated and called as such:
 * var obj = Object.create(StringIterator).createNew(compressedString)
 * var param_1 = obj.next()
 * var param_2 = obj.hasNext()
 */
