/*
 * LeetCode: 151. Reverse Words in a String
 * Approach: Two Pointers + StringBuilder
 *
 * 1. Traverse the string from right to left.
 * 2. Skip leading and multiple spaces.
 * 3. Use two pointers to identify each word.
 * 4. Append each word to StringBuilder in reverse order.
 * 5. Add a single space between words.
 * 6. Return the resulting string.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Strings;

public class ReverseWordsInString {
     public String reverseWords(String s) {
        StringBuilder ans= new StringBuilder();
        int i=s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0){
                break;
            }
            int j=i;
            while(j>=0 && s.charAt(j)!=' '){
                j--;
            }
            ans.append(s.substring(j+1,i+1));
            while(j>=0 && s.charAt(j)==' '){
                j--;
            }
            if(j>=0){
                ans.append(' ');
            }
            i=j;
        }
        return ans.toString();
    }
}
