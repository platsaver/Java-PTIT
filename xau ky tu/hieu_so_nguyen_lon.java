import java.math.BigInteger;
import java.util.*;  

public class hieu_so_nguyen_lon {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        int t = object.nextInt(); 
        while (t-->0){ 
            BigInteger x = object.nextBigInteger(); 
            BigInteger y = object.nextBigInteger();
            // BigInteger -> String -> Big Integer
            // This is used to include leading zero
            int max_length = Math.max(x.toString().length(), y.toString().length()); 
            BigInteger result = (x.subtract(y));
            BigInteger abs_result = result.abs(); 
            String answer = abs_result.toString();
            if (max_length>answer.length()){
                answer = "0" + answer; 
            }
            System.out.println(answer); 
        }
        object.close(); 
    }
}
