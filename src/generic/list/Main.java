package generic.list;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Created by daidaijie on 2016/5/21.
 */
public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String jsonArray = "[\"Android\",\"Java\",\"PHP\"]";
        List<String> stringList = gson.fromJson(jsonArray, new TypeToken<List<String>>() {
        }.getType());

        for (String every : stringList) {
            System.out.println("every = " + every);
        }
    }
}
