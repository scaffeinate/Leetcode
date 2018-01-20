/**
 * @param {string[]} ops
 * @return {number}
 */
var calPoints = function(ops) {
    const stack = new Array();
    let sum = 0;
    for(let op of ops) {
        if(op === "C") {
            stack.pop();
        } else if(op === "D") {
            stack.push(stack[stack.length-1] * 2);
        } else if(op === "+") {
            stack.push(stack[stack.length-1] + stack[stack.length-2]);
        } else {
            stack.push(parseInt(op));
        }
    }
    
    while(stack.length > 0) {
        sum += stack.pop();
    }
    return sum;
};
