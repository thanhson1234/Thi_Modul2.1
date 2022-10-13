import java.util.Scanner;

public class CT_QuanLySinhVien {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Meneger meneger = new Meneger();
        while (true) {
            System.out.println("=============Menu==========");
            System.out.println("1.  Hiển thị danh sách sinh viên");
            System.out.println("2.  Thêm mới");
            System.out.println("3.  Cập nhật");
            System.out.println("4.  Xóa ");
            System.out.println("5.  Sắp xếp ");
            System.out.println("6.  đọc file ");
            System.out.println("7.  Viết file ");
            System.out.println("8.  Thoát ");

            int choice = 0;
            while (choice < 1 || choice > 6) {
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("sai định dạng  mời nhập lại");
                }
            }

            switch (choice) {
                case 1:
                    meneger.HienThi();
                    break;
                case 2:
                    meneger.Them();
                    break;
                case 3:
                    meneger.CapNhat();
                    break;
                case 4:
                    meneger.Xoa();
                    break;
                case 5:
                    meneger.XapXep();
                    break;
                case 6:
                    meneger.DocFine();
                    break;
                case 7:
                    meneger.Vietfine();
                    break;
                case 8:
                    return;
            }
        }
    }
}
