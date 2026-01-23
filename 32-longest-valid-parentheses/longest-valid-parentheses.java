class Solution {
    public int longestValidParentheses(String s) {
        int[] dp = new int[s.length()];
    int max = 0;

    for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i) == ')') {
            int prev = i - dp[i - 1] - 1;
            if (prev >= 0 && s.charAt(prev) == '(') {
                dp[i] = dp[i - 1] + 2 + (prev > 0 ? dp[prev - 1] : 0);
                max = Math.max(max, dp[i]);
            }
        }
    }
    return max;
    }
}