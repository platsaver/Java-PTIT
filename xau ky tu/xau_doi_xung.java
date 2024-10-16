import java.util.*; 

public class xau_doi_xung {
    public static boolean isReversibleAfterFixed(String s){
        int mismatch_element = 0; 
        for (int i=0; i<s.length()/2; i++){
            if (s.charAt(i)!=s.charAt(s.length()-i-1)){
                mismatch_element+=1; 
            }
        }
        if (mismatch_element==1){
            return true; 
        }
        else if (mismatch_element==0 && s.length()%2==1){
            return true; 
        }
        return false; 
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt(); 
        object.nextLine(); 
        while (t-->0){
            String s = object.nextLine();
            if (isReversibleAfterFixed(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO"); 
            }
        }
        object.close(); 
    }
}
