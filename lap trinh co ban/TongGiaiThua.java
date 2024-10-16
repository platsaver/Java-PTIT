import java.util.Scanner; 

public class TongGiaiThua {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        int n = object.nextInt();
        long sum=0; 
        long product=1;  
        for (int i=1; i<=n; i++){
            product*=i; 
            sum+=product; 
        } 
        System.out.println(sum); 
        object.close(); 
    }
}
