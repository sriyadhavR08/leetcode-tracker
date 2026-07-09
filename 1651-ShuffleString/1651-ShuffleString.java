// Last updated: 7/9/2026, 10:02:57 AM
class Solution {
    public String restoreString(String s, int[] indices) {
		char temp[] = new char[indices.length];
		for (int i = 0; i < indices.length; i++) {
			temp[indices[i]] = s.charAt(i);
		}
		return new String(temp);
	}
}