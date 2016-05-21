package generic.array;

import com.google.gson.Gson;

/**
 * Created by daidaijie on 2016/5/21.
 */
public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String jsonArray = "[\"Android\",\"Java\",\"PHP\"]";
        String[] strings = gson.fromJson(jsonArray, String[].class);
        for (String every : strings) {
            System.out.println("every = " + every);
        }
    }
}
