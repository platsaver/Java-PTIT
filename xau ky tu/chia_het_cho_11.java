import java.util.*; 
import java.math.BigInteger; 

public class chia_het_cho_11 {
    public static void main(String[] args){
        Scanner object = new Scanner (System.in); 
        int t = object.nextInt(); 
        while (t-->0){
            BigInteger n = object.nextBigInteger(); 
            BigInteger result = n.mod(new BigInteger("11")); 
            if (result.signum()==0){
                System.out.println("1"); 
            }
            else{
                System.out.println("0"); 
            }
        }
        object.close(); 
    }
}
