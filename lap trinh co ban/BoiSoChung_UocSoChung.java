import java.util.Scanner; 

public class BoiSoChung_UocSoChung {
    public static long gcd(long a, long b){
        if (b==0){
            return a; 
        }
        else{
            return (gcd(b,a%b)); 
        }
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt(); 
        while (t-->0){
            long a = object.nextInt(); 
            long b = object.nextInt();
            long lcm = Math.abs(a*b)/gcd(a,b);  
            System.out.println(lcm+" "+gcd(a,b)); 
        }
        object.close(); 
    }
}