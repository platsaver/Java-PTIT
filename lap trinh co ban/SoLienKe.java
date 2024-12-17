import java.util.Scanner;

public class SoLienKe {
    public static boolean Check(String s){
        for (int i=0; i<s.length()-1; i++){
            int x = Math.abs(s.charAt(i)-s.charAt(i+1));
            if (x!=1){
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
            String s = object.nextLine();
            if (Check(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        object.close();
    }
}
