import java.util.*; 

public class khai_bao_lop_thi_sinh {
    public static class SinhVien{
        String hoTen, ngaySinh; 
        float diemMon1, diemMon2, diemMon3; 
        public void input(){
            Scanner object = new Scanner(System.in); 
            hoTen = object.nextLine(); 
            ngaySinh = standardize(object.nextLine()); 
            diemMon1 = object.nextFloat(); 
            diemMon2 = object.nextFloat(); 
            diemMon3 = object.nextFloat(); 
            object.close();
        }
        public void output(){
            float tongDiem = diemMon1 + diemMon2 + diemMon3; 
            System.out.printf("%s %s %s", hoTen, ngaySinh, tongDiem);
        }
        private String standardize(String ngaySinh){
            String a[] = ngaySinh.split("/"); 
            if (a[0].length()==1){
                a[0] = "0" + a[0]; 
            }
            if (a[1].length()==1){
                a[1] = "0" + a[1]; 
            }
            return a[0] + "/" + a[1] + "/" + a[2];
        }
    }
    public static void main(String[] args){
        SinhVien sv = new SinhVien(); 
        sv.input(); 
        sv.output();
    }
}
