/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if(n == 1)
            return 1;
        
        int hi = n;
        int low = 1;
     
        
        while(low < hi){
            int mid = low + (hi-low)/2;
            switch(guess(mid)){
                case -1:hi = mid-1; continue;
                case 1:low = mid+1; continue;
                case 0: return mid;
                default: break;
            }
        }
        
        return hi;
    }
}