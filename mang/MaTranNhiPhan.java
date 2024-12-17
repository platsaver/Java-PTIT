import java.util.Scanner;

public class MaTranNhiPhan {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        int n = object.nextInt();
        int array[] = new int[3];
        int count=0;
        for (int i=0; i<n; i++){
            int sum=0; 
            for (int j=0; j<3; j++){
                array[j]=object.nextInt();
                sum+=array[j];
            }
            if (sum>1){
                count++;
            }
        }
        System.out.println(count);
        object.close();
    }
}
