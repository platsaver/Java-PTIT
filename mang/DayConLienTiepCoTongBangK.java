import java.util.Scanner;

public class DayConLienTiepCoTongBangK {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        int t = object.nextInt();
        while (t-->0){
            int n = object.nextInt();
            long k = object.nextLong();
            long array[] = new long[n];
            for (int i=0; i<n; i++){
                array[i] = object.nextInt();
            }
            boolean check = false; 
            int l=0; 
            int r=0; 
            long sum = array[l];
            while (l<n){
                if (sum==k){
                    check = true; 
                    break;
                }
                else if (l==r || sum<k){
                    r++; 
                    if (r==n){
                        break; 
                    }
                    sum+=array[r];
                }
                else if (sum>k){
                    sum-=array[l];
                    l++;
                }
            }
            if (check){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        object.close();
    }
}
