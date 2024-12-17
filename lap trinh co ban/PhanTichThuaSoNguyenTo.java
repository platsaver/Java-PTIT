import java.util.Scanner;

public class PhanTichThuaSoNguyenTo {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        int t = object.nextInt();
        for (int j=1; j<=t; j++){
            int n = object.nextInt();
            System.out.print("Test "+j+": ");
            for (int i=2; i<=Math.sqrt(n)+1; i++){
                int count=0; 
                while (n%i==0){
                    n/=i; 
                    count++; 
                }
                if (count>0){
                    System.out.print(i+"("+count+") ");
                }
            }
            if (n>1){
                System.out.print(n+"(1)");
            }
            System.out.println();
        }
    }
}
