/**
 * @param {string} S
 * @param {number} K
 * @return {string}
 */
var licenseKeyFormatting = function(S, K) {
    let res = "", key = S.replace(/-/g, '');
    if (key.length == 0) return res;
    let mod = ((key.length) % K);
    if(mod > 0) {
        res += key.substring(0, mod);
    }
    while(mod < key.length) {
        res += (mod === 0) ? "" : "-";
        res += key.substring(mod, mod+K);
        mod += K;
    }
    return res.toUpperCase();
};
