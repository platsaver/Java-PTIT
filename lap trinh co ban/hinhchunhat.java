import java.util.Scanner; 
public class hinhchunhat {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int a = object.nextInt(); 
        int b = object.nextInt(); 
        System.out.println((a+b)*2+" "+(a*b));
        object.close();
    }
}
