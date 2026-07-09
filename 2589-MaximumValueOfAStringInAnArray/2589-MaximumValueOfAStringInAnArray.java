// Last updated: 7/9/2026, 10:02:05 AM
class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;

        for (int i = 0; i < strs.length; i++) {
            boolean isNumber = true;

            for (int j = 0; j < strs[i].length(); j++) {
                char ch = strs[i].charAt(j);

                if (ch < '0' || ch > '9') {
                    isNumber = false;
                    break;
                }
            }

            int value;

            if (isNumber) {
                value = Integer.parseInt(strs[i]);
            } else {
                value = strs[i].length();
            }

            if (value > max) {
                max = value;
            }
        }

        return max;
    }
}