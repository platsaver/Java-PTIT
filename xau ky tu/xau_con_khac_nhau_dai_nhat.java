import java.util.*; 

public class xau_con_khac_nhau_dai_nhat {
    public static boolean subset(String a, String b){ 
        if (a.length()!=b.length()){
            return false; 
        }
        for (int i=0; i<a.length(); i++){
            if (a.charAt(i)!=b.charAt(i)){
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
            String a = object.nextLine(); 
            String b = object.nextLine(); 
            if (!subset(a,b)){
                System.out.println(Math.max(a.length(), b.length())); 
            }
            else{
                System.out.println("-1");
            }
        }
        object.close();
    } 
}
