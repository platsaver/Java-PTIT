import java.util.*; 

public class tinh_thu_nhap_giao_vien {
    public static class GiaoVien{
        String maNgach, ten;
        int luongCoBan, phuCap, thuNhap, bacLuong;
        public void input(){
            Scanner object = new Scanner(System.in); 
            maNgach = object.nextLine(); 
            ten = object.nextLine(); 
            luongCoBan = object.nextInt();
            if (maNgach.substring(0, 2).equals("HT")){
                phuCap = 2000000; 
            }
            else if (maNgach.substring(0,2).equals("HP")){
                phuCap = 900000; 
            }
            else if (maNgach.substring(0,2).equals("GV")){
                phuCap = 500000; 
            }
            bacLuong = (maNgach.charAt(2)-'0')*10 + maNgach.charAt(3) - '0';
            thuNhap = bacLuong*luongCoBan + phuCap;  
            object.close();
        } 
        public void output(){
            System.out.printf("%s %s %s %s %s", maNgach, ten, bacLuong, phuCap, thuNhap); 
        }
    }
    public static void main(String[] args){
        GiaoVien gv = new GiaoVien(); 
        gv.input(); 
        gv.output(); 
    }
}
