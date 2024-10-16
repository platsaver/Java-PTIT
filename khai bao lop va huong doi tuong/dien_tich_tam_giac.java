import java.util.*; 

public class dien_tich_tam_giac {
    public static class Point{
        double x,y; 
        public Point(double a, double b){
            x=a; 
            y=b; 
        }
        public static Point nextPoint(Scanner object){
            Point a = new Point(object.nextDouble(), object.nextDouble()); 
            return a; 
        }
    }
    public static double distance(Point a, Point b){
        return Math.sqrt(Math.pow((a.x-b.x),2)+Math.pow((a.y-b.y),2));
    }
    public static class Triangle{
        double A,B,C; 
        public Triangle(Point a, Point b, Point c){
            A = distance(a,b); 
            B = distance(b,c); 
            C = distance(c,a); 
        }
        public boolean isValid(){
            double m = Math.max(A, Math.max(B, C));
            return 2*m < A + B + C;
        }
        public double getArea(){
            return Math.sqrt((A + B + C) * (A + B - C ) * (-A + B + C) * (A - B + C)) * 1/4;
        }
    }
        
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt(); 
        while (t-->0){
            Triangle a = new Triangle(Point.nextPoint(object), Point.nextPoint(object), Point.nextPoint(object)); 
            if (!a.isValid()){
                System.out.println("INVALID"); 
            }
            else{
                System.out.printf("%.2f\n",a.getArea()); 
            }
        }
    }
}