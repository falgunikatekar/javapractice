package stackds;

import java.util.Stack;

public class Solution {
    public int calPoints(String[] operations) {
        Stack <String> st=new stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            String val=operations[i];
            if(val>0){
                st.push(val);
            }
            else if(val=='C'){
                int cal=st.pop();

            }
            else if(val=='D'){
                int nval=st.peek();
                cal=2*nval;
                st.push(nval);
            }
            else if(val=='+'){
                while(st.size()!=0){
                    int top=st.peek();
                    sum+=top;
                }
            }
        }return sum;
    }
} {
    
}
