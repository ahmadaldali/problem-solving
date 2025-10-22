class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left = 0;
        for(int i=0;i<k;i++) {
            left += cardPoints[i]; // get the value of left items.
        }

        int right = 0;
        int score = left; // suppose the max is all items from left.
        
        for(int i=0;i<k;i++) {
            right += cardPoints[cardPoints.length -1-i]; // get the value of right items.
            left = left - cardPoints[k-1-i]; // extract out one item from the left "the end item"
            // replace one item from left by an item from right; 
            score = (right + left) > score ? (right + left) : score; // store the max
        }

        return score;
    }
}

// Time: O(n) - Space: O(1)
