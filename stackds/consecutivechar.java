package stackds;
import java.util.Stack;
public class consecutivechar {
    public static void main(String[] args) {
        String str="aabcad";
        import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (!st.isEmpty() && st.peek() == ch) {
                st.pop(); // Remove duplicate
            } else {
                st.push(ch); // Add character
            }
        }

        // Convert stack to string
        StringBuilder ans = new StringBuilder();

        for (char c : st) {
            ans.append(c);
        }

        return ans.toString();
    }
}