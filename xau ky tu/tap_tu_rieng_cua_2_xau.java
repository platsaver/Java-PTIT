import java.util.*; 

public class tap_tu_rieng_cua_2_xau {
    public static void main(String[] args){
        Scanner object = new Scanner (System.in); 
        int t = object.nextInt(); 
        object.nextLine(); 
        while (t-->0){
            Set<String> st = new HashSet<>(); 
            String s1[] = object.nextLine().split("\\s"); 
            String s2 = object.nextLine(); 
            for (String word : s1){
                if (!s2.contains(word)){
                    st.add(word); 
                }
            }
            for (String i : st){
                System.out.print(i+" "); 
            }
            System.out.println(""); 
        }
        object.close(); 
    }
}
