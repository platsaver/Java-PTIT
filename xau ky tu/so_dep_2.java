import java.util.*;

public class so_dep_2 {
    public static boolean isReversible(String n){
        for (int i=0; i<n.length(); i++){
            if (n.charAt(i)!=n.charAt(n.length()-i-1)){
                return false; 
            }
        }
        return true; 
    }
    public static boolean StartAndEndWith8(String n){
        if (n.charAt(0)=='8' && n.charAt(n.length()-1)=='8'){
            return true; 
        }
        else{
            return false; 
        }
    }
    public static boolean DividedBy10(String n){
        int sum = 0; 
        for (char c: n.toCharArray()){
            sum+=c-'0'; 
        }
        if (sum%10==0){
            return true; 
        }
        return false; 
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt();
        object.nextLine(); 
        while (t-->0){
            String n = object.nextLine(); 
            if (isReversible(n) && StartAndEndWith8(n) && DividedBy10(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO"); 
            }
        }
        object.close(); 
    }
}
