package javaTester;

public class Topic_16_Ep_kieu {
    protected String ten;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void xuatThongTin() {
        System.out.println("Nhân viên có ten la " + getTen());
    }

    public static void main(String[] args) {
        Topic_16_Ep_kieu tp = new Topic_16_Ep_kieu();
        Topic_16_Ep_kieu tp1 = new Topic_16_Ep_kieu();
        tp.setTen("Hung");
        tp1.setTen("Hai");
        tp.xuatThongTin();
        tp1.xuatThongTin();
        tp = tp1;
        tp.xuatThongTin();
        tp1.xuatThongTin();
//        Nhân viên có ten la Hung
//        Nhân viên có ten la Hai
//        Nhân viên có ten la Hai
//        Nhân viên có ten la Hai
        //Thấy có điều gì cấn cấn chưa, chua thì xem tiếp
        tp1.setTen("Nam");
        tp.xuatThongTin();
        tp1.xuatThongTin();
        //Câu hỏi là tại sao tôi chỉ set tp1 là Nam nhung ông 1 vẫn là Nam nhỉ
        // Từ khi có phép gán dối tượng, 2 ối tợng này sẽ ép kiểu dữ liệu và cả tham chiếu, nên khi thay đổi
        //1 ông thì ông cofn lại cũng đổi theo

    }
}
