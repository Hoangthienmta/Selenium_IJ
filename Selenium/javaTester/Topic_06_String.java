package javaTester;

public class Topic_06_String {
    // Chuỗi mang đặc tính khôi thể thay đổi được - immutable
    //1. Sử dụng từ khóa final
    //2. Thiết kế bộ nhớ : Sử dụng String pool, việc thêm kí tự -> tạo thành chuỗi mới chứ ko thay đổi chuỗi hiện tại



    //String là kiểu đối tượng, vi sao, vì khi khởi tạo có thể sử dụng từ khóa new để khởi tạo
    String myObject = new String("Test String");
    String objectTest = "Test String";
    // Cách new sẽ tốn bộ nhớ hơn, nó sẽ không check đã tồn tại hay chưa trong String Pool
    String version1 = "1.2.5.7";
    String version2 = "1.2.5.8";
    int compare = version1.compareTo(version2);
    // Thường dùng để so sánh giá trị của chuỗi dưới dạng unicode (giá trị âm, dương , 0)

    //Học về String buffer và String builder
    // -> Sẽ liên quan đến vấn đề immutable của chuỗi, vì các thành phần như kiểu nối chuỗi các thứ 
    // tại sao phải dùng cái này
    // Lí do chính vì tính immutable của chuỗi -> Không tạo đối tượng mới khi thay đổi nội dung của chuỗi
    // Khác nhau giữa nó là gì:
    //StringBuffer : Chậm hơn, dùng trong môi trường đa luồng, đảm bảo tính đồng bộ hóa
    //String builder: Nhanh hơn, dùng trong môi trường đơn luồng

}
