import java.io.*;
import java.util.ArrayList;

public class IO_WirteVsRead {
    static File file =new File("C:\\Users\\Admin\\Desktop\\Thi2\\QLySinhVien\\src\\Meneger.txt");


    public static void write(ArrayList<SinhVien> sinhViens){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(sinhViens);
            objectOutputStream.close();
            fileOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static ArrayList<SinhVien> read(){
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<SinhVien> sinhViens = (ArrayList<SinhVien>) objectInputStream.readObject();
            return sinhViens;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
