import java.util.*; 

public class tong_phan_so{
    public static long gcd(long a, long b){
        if (b==0) return a; 
        else{
            return gcd(b,a%b); 
        }
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        long tuso1 = object.nextLong();
        long mauso1 = object.nextLong(); 
        long tuso2 = object.nextLong(); 
        long mauso2 = object.nextLong(); 
        long gcd1 = gcd(tuso1, mauso1); 
        long gcd2 = gcd(tuso2, mauso2); 
        tuso1/=gcd1;
        tuso2/=gcd2; 
        mauso1/=gcd1; 
        mauso2/=gcd2; 
        long new_mauso = (mauso1*mauso2)/gcd(mauso1, mauso2); 
        long new_tuso = tuso1*(new_mauso/mauso1)+tuso2*(new_mauso/mauso2);
        long new_gcd = gcd(new_tuso, new_mauso); 
        new_tuso/=new_gcd; 
        new_mauso/=new_gcd; 
        System.out.println(new_tuso+"/"+new_mauso);  
        object.close();    
    }
}