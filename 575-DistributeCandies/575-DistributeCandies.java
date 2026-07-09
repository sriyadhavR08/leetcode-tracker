// Last updated: 7/9/2026, 10:04:56 AM
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
    for(int candy: candyType) {
        set.add(candy);
    }
    return Math.min(candyType.length / 2, set.size());
    }
}