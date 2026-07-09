// Last updated: 7/9/2026, 10:01:33 AM
class Solution {
    public String trafficSignal(int timer) {
        if(timer == 0) return "Green";
        if(timer == 30) return "Orange";
        if(timer > 30 && timer <= 90) return "Red";
        return "Invalid";
    }
}