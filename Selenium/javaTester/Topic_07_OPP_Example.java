package javaTester;

public class Topic_07_OPP_Example {
    //Thuộc tính
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;

    public void tinhChuVi() {
        //Biến banKinh chỉ được sử sụng ở cục bộ đây thôi
        float banKinh = 10;
        cv = 2*PI*banKinh;
    }

    public void tinhDienTich() {
        r = 10 ;
        dt = PI*r*r;
    }

    // Sẽ thế nào nếu trong trường hợp tên biến trùng với thuộc tính
    //Ví dụ như sau
    public void tinhDienTich1() {
        //Tại đây r là biến cục bộ chu không phải thuộc tính của lớp nhé
        float r = 10 ;
        dt = PI*r*r;
    }

    //Phương án: sử dụng this
    public void tinhDienTich2() {
        float r = 10;
        this.r = r;
        dt = PI*r*r;
    }
    // hoặc có thể ví dụ khác cho việc sử dụng this
    public Topic_07_OPP_Example(float r) {
        //this.r : Là thuộc tính hay là biến instance
        // còn r là tham số truyền vào, có thể nói việc dùng this sẽ phân biệt được biến và tham số truyền vào
        this.r = r;
    }

    //Method: Phương thức của lớp


}
