package expose;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by daidaijie on 2016/5/21.
 */
public class Main {

    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
//        gson.toJson(category)
    }
}
