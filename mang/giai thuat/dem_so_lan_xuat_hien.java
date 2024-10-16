import java.util.Scanner; 
import java.util.HashMap; 
import java.util.Map; 

public class dem_so_lan_xuat_hien {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt();
        int array[] = new int[1000]; 
        for (int j=1; j<=t; j++){
            System.out.printf("Test %d:\n", j); 
            int n = object.nextInt(); 
            for (int i=0; i<n; i++){
                array[i] = object.nextInt(); 
            }
            Map<Integer, Integer> m = new HashMap<Integer, Integer>(); //created to store the count of each integer
            for (int i=0; i<n; i++){
                if (m.get(array[i])==null){
                    m.put(array[i], 1); 
                    //If the integer is not already in the map (i.e., count is null), it adds it with a count of 1
                }
                else{
                    m.put(array[i], m.get(array[i])+1);
                    //If it is already in the map, it increments the count.
                }
            }
            for (int i=0; i<n; i++){
                if (m.get(array[i])>0){
                    System.out.printf("%d xuat hien %d lan\n", array[i], m.get(array[i]));
                    m.put(array[i], 0);  
                    //After printing, it sets the count of that integer to 0 in the map to avoid printing it again.
                }
            }
        }
        object.close(); 
    }
}
