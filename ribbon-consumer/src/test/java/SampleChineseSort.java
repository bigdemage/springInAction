import java.text.Collator;
import java.util.*;

public class SampleChineseSort {


    @SuppressWarnings("rawtypes")
    private final static Comparator CHINA_COMPARE= Collator.getInstance(Locale.CHINA);

    private static void sortList(){
        List<String> list = Arrays.asList("张三","阿祥","大海");
        Collections.sort(list,CHINA_COMPARE);
        System.out.println(list);
    }

    private static  void sortArray(){
        String[] str={"张啊","波祥","大海"};
        Arrays.sort(str,CHINA_COMPARE);
        for (String arr:str
             ) {
            System.out.println(arr);
        }
    }

    public static void main(String[] args) {
        sortList();
        sortArray();
    }
}
