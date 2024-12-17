import java.util.Scanner;

public class ChiaTamGiac {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        int t = object.nextInt();
        while (t-->0){
            int n = object.nextInt();
            double h = object.nextDouble();
            for (int i=1; i<n; i++){
                System.out.printf("%.6f ",h*Math.sqrt(i)/Math.sqrt(n));
            }
            System.out.println();
        }
        object.close();
    }
}
