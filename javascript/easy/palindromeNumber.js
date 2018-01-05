let isPalindrome = function(x) {
    return x < 0 ? false : (reverse(x, {f: 1}) == x);
};

let reverse = function(n, obj) {
    if(n <= 0) return 0;
    let val = reverse(parseInt(n/10), obj);
    res = val + (n%10) * obj.f;
    obj.f *= 10;
    return res;
};