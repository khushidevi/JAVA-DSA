/*
 * LeetCode: 1047. Remove All Adjacent Duplicates in String
 * Approach: StringBuilder + Stack
 *
 * 1. Create an empty StringBuilder to act as a stack.
 * 2. Traverse the string character by character.
 * 3. Check if the current character matches the last character in StringBuilder.
 * 4. If they match, remove the last character.
 * 5. Otherwise, append the current character to StringBuilder.
 * 6. Return the resulting string after removing all adjacent duplicates.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Strings;

public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ans.length()>0 && ans.charAt(ans.length()-1)==ch){
                ans.deleteCharAt(ans.length()-1);
            }
            else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
