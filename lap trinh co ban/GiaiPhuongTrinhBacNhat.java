import java.util.Scanner; 
public class GiaiPhuongTrinhBacNhat{
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int a = object.nextInt(); 
        int b = object.nextInt(); 
        if (a==0 && b!=0){
            System.out.println("VN"); 
        }
        else if (a==0 && b==0){
            System.out.println("VSN"); 
        }
        else if (b==0 && a!=0){
            System.out.println("0"); 
        }
        else{
            System.out.printf("%.2f", (float)-b/a); 
        }
        object.close(); 
    }
}