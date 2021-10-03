package QuanLyNhanVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ImportFile {
    private static final String FILE_URL = "../NhanVien/src/QuanLyNhanVien/Nhanvien.txt";
    static List<NhanVien> NhanVienList;

    public void write(List<NhanVien> nhanvienList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(FILE_URL));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(NhanVienList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }

    /**
     * read list student from file
     *
     * @return list student
     */
    public List<NhanVien> read() {
        List<NhanVien> studentList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(FILE_URL));
            ois = new ObjectInputStream(fis);
            NhanVienList = (List<NhanVien>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return NhanVienList;
    }

    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
