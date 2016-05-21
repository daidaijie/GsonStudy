package version;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by daidaijie on 2016/5/21.
 */
public class Main {
    public static void main(String[] args) {
        SinceUntilSample sinceUntilSample = new SinceUntilSample();
        sinceUntilSample.since = "since";
        sinceUntilSample.until = "until";
        double version = 5.0;
        Gson gson = new GsonBuilder()
                .setVersion(version)
                .create();

        String jsonObjects = gson.toJson(sinceUntilSample);
        System.out.println("jsonObjects = " + jsonObjects);
        /*当version< 4 时，结果：{
            "until":"until"
        }
        当version >= 4 && version < 5 时，结果：{
            "since":"since", "until":"until"
        }
        当version >= 5 时，结果：{
            "since":"since"
        }*/
    }
}
