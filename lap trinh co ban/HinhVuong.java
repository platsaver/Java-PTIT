import java.util.*;
public class HinhVuong {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        int array[][] = new int[2][4];
        for (int i=0;i<2; i++){
            for (int j=0; j<4; j++){
                array[i][j] = object.nextInt();
            }
        }
        int x1 = Math.min(array[0][0], array[1][0]);
        int y1 = Math.min(array[0][1], array[1][1]);
        int x2 = Math.max(array[0][2], array[1][2]);
        int y2 = Math.max(array[0][3], array[1][3]);
        int h = Math.max(x2-x1,y2-y1);
        System.out.println(h*h);
        object.close();
    }
}
