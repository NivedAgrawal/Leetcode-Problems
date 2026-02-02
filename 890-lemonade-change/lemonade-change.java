class Solution {
    int k5 = 0;
    int k10 = 0;
    public boolean lemonadeChange(int[] bills) {
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                k5++;
            }
            else if(bills[i]==10){
                if(k5<1) return false;
                k5--;
                k10++;
            }
            else{
                if(k10>0 && k5>0){
                     k10--;
                     k5--;
                }
                else if(k5>2){
                    k5 -= 3;
                }
                else{
                    return false;
                }
            }            
        }
        return true;
    }
}