class Solution {
    public boolean judgeCircle(String moves) {
        int[] pos = new int[] {0, 0};
        for(int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            if(move == 'U') {
                pos[1]--;
            } else if(move == 'D') {
                pos[1]++;
            } else if(move == 'L') {
                pos[0]--;
            } else if(move == 'R') {
                pos[0]++;
            }
        }
        return pos[0] == 0 && pos[1] == 0;
    }
}
