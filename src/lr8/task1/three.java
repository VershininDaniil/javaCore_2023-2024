package lr8.task1;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class three {
    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff = new byte[8];
        while (true) {
            int count = in.read(buff);
            if (count != -1) {
                System.out.println("кол-во =" + count + ", buff =" + Arrays.toString(buff) + ", str = " +
                        new String(buff, 0, count, "cp1251"));
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "c:\\tmp\\text.txt";
        InputStream inFile = null;

        try{
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        }catch (IOException e){
            System.out.println("Ошибка" + fileName + e);
        } finally {
            if(inFile != null){
                inFile.close();
            }
        }

    }

}
