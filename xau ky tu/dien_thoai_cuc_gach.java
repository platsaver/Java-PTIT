import java.util.*; 

public class dien_thoai_cuc_gach {
    public static char convert(char x){
        if ("ABC".indexOf(x) > -1) return '2'; 
        if ("DEF".indexOf(x) > -1) return '3'; 
        if ("GHI".indexOf(x) > -1) return '4'; 
        if ("JKL".indexOf(x) > -1) return '5'; 
        if ("MNO".indexOf(x) > -1) return '6'; 
        if ("PQRS".indexOf(x) > -1) return '7'; 
        if ("TUV".indexOf(x) > -1) return '8'; 
        return '9'; 
    }
    public static boolean isReversible(char c[], int n){
        for (int i=0; i<n; i++){
            if (c[i]!=c[n-i-1]){
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt(); 
        object.nextLine(); 
        while(t-->0){
            String s = object.nextLine().toUpperCase();
            char c[] = new char[s.length()]; 
            for (int i=0; i<s.length(); i++){
                c[i] = convert(s.charAt(i)); 
            }
            if (isReversible(c, c.length)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        object.close(); 
    }
}
