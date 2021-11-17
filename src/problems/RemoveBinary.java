package problems;

import java.util.Arrays;

public class RemoveBinary {

    public static void main(String[] args) {

        //for(int i=0; i <= 3; i++){
        //    System.out.println(Integer.toBinaryString(i));
        //}


        String s = "khokha";
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr, (a,b) ->
            isPrime(Integer.parseInt(a))-isPrime(b));
        for(int i=0; i <s.length(); i++){
            int n = s.charAt(i);
            System.out.println(n +" "+ isPrime(n));
        }




    }


    public static boolean isPrime(Integer n){
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            return false;
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0)  {
                return true;
            }
        }//end of else
        return false;
    }
}
