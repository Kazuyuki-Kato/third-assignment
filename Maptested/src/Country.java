import java.util.HashMap;
import java.util.Map;
import java.util.SimpleTimeZone;

public class Country {
    public static void main(String[] args) {
        Map<String, String> coName = new HashMap<>();
        coName.put("ロンドン", "イギリスの首都です");
        coName.put("東京", "日本の首都です");
        coName.put("ワシントンＤＣ", "アメリカの首都です");
        for (String key : coName.keySet()) {
            String value = coName.get(key);
            System.out.println(key + "は" + value);
        }
    }
}