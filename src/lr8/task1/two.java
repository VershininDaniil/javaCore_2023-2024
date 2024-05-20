package lr8.task1;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class two {
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); //читает 1 байт
            if (oneByte != -1) { //признак отсутсвия конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
}

    public static void main(String[] args) {
        try {
            //с потоком связан файл
            InputStream inputFile = new FileInputStream("c:\\tmp\\text2.txt");
            readAllByByte(inputFile);
            System.out.print("\n\n\n");
            inputFile.close();

            InputStream inputUrl = new URL("https://www.google.ru/").openStream();
            readAllByByte(inputUrl);
            System.out.print("\n\n\n");
            inputUrl.close();

            InputStream inputArr = new ByteArrayInputStream(new byte[]{1,2,4,1,4,7,1});
            readAllByByte(inputArr);
            System.out.print("\n\n\n");
            inputArr.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
