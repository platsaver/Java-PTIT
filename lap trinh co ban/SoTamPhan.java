import java.util.Scanner;

public class SoTamPhan {
    public static boolean check(String s){
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)!='0' && s.charAt(i)!='1' && s.charAt(i)!='2'){
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
            if (check(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        object.close();
    }
}
