import java.util.Comparator;

public class GiamDan implements Comparator<SinhVien> {
    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        if (o2.getDienTrungBinh() == o1.getDienTrungBinh()){
            return 0;
        }else if (o2.getDienTrungBinh() >  o1.getDienTrungBinh()) {
            return 1;
        } else {
            return -1;
        }
    }
}
