import java.util.Scanner; 

public class UocSoChiaHetCho2 {
    public static long DivisorOfTwo(long n){
        int count=0; 
        int k = (int)Math.sqrt(n); 
        if (n%2!=1){
            for (int i=1; i<=k; i++){
                if (n%i==0){
                    if (i%2==0){
                        count++; 
                    }
                    if ((n/i)%2==0){
                        count++;  
                    }
                }
            }
            if (k*k==n && k%2==0){
                count--; 
            }
        }
        return count; 
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt(); 
        while (t-->0){
            long n = object.nextLong();
            System.out.println(DivisorOfTwo(n));  
        }
        object.close(); 
    }
}
