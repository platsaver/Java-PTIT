import java.util.*; 
import java.math.BigInteger; 

public class tong_so_nguyen_lon_1 {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt(); 
        while (t-->0){
            BigInteger a = object.nextBigInteger(); 
            BigInteger b = object.nextBigInteger(); 
            BigInteger result = a.add(b); 
            System.out.println(result); 
        }
        object.close(); 
    }
}
