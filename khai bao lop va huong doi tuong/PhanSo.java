import java.util.Scanner; 
public class PhanSo{
    public static long gcd(long a, long b){
        if (b==0){
            return a; 
        }
        else{
            return gcd(b,a%b); 
        }
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        long tuso = object.nextLong(); 
        long mauso = object.nextLong();
        long gcdValue = gcd(tuso,mauso);
        long phantu = tuso/gcdValue; 
        long phanmau = mauso/gcd(tuso,mauso); 
        System.out.print(phantu+"/"+phanmau); 
        object.close();  
    }
}