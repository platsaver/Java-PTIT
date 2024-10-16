import java.util.*; 
import java.math.BigInteger; 

public class hieu_so_nguyen_lon_2 {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        BigInteger a = object.nextBigInteger(); 
        BigInteger b = object.nextBigInteger(); 
        System.out.println(a.subtract(b));
        object.close(); 
    }
}
