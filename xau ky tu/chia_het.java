import java.util.*; 
import java.math.BigInteger;

public class chia_het {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt(); 
        while (t-->0){
            BigInteger a = object.nextBigInteger(); 
            BigInteger b = object.nextBigInteger(); 
            if ((a.mod(b)).signum()==0 || (b.mod(a)).signum()==0){
                System.out.println("YES"); 
            }
            else{
                System.out.println("NO");
            }
        }
        object.close(); 
    }
}
