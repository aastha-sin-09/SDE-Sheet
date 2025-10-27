//it is a question of fixed window because in middle always n - k elements are left out.
//so instead of maximizing score, we have to minimize windowSum 
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        //calculate total sum
        int totalSum = 0;
        for(int points : cardPoints){
            totalSum += points;
        }

        //edge case
        if(k == n){
            return totalSum;
        }

        //---This is the sliding window part ---

        int windowSize = n - k;
        int currWindowSum = 0;

        //initialize **first** window
        for(int i = 0; i < windowSize; i++){
            currWindowSum += cardPoints[i];
        }

        int minWindowSum = currWindowSum;

        for(int i = windowSize; i < n; i++){
            int newElement = cardPoints[i];
            int oldElement = cardPoints[i - windowSize];
            currWindowSum = currWindowSum + newElement - oldElement;

            minWindowSum = Math.min(minWindowSum, currWindowSum);
        }

        return totalSum - minWindowSum; //total - left behind;

    }
}