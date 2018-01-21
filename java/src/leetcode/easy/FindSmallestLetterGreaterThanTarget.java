class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length-1;
        while(start <= end) {
            int middle = (start+end)/2;
            if(letters[middle] > target) {
                end = middle-1;
            } else {
                start = middle+1;
            }
        }
        return (start >= letters.length) ? letters[0] : letters[start];
    }
}
