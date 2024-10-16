import java.util.Scanner; 
public class TongNsoNguyenDuongDauTien{
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt(); 
        while (t-->0){
            long n = object.nextInt();
            if (n>0){
                long tong = (n/2)*n+(n/2); 
                System.out.println (tong);
            }
        }
        object.close();
    }
}