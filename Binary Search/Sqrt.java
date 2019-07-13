/*
Program to get the square root of an integer. If a is not a perfect square, return floor(sqrt(a)).
e.g. Input: 11
     Output: 3
*/
public class Solution {
    public int sqrt(int a) {
        if(a == 0 || a == 1){
            return a;
        }

        long first = 1;
        long last = a;
        
        int result = 1;
        
        while(first <= last){
            
            long mid = (first + last)/2;
            if(mid*mid == a){
                return (int) mid;
            }
            else if(mid*mid < a){
                first = mid+1;
                result = mid;
            }
            else{
                last = mid-1;
            }
            
        }
        return (int)result;
    }
}
