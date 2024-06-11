package lr11.Example6;
import java.util.HashMap;
import java.util.Map;
public class ex1 {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "0#");//Заполнить HashMap 10 объектами <Integer, String>.
        map.put(1, "1A");
        map.put(2, "2BB");
        map.put(3, "3CCC");
        map.put(4, "4DDDD");
        map.put(5, "5EEEEE");
        map.put(6, "6FFFFFF");
        map.put(7, "7GGGGGGG");
        map.put(8, "8HHHHHHHH");
        map.put(9, "9IIIIIIIII");
        printKeys(map);
        multiply(map);
    }

    public static void printKeys(Map<Integer, String> map) {
        for (Integer key : map.keySet()) {
            if (key > 5) {
                System.out.print("key>5 = (" + key + ";" + map.get(key) + ")\n");
            }
            if (key == 0) {
                System.out.print("key=0 = (" + key + ";" + map.get(key) + ")\n");
            }
        }
    }

    public static void multiply(Map<Integer, String> map) {
        int multy = 1;
        String Str5 = "12345";
        for (Integer key : map.keySet()) {
            if (map.get(key).length()>Str5.length()){
                multy *= map.get(key).length();
                System.out.println(map.get(key));
            }
        }
        System.out.print("multiply = "+ multy );
    }
}
