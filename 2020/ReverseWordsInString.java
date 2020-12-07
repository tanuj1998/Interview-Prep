/* My solution TLE. Idea was to start from end of string and if you encoumter a space, go from that index
to j which was set to end of string first and put that in stringbuilder. Update j to i which was index we started adding
to stringbuilder from and keep repeating the process.
*/
class Solution {
    public String reverseWords(String s) {
        int i = s.length()-1;
        int j = s.length()-1;
        StringBuilder sb = new StringBuilder();
        char word[] = s.toCharArray();
        while(i >= 0){
            while(word[i] != ' '){
                i--;
            }
            for(int k = i; k < j; k++){
                sb.append(word[k]);
            }
            sb.append(' ');
            j = i;
        }
        return sb.toString();
    }
}

//Found another solution on leetcode. 
/* split string by space to an array of words. Keep adding words to front of stringbuilder
*/
class Solution {
    public String reverseWords(String s) {
        String [] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int end = words.length - 1;
        for(int i = 0; i<= end; i++){
            if(!words[i].isEmpty()) {
                sb.insert(0, words[i]);
                if(i < end){
                    sb.insert(0, " ");
                }
            }
        }
        return sb.toString();
    }
}