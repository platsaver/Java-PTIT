import java.util.*; 

public class chuan_hoa_xau_ky_tu_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); sc.nextLine(); 
        while (n-- > 0){ 
            String[] arr = sc.nextLine().trim().toLowerCase().split("\\s+"); 
            for (int i = 1; i < arr.length - 1; i++){ 
                System.out.print(String.valueOf(arr[i].charAt(0)).toUpperCase()+arr[i].substring(1)+" "); 
            } 
            System.out.print(String.valueOf(arr[arr.length-1].charAt(0)).toUpperCase()+arr[arr.length-1].substring(1)+", "); 
            System.out.println(arr[0].toUpperCase()); 
        }
        sc.close();
    }
}