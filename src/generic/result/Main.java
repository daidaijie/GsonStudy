package generic.result;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by daidaijie on 2016/5/21.
 */
public class Main {


    public static void main(String[] args) {
        Gson gson = new Gson();

        String jsonString = "";

        Type userType = new TypeToken<Result<User>>() {
        }.getType();

        //使用泛型解决RESTful的标准输出
        Result<User> userResult = gson.fromJson(jsonString, userType);
        User user = userResult.getData();


        Type userListType = new TypeToken<Result<List<User>>>() {
        }.getType();

        Result<List<User>> userListResult = gson.fromJson(jsonString, userListType);
        List<User> userList = userListResult.getData();

    }

}
