/*Write a program to find the factorial of the given number A using recursion.

Note: The factorial of a number N is defined as the product of the numbers from 1 to N.*/

module.exports = { 
 //param A : integer
 //return an integer
	solve : function(A){
        return this.factorial(A);
	},
    factorial(num){
        if(num == 0){
            return 1;
        }
        return num * this.factorial(num - 1);
    }
};