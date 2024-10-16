import java.util.*; 

public class danh_dau_chu_cai {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        String s = object.nextLine(); 
        Set<String> set = new HashSet<>(); 
        for (int i=0; i<s.length(); i++){
            String temp = s.charAt(i) + " "; 
            set.add(temp);   
        }
        System.out.println(set.size());
        object.close(); 
    }
}
