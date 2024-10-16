import java.util.*;

public class khai_bao_lop_nhan_vien {
    public static class NhanVien{
        String maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHopDong; 
        public void input(){
            Scanner object = new Scanner(System.in); 
            maNV = "00001"; 
            hoTen = object.nextLine(); 
            gioiTinh = object.nextLine(); 
            ngaySinh = standardize(object.nextLine()); 
            diaChi = object.nextLine(); 
            maSoThue = object.nextLine(); 
            ngayKyHopDong = standardize(object.nextLine()); 
            object.close(); 
        }
        public String standardize(String ngaySinh){
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
            System.out.printf("%s %s %s %s %s %s %s",maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHopDong); 
        }
    }
    public static void main(String[] args){
        NhanVien nv = new NhanVien(); 
        nv.input(); 
        nv.output();
    }
}
