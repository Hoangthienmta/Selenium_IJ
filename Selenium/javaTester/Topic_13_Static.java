package javaTester;

public class Topic_13_Static {
    //static : Gọi đến thành phần của lớp thông qua tên lớp mà ko cần khởi tạo đối tượng của lớp
    private int tuoi = 22;
    private static int age;
    public static void main(String[] args) {
        Topic_13_Static tp = new Topic_13_Static();
        tp.tuoi =1;
        age = 10;
    }
    // Nếu đổi là static thì có thể gọi đến ngay mà ko cần khởi tạo đối tượng
}


// tại sao hàm main là static -> Để hệ thống có thể truy xuất thông qua lớp, chứ không khai báo instance
