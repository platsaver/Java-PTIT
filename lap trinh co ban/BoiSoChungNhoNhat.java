import java.math.BigInteger;
import java.util.Scanner;

public class BoiSoChungNhoNhat {
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
            BigInteger LCM = ((a.multiply(b)).abs()).divide(gcd(a,b));
            System.out.println(LCM);
        }
        object.close();
    }
}
