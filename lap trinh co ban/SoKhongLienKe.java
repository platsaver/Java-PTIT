import java.util.Scanner;

public class SoKhongLienKe {
    public static boolean Check(String s){
        for (int i=0; i<s.length()-1; i++){
            int x = Math.abs(s.charAt(i)-s.charAt(i+1));
            if (x!=2){
                return false; 
            }
        }
        return true; 
    }
    public static boolean Check10(String s){
        int sum=0;
        long n = Long.valueOf(s);
        while (n>0){
            sum+=n%10; 
            n/=10;
        }
        if (sum%10==0){
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
            if (Check(s) && Check10(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        object.close();
    }
}
