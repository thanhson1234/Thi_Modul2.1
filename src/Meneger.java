import java.util.ArrayList;
import java.util.Scanner;

public class Meneger {
    SinhVien sinhVien = new SinhVien();
    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> sinhViens = IO_WirteVsRead.read();

    public SinhVien ChucNang() {
        System.out.println("nhập mã sinh viên");
        String maSV = sc.nextLine();

        System.out.println("nhập họ và tên");
        String hoVsTen = sc.nextLine();

        System.out.println("nhập tuổi");
        int tuoi = 0;
        while (true) {
            try {
                tuoi = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("sai cú pháp mời nhập lại");
            }
        }
        System.out.println("Nhập giới tính");
        String gt = sc.nextLine();

        System.out.println("nhâ địa chỉ");
        String diaChi = sc.nextLine();

        System.out.println("nhập điểm trung bình");
        double diem = 0.0;
        while (true) {
            try {
                diem = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("sai cú pháp mời nhập lại");
            }
        }
        Object TT = new SinhVien(maSV, hoVsTen, tuoi, gt, diaChi, diem);
        return (SinhVien) TT;
    }

    public void HienThi() {
        for (int i = 0; i < sinhViens.size(); i++) {
            System.out.println(sinhViens.get(i).toString());
        }
    }

    public void Them() {
        sinhViens.add(ChucNang());
        IO_WirteVsRead.write(sinhViens);
    }

    public void CapNhat() {
        System.out.println("nhập tên cần cập nhật");
        String sua = sc.nextLine();
        for (int i = 0; i < sinhViens.size(); i++) {
            if (sinhViens.get(i).getHoTen().equals(sua)) {
                System.out.println("Ấn y để xác nhận sửa");
                String y = sc.nextLine();
                if (y.equals("y"))
                sinhViens.set(i, ChucNang());
                System.out.println("bạn đã sửa thành công");
            }
        }
    }

    public void Xoa() {
        System.out.println("nhập tên cần xóa");
        String xoa = sc.nextLine();
        for (int i = 0; i < sinhViens.size(); i++) {
            if (sinhViens.get(i).getHoTen().equals(xoa)) {
                System.out.println("nhập y để xóa");
                String y = sc.nextLine();
                if (y.equals("y"))
                sinhViens.remove(i);
                System.out.println("bạn đã xóa thành công");
                break;
            } else {
                System.out.println("không có trong danh sách");
            }
        }
    }

    public void XapXep() {
            System.out.println("Bạn muốn sắp xếp theo hướng nào ?");
            System.out.println("1. Sắp xếp điểm trung bình giảm dần");
            System.out.println("2. Sắp xếp điểm trung bình tăng dần");
            System.out.println("3. Hủy bỏ sắp xếp");
            int choice;
            while (true){
                try {
                    do {
                        choice = Integer.parseInt(sc.nextLine());
                        if (choice < 1 || choice > 3){
                            System.out.println("Chọn 1 hoặc 2");
                        }
                    }while (choice < 1 || choice > 3);
                    break;
                }catch (NumberFormatException e){
                    System.out.println("Vui Lòng Nhập Số");
                }
            }
            switch (choice) {
                case 1 -> sinhViens.sort(new GiamDan());
                case 2 -> sinhViens.sort(new TangDan());

            }
        }
        public void DocFine(){
            System.out.println("đã dọc thành công");
        }
        public void Vietfine(){
            System.out.println("đã viết thành công");
        }
    }
