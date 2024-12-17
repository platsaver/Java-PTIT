import java.util.*;
public class SoChinhPhuong {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        int t = object.nextInt();
        while (t-->0){
            long n = object.nextLong();
            if (n%Math.sqrt(n)==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        object.close();
    }
}
