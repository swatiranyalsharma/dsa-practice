/**
 * You are given an array A. Print the elements of the array using recursion.

NOTE :
You are required to not use any loops, You can create new functions.
Don't change the signature of the function PrintArray.
Print a new empty line after printing the output.
 */
module.exports = {
    //param A : array of integers
    PrintArray: function (A) {

        this.print(0, A);
        process.stdout.write('\n');
    },
    print: function (i, A, ouputArray) {
        if (i >= A.length) {
            return;
        }
        process.stdout.write(`${A[i]}`);
        process.stdout.write(' ');
        this.print(i + 1, A);
    }
};
