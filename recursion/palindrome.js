/**
 * Write a recursive function that checks whether string A is a palindrome or Not.
Return 1 if the string A is a palindrome, else return 0.

Note: A palindrome is a string that's the same when read forward and backward.
 */

module.exports = {
    //param A : string
    //return an integer
    solve: function (A) {
        return this.checkPalindrome(A);
    },
    checkPalindrome(A) {
        if (A == 'undefined' || !A.length) {
            return 1;
        }
        let first = A[0];
        let last = A[A.length - 1];

        if (first != last) {
            return 0;
        }
        A = A.slice(1, A.length - 1);
        // A = A.slice(A.length - 1);
        if (A == 'undefined' || !A.length) {
            return 1;
        }
        return this.checkPalindrome(A);
    }
};
