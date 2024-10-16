import java.util.Scanner; 

public class boi_so_nho_nhat_cua_so_nguyen_duong_dau_tien {
    private static long gcd(long a, long b){
        if (b==0){
            return a; 
        }
        else{
            return gcd(b,a%b); 
        }
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt(); 
        while (t-->0){
            int n = object.nextInt(); 
            long temp=1; 
            for (int i=1; i<=n; i++){
                temp = Math.abs(temp*i)/gcd(temp,i);
            }
            System.out.println(temp); 
        }
        object.close(); 
    }
}
