//trick: 
//for checking ith bit, and with left shift by 1
class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        int mask = 1 << k;
        
        if((mask & n) != 0)
            return true;
        else
            return false;
        
    }
}