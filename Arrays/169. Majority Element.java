//This question can be solved using Moore's Voting Algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        //first loop will find potential winner
        int votes = 0; //for counting votes
        int element = 0 ;//candidate for election

        for(int i = 0; i < n; i++){
            if(votes == 0){
                votes = 1;
                element = nums[i]; //candidate for election
            } 
            else if(element == nums[i]){
                votes++; //increase vote count
            }
            else{
                votes--; //no vote for this candidate
            }
        }

        //second loop is the official recount
        int count = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == element){
                count++;
            }
        }

        if(count > (n/2)){
            return element; //return the winner
        }

        return -1;
    }
}