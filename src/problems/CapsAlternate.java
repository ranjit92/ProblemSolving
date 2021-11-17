package problems;

public class CapsAlternate {
    public static void main(String[] args) {
        String s = "aaaaaaaaa bb";
        int count =1;
        for(int i=0; i < s.length(); i++){
            if(!String.valueOf(s.charAt(i)).equals(" ")){

                if(count % 2 != 0){

                    System.out.print(String.valueOf(s.charAt(i)).toUpperCase());
                }
                else
                    System.out.print(String.valueOf(s.charAt(i)));
                count++;
            }
            else
             System.out.print(" ");

        }
    }



}
