package Example;

public class NhanVienPartTime extends NhanVien{
    private int gioLamViec;

    public NhanVienPartTime(String ten, int gioLamViec) {
        super(ten);
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhân viên thoi vu";
    }

    public void tinhLuong() {
        luong = Config.LUONG_LAM_THEM_PART_TIME_GIO * gioLamViec;
    }
}
