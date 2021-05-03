package problems.general;

import java.util.Stack;

public class OnePlus {
public static void main(String[] args) {
	OnePlus ob = new OnePlus();
	
	int[] arr = new int[] {1, 2, 3};
	ob.plusOne(arr);
}
	
	
	
	
	
 public int[] plusOne(int[] digits) {
        
        Stack<Integer> stack = new Stack<>();
        int carry = 0;
        for(int i = digits.length-1; i >= 0; i--){
            
            if(i == digits.length-1){
                if( digits[i]+1 >= 10){
                  stack.push((digits[i]+1) % 10);
                    carry = (digits[i]+1) / 10;
                }
                else
                    stack.push((digits[i]+1)); 
            }
            
           else if(i == 0 && carry >0){
                int sum = digits[i] + carry;
                 if( sum >= 10){
                     while(sum > 0){
                        stack.push(sum % 10);
                        sum = sum/ 10;
                     }
                }
               else
                stack.push(sum);
            }
            
            else if(carry > 0){
                int sum = digits[i] + carry;
                if( sum >= 10){
                  stack.push(sum % 10);
                    carry = sum/ 10;
                }
            }
            else{
                stack.push(digits[i]); 
            }
           
        }
        
        
        int[] result = new int[stack.size()];
        int size = stack.size();
       for(int i =0 ; i< size; i++){
           result[i] = stack.pop();
       }
        
        return result;
        
    }
}
