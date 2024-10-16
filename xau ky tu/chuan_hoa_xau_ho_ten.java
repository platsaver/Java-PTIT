import java.util.*; 

public class chuan_hoa_xau_ho_ten {
    public static String edit(String s){
        String s1 = s.substring(0,1); 
        String s2 = s.substring(1,s.length()); 
        s1 = s1.toUpperCase(); 
        return s1+s2; 
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt();
        object.nextLine();  //consumes the newline character left in the buffer after reading the integer. 
        while (t-->0){
            String s = object.nextLine(); 
            s = s.toLowerCase();
            s = s.replaceAll("\\s+"," ");
            s = s.trim(); 
            String word[] = s.split("\\s"); 
            for (String i : word){
                System.out.print(edit(i)+" "); 
            }  
            System.out.println(""); 
        }
        object.close();
    }
}
