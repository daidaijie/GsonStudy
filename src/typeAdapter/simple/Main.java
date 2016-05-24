package typeAdapter.simple;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import diyTest.simple.User;

/**
 * Created by daidaijie on 2016/5/22.
 */
public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.setName("daidaijie");
        user.setAge(22);
        user.setEmailAddress("13yjli3@stu.edu.cn");

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(User.class, new UserTypeAdapter())
                .create();

        System.out.println(gson.toJson(user));

        User newUser = gson.fromJson("{\"name\":\"daidaijie\",\"age\":22,\"emailAddress\":\"13yjli3@stu.edu.cn\"}", User.class);
        System.out.println(newUser);

    }
}
