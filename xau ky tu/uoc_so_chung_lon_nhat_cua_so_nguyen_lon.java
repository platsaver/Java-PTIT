import java.math.BigInteger; 
import java.util.*; 

public class uoc_so_chung_lon_nhat_cua_so_nguyen_lon{
    public static BigInteger gcd(BigInteger a, BigInteger b){
        if (b.signum()==0){
            return a;             
        }
        else{
            return gcd(b,a.mod(b)); 
        }
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt(); 
        while (t-->0){
            BigInteger a = object.nextBigInteger(); 
            BigInteger b = object.nextBigInteger(); 
            System.out.println(gcd(a,b)); 
        }
        object.close(); 
    }
}