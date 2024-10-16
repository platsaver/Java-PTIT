import java.util.Scanner; 
import java.util.Set; 
import java.util.TreeSet; 

public class giao_cua_hai_day_so{
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int n = object.nextInt(); 
        int m = object.nextInt(); 
        Set<Short> setA = new TreeSet<>(); 
        Set<Short> setB = new TreeSet<>(); 
        for (int i=0; i<n; i++){
            setA.add(object.nextShort()); 
        }
        for (int i=0; i<m; i++){
            setB.add(object.nextShort()); 
        }
        setA.retainAll(setB); 
        for (Short i:setA){
            System.out.print(i+" "); 
        }
        object.close(); 
    }
}