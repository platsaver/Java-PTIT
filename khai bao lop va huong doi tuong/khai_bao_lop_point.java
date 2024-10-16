import java.util.Scanner; 

public class khai_bao_lop_point{
    public static class Point{
        double x; 
        double y; 
        public void get(Scanner object){
            x = object.nextDouble(); 
            y = object.nextDouble(); 
        }
    }
    public static double distance(Point a, Point b){
        return Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2)); 
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt(); 
        while (t-->0){
            Point a = new Point(); 
            Point b = new Point(); 
            a.get(object); 
            b.get(object); 
            System.out.printf("%.4f\n",distance(a,b));
        }
    }
}