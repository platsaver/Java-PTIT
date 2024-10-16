import java.util.Scanner; 
public class ChuSoThu4VaThu7 {
    public static void main(String[] args){
        Scanner object = new Scanner (System.in); 
        String N = object.nextLine();
        int CountNumber4 = 0; 
        int CountNumber7 = 0;  
        for (int i=0; i<N.length(); i++){
            char considered = N.charAt(i); 
            if (considered=='4'){
                CountNumber4++; 
            }
            else if (considered=='7'){
                CountNumber7++; 
            }
        }
        if (CountNumber4+CountNumber7==4||CountNumber4+CountNumber7==7){
            System.out.println("YES");  
        }
        else{
            System.out.println("NO"); 
        } 
        object.close(); 
    }
}
