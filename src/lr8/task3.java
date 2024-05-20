package lr8;
import java.io.*;
public class task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\tmp\\Lyrics.txt")));
            out = new PrintWriter("c:\\tmp\\Lyrics2.txt");
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                String[] arr = s.split(" ");
                int rowCount = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].matches("(?ui:[^аеёиоуыэюя]).*")) {
                        out.print(arr[i] + " ");
                        rowCount++;
                    }
                }
                out.println("\n Колличество слов в строке " + lineCount + ": " + rowCount);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!" + e);
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
