package javaTester;

import Example.NhanVien;

public class Topic_17_Abtraction {
    // Tại sao cần phải dùng trừu tượng vậy
    // Nếu co 1 phương thức trừu tượng thì phải khai báo lớp đó là lớp trừu tuong
    public abstract class NhanVien {
        protected String name;
        protected long luong;

        public NhanVien() {

        }

        public NhanVien(String name) {
            this.name = name;
        }

        protected abstract String loaiNhanVien();
        protected abstract int tinhLuong();

        public void xuatThongTin() {
            System.out.println("===== Nhân viên: " + name + " =====");
            System.out.println("- Loại nhân viên: " + loaiNhanVien());
            System.out.println("- Lương: " + luong + " VND");
        }
    }

    public class NhanVienFullTime extends NhanVien {
    // các lop con ke thừa chắc chắn phải override lại phuong thức đó, nếu ko báo lỗi ngay
        @Override
        protected String loaiNhanVien() {
            return "Nhân viên full time nè";
        }

        @Override
        protected int tinhLuong() {
            return 20000;
        }
    }

}
