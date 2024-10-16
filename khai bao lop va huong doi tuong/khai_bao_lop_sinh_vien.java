import java.util.*; 

public class khai_bao_lop_sinh_vien {
    public static class SinhVien{
        String maSV, hoTen, lop, ngaySinh; 
        float gpa; 
        public void input(){
            Scanner object = new Scanner(System.in); 
            maSV = "B20DCCN001"; 
            hoTen = object.nextLine(); 
            lop = object.nextLine(); 
            ngaySinh = standardize(object.nextLine()); 
            gpa = object.nextFloat();
            object.close(); 
        }
        public String standardize (String ngaySinh){
            String array[] = ngaySinh.split("/"); 
            if (array[0].length()==1){
                array[0] = "0" + array[0]; 
            }
            if (array[1].length()==1){
                array[1] = "0" + array[1]; 
            }
            return array[0] + "/" + array[1] + "/" + array[2]; 
        }
        public void output(){
            System.out.printf("%s %s %s %s %.2f", maSV, hoTen, lop, ngaySinh, gpa); 
        }
    }
    public static void main(String[] args){
        SinhVien sv =  new SinhVien(); 
        sv.input(); 
        sv.output(); 
    }
}
