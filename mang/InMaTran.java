import java.util.*; 
public class InMaTran {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        int t = object.nextInt();
        while (t-->0){
            int n = object.nextInt();
            int array[][] = new int[n][n];
            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++){
                    array[i][j] = object.nextInt();
                }
            }
            int j=0; 
            for (int i=0; i<n; i++){
                if (j==0){
                    for (;j<n; j++){
                        System.out.print(array[i][j]+" ");
                    }
                    j = n-1; 
                }
                else{
                    for (;j>=0;j--){
                        System.out.print(array[i][j]+" ");
                    }
                    j=0;
                }
            }
            System.out.println();
        }
        object.close();
    }
}
