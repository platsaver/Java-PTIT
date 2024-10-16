import java.util.*; 

public class khai_bao_lop_hinh_chu_nhat{
    public static class Rectangle{
        int chieuDai, chieuRong; 
        String color; 
        public void input(){
            Scanner object = new Scanner(System.in); 
            chieuDai = object.nextInt(); 
            chieuRong = object.nextInt();  
            color = standardize(object.nextLine()); 
            object.close();
        }
        public String standardize(String color){
            if (color==null || color.isEmpty()) return color; 
            return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
            //Extracts a substring from beginIndex (inclusive) to endIndex (exclusive).
            //the ".substring" method is a powerful tool for extracting parts of a string
        }
        public void output(){
            System.out.printf("%s %s %s%n", (chieuDai+chieuRong)*2, (chieuDai*chieuRong), color); 
            // %n to ensure the result on a new line
        }
    }
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(); 
        rectangle.input(); 
        rectangle.output(); 
    }
}