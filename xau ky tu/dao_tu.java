import java.util.*; 

public class dao_tu{
    public static String reverseFunction(String s){
        String reversedForm = ""; 
        for (int i=s.length()-1; i>=0; i--){
            reversedForm+=s.charAt(i);
        }
        return reversedForm; 
    }
    public static void main(String[] args){
        Scanner object = new Scanner (System.in); 
        int t= object.nextInt(); 
        object.nextLine(); 
        while (t-->0){
            String s = object.nextLine();
            String new_s[]= s.split(" "); 
            for (int i=0; i<new_s.length; i++){
                new_s[i] = reverseFunction(new_s[i]);
            }
            System.out.println(String.join(" ",new_s)); 
        }
        object.close();
    }
}