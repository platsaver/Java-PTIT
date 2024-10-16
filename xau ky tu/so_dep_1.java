import java.util.*; 

public class so_dep_1 {
    public static boolean isReversibleAndEven(String n){
        for (int i=0; i<n.length(); i++){
            if (n.charAt(i)!=n.charAt(n.length()-i-1)){
                return false; 
            }
            if ((n.charAt(i)-'0')%2!=0){
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt();
        object.nextLine(); 
        while (t-->0){
            String n = object.nextLine(); 
            if (isReversibleAndEven(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO"); 
            }
        }
        object.close(); 
    }
}
