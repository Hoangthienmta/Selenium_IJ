package javaTester;

public class Topic_10_Overriding {
    // Định nghĩa: Lớp con có thể khai báo các phương thức cùng với lớp cha, sau đó định nghĩa lại nội dung của
    // phương thức đó
    public class HinhTron {
        public void xuatThongTin() {
            System.out.println("Đây là hình tròn");
        }
    }

    // Các hàm overriding có sẵn ở đâu ví dụ như toString, equal hoặc các hàm liên quan đến nhập xuất file

    public class HinhTru extends HinhTron {
        @Override
        public void xuatThongTin() {
            System.out.println("Đây là hình trụ");
        }
    }

    //Lớp object là gì?
    // Nếu không khẳng định lớp cha, thì hệ thống mặc định lớp cha của nó là lớp object
    // Vậy tại sao phải dùng lớp object làm gì?
    // Là lớp cơ sở chứa giá trị chung để các lớp còn lại sử dụng, việc chưa biết đối tượng này sử dụng là gì
    // thì cứ khai báo và sau đó có thể ép kiểu sau
    String a = "a";
    String b = "b";
    boolean compare = a.equals(b);
    // Chuỗi là kiểu đối tượng nè, tham số truyền vào của method equal là object







}
