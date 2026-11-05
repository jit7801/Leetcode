class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i]< 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        for(int i = digits.length-1; i>0; i--){
            if(digits[i] == 10){
                digits[i-1] += 1;
                return digits;
            }  
        }
        int [] newdigits = new int[digits.length + 1];
        newdigits[0] = 1;
        return newdigits;
    }
}