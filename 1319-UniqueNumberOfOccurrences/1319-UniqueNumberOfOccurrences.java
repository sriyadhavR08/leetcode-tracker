// Last updated: 7/9/2026, 10:03:14 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        int n = arr.length;
        int[] freq = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            int found = 0;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    found = 1;
                    break;
                }
            }

            if (found == 0) {

                for (int k = 0; k < index; k++) {
                    if (freq[k] == count) {
                        return false;
                    }
                }

                freq[index] = count;
                index++;
            }
        }

        return true;
    }
}