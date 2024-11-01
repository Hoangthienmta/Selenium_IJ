package javaTester;
public class Topic_02_Operator {
    private int Sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {

        Topic_02_Operator tp = new Topic_02_Operator();
        int so1 = 4;
        int so2 = 10;
        int ketQua = tp.Sum(so1++, so2);
        System.out.println("So 1 là: "+ so1 + " so 2 là: " + so2 + " sau do ket qua la " + ketQua);
        // so1++ thì thực hiện biểu thức, sau khi thực hiện biểu thức moi thực hiện tăng gia tri len 1 đon vị
        // ++so1 thì tăng giá trị đó lên trước, sau đó mới thực hiện biểu thức tương ứng
    }

    // Note: static thuộc về class chứ không thuộc về các đối tượng. Có nghĩa có thể gọi các biến static mà không
    // cần tạo instance của lớp

    //Nói một cách cụ thể nếu class là static mà muốn gọi hàm của lớp khác thì sẽ có 2 trường hợp
    // Hàm cần gọi sẽ phải là static
    // Nếu không muốn là static thì sẽ phải khởi tại đối tượng (instance) của lớp
    // Ví dụ class main là static, khi đó muốn gọi class khác thi sẽ phải khởi tạo một đối tượng - instance
    //

}
