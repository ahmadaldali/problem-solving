/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if (x<0) return false;

    const num = x;
    let t = 0;
    while (x != 0) {
        const rem = x%10;
        t = (t*10 + rem);
        x = Math.floor(x/10);
    }

    return t == num;
};
