var reverse = function(x) {
    let n = Math.abs(x), res = 0;
    while(n > 0) {
        res = (res * 10) + (n % 10);
        n = parseInt(n/10);
    }
    return (res > Math.pow(2, 31)) ? 0 : ((x < 0) ? -res : res);
};