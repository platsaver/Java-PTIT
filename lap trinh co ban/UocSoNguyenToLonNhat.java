import java.util.Scanner;

public class UocSoNguyenToLonNhat {
    public static long res(long n){
        while (n%2==0){
            n/=2;
        }
        for (int i=3; i<=(int)Math.sqrt(n); i++){
            while (n%i==0){
                n/=i;
            }
        }
        if (n>2){
            return n; 
        }
        else{
            return 2;
        }
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        int t = object.nextInt();
        while (t-->0){
            long n = object.nextLong();
            System.out.println(res(n));
        }
    }
}
