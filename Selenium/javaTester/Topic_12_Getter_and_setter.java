package javaTester;

public class Topic_12_Getter_and_setter {
    //Getter và setter liên quan đến một đặc tính gói ghém dữ liệu - encapsulation
    private final float PI = 3.14f;
    private float banKinh;
    private float chuVi;// được khai báo private, các lớp khác không thể thay đổi được , chỉ có lớp hình tròn có quyền
    //thay đổi
    private float dienTich;

    private String ten;
    private int tuoi;

    public Topic_12_Getter_and_setter(String ten, int tuoi) {
        setTen(ten);
        setTuoi(tuoi);
    }

    // ở đây các lớp setter có thể thêm một vài thành phần vào để có thể truyền vào hoặc ràng buộc logic
    private void setTen(String ten) {
        if(ten == null || ten.isEmpty()) {
            this.ten = "Chưa có dữ liệu";
        } else {
            this.ten = ten;
        }
    }

    public String getTen() {
        return ten;
    }

    private void setTuoi(int tuoi) {
        if(tuoi<0) {
            this.tuoi = -1;
        } else {
            this.tuoi = tuoi;
        }
    }

    public Topic_12_Getter_and_setter(float banKinh) {
        this.banKinh = banKinh;
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }


    public static void main(String[] args) {
        Topic_12_Getter_and_setter st = new Topic_12_Getter_and_setter(2);
        st.tinhChuVi();
        st.tinhDienTich();
    }
}
