package javaTester;

public class Topic_11_Access_Modifier {
    private final float PI = 3.14f;
    private final float banKinh; // Lỗi vì chưa khởi tạo gia tri khi su dung final, chỉ không lỗi khi thêm param vào hàm khởi tạo

    //public -> Cho toàn bộ
    //private -> Chỉ trong lớp thôi
    //protected -> Lớp con hoặc cùng package
    private Topic_11_Access_Modifier(float banKinh) {
        this.banKinh = banKinh;
    }//Thuộc tinh này không được xài ở hàm main, có nghĩa sẽ ko khởi tạo được instance
    //Câu hỏi ơ đây là nếu constructor là private thif có cách nào gọi đc ở hàm main
    // -> Tạo một phương thức static
    private static Topic_11_Access_Modifier instaince;

    public static Topic_11_Access_Modifier getInstaince() {
        if(instaince == null) {
//            instaince = new Topic_11_Access_Modifier();
        }
        return instaince;
    }

    public void display() {
        System.out.println("Hello from MyClass!");
    }

    public static void main(String[] args) {
        Topic_11_Access_Modifier tps = Topic_11_Access_Modifier.getInstaince();
        // Khởi tạo thành công được instance này
        tps.display();
    }

    // Học về từ khóa final:
    // Ket hop static + final = Biến toàn cục (biến global)
    // Dùng cho các hằng số, tiết kiệm bộ nhớ vì không phai khoi tao doi tuong

    // Sẽ thế nào nếu phuwong thức là final -> Sẽ ko override được ở lớp con
    public final float tinhChuVi() {
        return 2 * PI * banKinh;
    }

    // Lớp final
    // Không the kế thừa lop final. Ví dụ muốn tạo ra mot lop mà chi cho người khác sử dụng nhưng không
    // không cho người khác kế thừa để override để tái su dung -> Ví vụ như String


}
