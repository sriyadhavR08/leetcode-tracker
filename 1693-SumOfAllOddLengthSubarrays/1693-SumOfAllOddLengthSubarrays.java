// Last updated: 7/9/2026, 10:02:52 AM
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0 ;
        int count = 0 ;
        for( int i = 0 ; i < arr.length ; i ++ ){
            for( int j = i ; j < arr.length ; j ++){
                if( ((j - i ) + 1) % 2 != 0 ){
                   for( int k = i ; k <= j ; k ++){
                    sum = sum + arr[k] ;
                   }
                }
            }
        }
        return sum  ;
    }
}