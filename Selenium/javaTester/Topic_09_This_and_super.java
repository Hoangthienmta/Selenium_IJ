package javaTester;

import java.util.Scanner;

public class Topic_09_This_and_super {
    String ten;
    float dai;
    float rong;
    //this không bị giới hạn, nếu thực sự cần truy xuất thông tin từ lớp thì đều xài được
    // ví dụ
//    public float banKinh;
//
//    public Topic_09_This_and_super(float banKinh) {
//        this.banKinh = banKinh;
//    }
//
//    public void tinhChuVi() {
//        //something do that
//    }
//
//    public void tinhDienTich() {
//        //something do that
//    }
//
//    public void inHinhTron() {
//        this.tinhChuVi();
//        this.tinhDienTich();
//        //Đấy, thấy chưa, hoàn toàn có thể xài nhé
//    }

    //Tiếp theo, ta có thể hoàn toàn dùng this để gọi đến một constructor khác
    public Topic_09_This_and_super() {
        ten = "text sample";
    }

    public Topic_09_This_and_super(float dai, float rong) {
        // Sử dụng this phải đầu tiền trong constructor
        this();
        this.dai = dai;
        this.rong = rong;
    }

    public Topic_09_This_and_super(float canh) {
        this(canh, canh);
    }

    //Từ khóa super, super để làm gì: Để gọi constructor của lớp cha hoặc truy cập thuộc tính của lớp cha
    public class Parent {
        String name = "ParentName";
        Parent() {
            System.out.println("Constructor of parent");
        }
    }

    public class Child extends Parent {
        String name = "ChildName";
        Child() {
            super();
            System.out.println("Constructor of child");
            //Lúc này in ra thì sẽ ra cả 2 text
        }

        public void showName() {
            System.out.println("Child name" +name);
            System.out.println("Parent name" +super.name);
        }
    }

}
