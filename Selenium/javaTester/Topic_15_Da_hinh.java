package javaTester;

public class Topic_15_Da_hinh {
    public static class HinhHoc{
        public void tinhDienTich() {
            System.out.println("Chưa biết hình nào");
        }
    }

    public static class HinhTron extends HinhHoc {
        @Override
        public void tinhDienTich() {
            System.out.println("Hình tròn chứ còn gi");
        }
    }

    public static class HinhVuong extends HinhHoc {
        @Override
        public void tinhDienTich() {
            System.out.println("Hình vuong chứ còn gi");
        }
    }

    public static void main(String[] args) {
        HinhHoc hinhHoc = new HinhHoc();
        hinhHoc.tinhDienTich();
        hinhHoc = new HinhTron();
        hinhHoc.tinhDienTich();
        //Đại khái cùng là một đối tượng
    }



}
