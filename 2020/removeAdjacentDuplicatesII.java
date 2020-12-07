class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int count[] = new int[sb.length()]; //count array to keep track of count of a char
        
        for(int i = 0; i < sb.length(); i++){
            //if it is first index or char is not same as previous one, set count[i] to 1
            if(i == 0 || sb.charAt(i) != sb.charAt(i-1)){ 
                count[i] = 1;
            }
            //if it is repeating
            else{
                count[i] = count[i-1]+1; //update count with how many time the char occured untl that point
                if(count[i] == k){ //if equal to number of chars to be removed, remove them and take i back to i-k steps
                    sb.delete(i-k+1,i+1);
                    i = i-k;
                }
            }
        }
        return sb.toString();
    }
}