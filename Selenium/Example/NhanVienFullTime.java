package Example;
public class NhanVienFullTime extends NhanVien{
    private int ngayLamThem;
    private int loaiChucVu;

    public NhanVienFullTime(String ten) {
        super(ten);
        this.loaiChucVu = Config.NHAN_VIEN_LINH;
    }

    public NhanVienFullTime(String ten, int ngayLamThem) {
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = Config.NHAN_VIEN_LINH;
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loaiNhanVien() {
        if (loaiChucVu == Config.NHAN_VIEN_LINH) {
            return "Lính toàn thời gian" + (ngayLamThem > 0 ? " (có làm thêm ngày)":"");
        } else {
            return "Sếp toàn thời gian" + (ngayLamThem > 0 ? " (có làm thêm ngày)":"");
        }
    }

    public void tinhLuong() {
        if(loaiChucVu == Config.NHAN_VIEN_LINH) {
            luong = Config.LUONG_NHAN_VIEN_FULL_LINH + ngayLamThem * Config.LUONG_NHAN_VIEN_FULL_LINH;
        } else if (loaiChucVu == Config.NHAN_VIEN_SEP) {
            luong = Config.LUONG_NHAN_VIEN_FULL_SEP + ngayLamThem * Config.LUONG_NHAN_VIEN_FULL_SEP;
        }
    }
}
