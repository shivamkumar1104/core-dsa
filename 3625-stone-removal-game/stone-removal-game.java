class Solution {
    public boolean canAliceWin(int n) {
        int stonesToRemove = 10;
        boolean aliceTurn = true;

        while (n >= stonesToRemove && stonesToRemove > 0) {
            n -= stonesToRemove;
            stonesToRemove--;
            aliceTurn = !aliceTurn;
        }

        // If it's currently Alice's turn, she couldn't make a move, so she loses.
        // If it's Bob's turn, Alice made the last valid move and wins.
        return !aliceTurn;
    }
}