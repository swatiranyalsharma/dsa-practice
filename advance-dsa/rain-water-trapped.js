//Rain Water Trapped
/*Imagine a histogram where the bars' heights are given by the array A. Each bar is of uniform width, which is 1 unit. When it rains, water will accumulate in the valleys between the bars.

Your task is to calculate the total amount of water that can be trapped in these valleys.

Example:

The Array A = [5, 4, 1, 4, 3, 2, 7] is visualized as below. The total amount of rain water trapped in A is 11.*/

module.exports = {
    //param A : array of integers
    //return an integer
    trap: function (A) {
        let suffixArray = this.getSuffixArray(A);
        let totalWaterContent = 0;
        let max = A[0];
        for (let i = 1; i < A.length - 1; i++) {
            let rightMax = suffixArray[i + 1];
            let leftMax = max;
            if (leftMax > A[i] && rightMax > A[i]) {
                let minHeight = Math.min(leftMax, rightMax);
                totalWaterContent = totalWaterContent + (minHeight - A[i]);
            }
             max = Math.max(max, A[i]);

        }
        return totalWaterContent;
    },
    getSuffixArray(A) {
        let suffixArray = [];
        suffixArray[A.length - 1] = A[A.length - 1];
        for (let i = A.length - 2; i >= 0; i--) {
            suffixArray[i] = Math.max(suffixArray[i + 1], A[i]);
        }
        return suffixArray;
    },
};
