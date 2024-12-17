import java.util.Scanner;

public class TongUocSo1 {
    public static long f[] = new long[2000001]; 
    public static void main(String[] args){
        for (int i=0; i<2000001; i++){
            f[i] = 0; 
            boolean ok = true; 
            for (int j=2; j<=(int)Math.sqrt(i); j++){
                if (i%j==0){
                    f[i] = f[j] + f[i/j]; 
                    ok = false; break; 
                }
            }
            if (ok){
                f[i]=i; 
            }
        }
        Scanner object = new Scanner(System.in);
        int t = object.nextInt();
        long sum=0; 
        while (t-->0){
            int n = object.nextInt();
            sum+=f[n];
        }
        System.out.println(sum); 
        object.close();
    }
}
