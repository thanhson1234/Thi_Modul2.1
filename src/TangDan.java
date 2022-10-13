import java.util.Comparator;

public class TangDan implements Comparator<SinhVien> {
    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        if (o1.getDienTrungBinh() == o2.getDienTrungBinh()){
            return 0;
        }else if (o1.getDienTrungBinh() >  o2.getDienTrungBinh()) {
            return 1;
        } else {
            return -1;
        }
    }
}