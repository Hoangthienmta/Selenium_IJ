package javaTester;

import java.util.Scanner;

public class Topic_08_Constructor {
    //Constructor: bản chất nó là 1 phuong thuc, phuong thuc khoi tao
    // Được goi đến khi sử dụng từ khóa new, tác dụng để khởi tạo va chỉ được gọi đến một lần lúc dùng từ khóa new


    public Topic_08_Constructor() {

    }

    public Topic_08_Constructor(float r) {
        //something like that
    }

    // Trường hợp ko code thêm gì, khi thực hiện dùng từ khóa new là đã mặc định đã tạo một constructor mặc định

    //Kế thừa - extends
    // 1. Mot lop chi được kế thừa 1 lớp cha
    // 2. Nếu không khai báo kế thừa -> đang kế thừa lớp object
    // Một lớp thì có thể có nhiều class
    public final float PI = 3.14f;
    public String ten;
    public String chuVi;
    public String dienTich;
    public class HinhHoc {
        public final float PI = 3.14f;
        public String ten;
        public String chuVi;
        public String dienTich;
        public void xuatTen() {
            System.out.println("\n\n===== " + ten + " =====");
        }

        public void inChuVi() {
            System.out.println("Chu vi = " + chuVi);
        }

        public void inDienTich() {
            System.out.println("Diện tích = " + dienTich);
        }
    }

    public class HinhTron extends HinhHoc {
        public float banKinh;
        public HinhTron() {
            ten = "Hinh tron";
        }

        public void nhapBanKinh() {
            System.out.println("Bán kính = ");
            Scanner scanner = new Scanner(System.in);
            banKinh = scanner.nextFloat();
        }
    }

    public static void main(String[] args) {

    }



}
