/*
 * LeetCode: 443. String Compression
 * Approach: Two Pointers + Counting
 *
 * 1. Use readIndex to traverse the character array and writeIndex to update it.
 * 2. Store the current character and count its consecutive occurrences.
 * 3. Move readIndex forward while the characters are the same.
 * 4. Write the current character at writeIndex.
 * 5. If count is greater than 1, convert it into a string.
 * 6. Write each digit of the count into the character array.
 * 7. Return writeIndex as the new length of the compressed array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) auxiliary space
 */

package Strings;

public class StringCompression {
     public int compress(char[] chars) {
        int readIndex=0;
        int writeIndex=0;
        while(readIndex<chars.length){
            char currentChar=chars[readIndex];
            int count=0;
            while(readIndex< chars.length && currentChar == chars[readIndex]){
                readIndex++;
                count++;
            }
            chars[writeIndex]=currentChar;
            writeIndex++;
            if(count>1){
                String countStr=String.valueOf(count);
                for(char digit: countStr.toCharArray()){
                    chars[writeIndex]=digit;
                    writeIndex++;
                }
            }
        }
        return writeIndex;
    }
    
}
