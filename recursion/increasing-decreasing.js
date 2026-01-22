/**
 * Print N numbers in Decreasing Order and then in Increasing Order.

You are given a positive number N.
You are required to print the numbers from N to 1.
You are required to not use any loops. Don't change the signature of the function DecThenInc function.
Note : Please print an new line after printing the output.
 */

module.exports = {
    //param A : integer
    DecThenInc: function (A) {
        this.Dec(A);
        this.Inc(1, A);
        process.stdout.write(`\n`)
    },
    Dec: function (A) {
        if (A == 0) return;
        process.stdout.write(`${A} `)
        this.Dec(A - 1);
    },
    Inc: function (i, A) {
        if (i > A) { return };
        process.stdout.write(`${i} `)
        this.Inc(i + 1,A);
    }
};
