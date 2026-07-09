// Last updated: 7/9/2026, 10:04:06 AM
class Solution {

    private void solve(int idx, String s,
                       StringBuilder curr,
                       List<String> ans) {

        if (idx == s.length()) {
            ans.add(curr.toString());
            return;
        }

        char ch = s.charAt(idx);

        if (Character.isDigit(ch)) {
            curr.append(ch);
            solve(idx + 1, s, curr, ans);
            curr.deleteCharAt(curr.length() - 1);
            return;
        }

        curr.append(Character.toLowerCase(ch));
        solve(idx + 1, s, curr, ans);
        curr.deleteCharAt(curr.length() - 1);

        curr.append(Character.toUpperCase(ch));
        solve(idx + 1, s, curr, ans);
        curr.deleteCharAt(curr.length() - 1);
    }

    public List<String> letterCasePermutation(String s) {

        List<String> ans = new ArrayList<>();

        solve(0, s, new StringBuilder(), ans);

        return ans;
    }
}