package javaTester;

public class Topic_18_Interface {
    // là mot ban thiet ke chua cac phuong thuc truu tuong
    // Câu hỏi là tại sao phải dùng trong khi nếu chỉ là overide thì có thể ghi đè từ lớp cha được
    // Có thể đa kế thừa, nếu ghi đè từ lớp cha thì chỉ có thể kế thừa tu 1 lớp cha mà thôi
    // Đong thoi khong can ke thua ms có thể sử dụng duojc, tiep theo nữa là phải triển khai các phương thức đc dinh nghĩa
    interface HinhHoc {
        float PI = 3.14f;
        float tinhChuVi();

        public class HinhTron implements HinhHoc {
            // interface thì sẽ xài implement nhé
            protected String ten;
            protected float banKinh;

            public HinhTron(float banKinh) {
                this.ten = "Hinh tron";
                this.banKinh = banKinh;
            }
            @Override
            public float tinhChuVi() {
                return banKinh*PI;
            }
        }
    }

    // Mac dinh là public, static va final
    // Các tình huống nào dùng abtract, cái nào dùng interface
    //VD như cần chia sẻ thuộc tính chung, như lớp động vật có thộc tính là name, và ví dụ như cần có hàm khởi tao cho viec truyen vào name
    // khi dó sẽ dung abstract la hop li

    // Con vi du như co thuoc tinh la bay va chạy
    // Xe hơi va may bay có thể định nghĩa lại các hành vi này


}
