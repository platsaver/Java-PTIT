import java.util.*; 

public class BoSungDaySo {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        int n = object.nextInt(); 
        int last = 0; 
        int count = 0; 
        int array[] = new int[n];
        for (int i=0; i<n; i++){
            array[i] = object.nextInt();
            if (last+1==array[i]){
                last = array[i]; 
                continue; 
            }
            else{
                count++; 
                for (int j=last+1; j<array[i]; j++){
                    System.out.println(j);
                }
                last = array[i];
            }
        }
        if (count==0){
            System.out.println("Excellent!");
        }
        object.close();
    }
}
