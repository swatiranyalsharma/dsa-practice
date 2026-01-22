/**The Fibonacci numbers are the numbers in the following integer sequence.



0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation:

Fn = Fn-1 + Fn-2

Given a number A, find and return the Ath Fibonacci Number using recursion.

Given that F0 = 0 and F1 = 1. */
module.exports = {
    //param A : integer
    //return an integer
    findAthFibonacci: function (A) {
        return this.fibb(A);
    },
    fibb(n) {
        if (n <= 1) {
            return n;
        }
        return (this.fibb(n - 1) + this.fibb(n - 2));
    }
};
