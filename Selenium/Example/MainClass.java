package Example;

public class MainClass {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Đây là sêp");
        sep.setLoaiChucVu(Config.NHAN_VIEN_SEP);
        sep.tinhLuong();
        sep.xuatThongTin();
    }
}
