//for setting do or(|) with n and n + 1
//for unsetting do and(&) with n and n - 1
class Solution {
    static int setBit(int n) {
        // code here
        return n | (n + 1);
    }
}