//Given a digit string A, return all possible letter combinations that the number could represent.A mapping of digit to letters (just like on the telephone buttons) is given below.
//The digit 0 maps to 0 itself. The digit 1 maps to 1 itself.
//NOTE: Make sure the returned strings are lexicographically sorted.

public class Solution {
    public ArrayList<String> letterCombinations(String A) {
        String[] arr = A.split("");
        HashMap<Integer, String> dialpad = new HashMap<>();
        generateDialPadValues(dialpad, arr);
        ArrayList<String> ansArray = new ArrayList<>();
        generate(dialpad, arr, 0,ansArray, "" );
        return ansArray;
    }


    public void generate(HashMap<Integer, String> dialpad, String[] arr, int i,ArrayList<String> ansArray, String partial){
       
        if(i == arr.length){
            ansArray.add(partial);
            return;
        }
        int number = Integer.parseInt(arr[i]);
        String str = dialpad.get(number);

        for(int j=0;j<str.length();j++){
            generate(dialpad, arr,i+1, ansArray, partial+str.charAt(j));
        }
    }

    public void generateDialPadValues(HashMap<Integer, String> dialpad, String[] arr){
        for(int k=0; k< arr.length;k++){
            switch(Integer.parseInt(arr[k])){
                case 1:
                dialpad.put(1, "1");
                break;
                case 2:
                dialpad.put(2, "abc");
                break;
                case 3:
                dialpad.put(3, "def");
                break;
                case 4:
                dialpad.put(4, "ghi");
                break;
                case 5:
                dialpad.put(5, "jkl");
                break;
                case 6:
                dialpad.put(6, "mno");
                break;
                case 7:
                dialpad.put(7, "pqrs");
                break;
                case 8:
                dialpad.put(8, "tuv");
                break;
                case 9:
                dialpad.put(9, "wxyz");
                break;
                case 0:
                dialpad.put(0, "0");
                break;
            }
        }
    }
}



// A -> "23" 
// data at 2 -> "abc"
// data at 3 -> "def"

