/**
 * @constructor
 * @param {Integer[][]} vec2d
 */
var Vector2D = function(vec2d) {
    this.i = 0;
    this.j = 0;
    this.vec2d = vec2d;
};


/**
 * @this Vector2D
 * @returns {boolean}
 */
Vector2D.prototype.hasNext = function() {
    let i = this.i, j = this.j, vec2d = this.vec2d;
    if(i < vec2d.length && j >= vec2d[i].length) {
        j = 0;
        i++;
        while(i < vec2d.length && vec2d[i].length === 0) {
            i++;
        }
    }
    this.i = i;
    this.j = j;
    return (i < vec2d.length && j < vec2d[i].length);
};

/**
 * @this Vector2D
 * @returns {integer}
 */
Vector2D.prototype.next = function() {
    let i = this.i, j = this.j;
    const res = this.vec2d[i][j];
    this.j++;
    return res;
};

/**
 * Your Vector2D will be called like this:
 * var i = new Vector2D(vec2d), a = [];
 * while (i.hasNext()) a.push(i.next());
*/
