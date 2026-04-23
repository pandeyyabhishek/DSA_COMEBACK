
import java.util.*;

public class Q3_Longest_Substring_Without_RepeatingCharacters {

    public static void main(String[] args) {
        System.out.println("e");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // count the longest substring without repeating characters...

        // naive approach..
        // i will generate all the substrings and then check the condns
        int maxCnt = 0;
        for (int i = 0; i < s.length(); i++) {
            int arr[] = new int[26];
            int cnt = 0;
            for (int j = i; j < s.length(); j++) {
                int ind = s.charAt(j) - 'a';
                if (arr[ind] > 0) {
                    break;
                }
                arr[ind]++;
                cnt++;
                maxCnt = Math.max(cnt, maxCnt);
            }
        }
        return maxCnt;
    }

}

/*
 * Given a string s, find the length of the longest substring without duplicate
 * characters.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3. Note that "bca" and
 * "cab" are also correct answers.
 * Example 2:
 * 
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * 
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a
 * substring.
 * 
 * 
 * Constraints:
 * 
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */