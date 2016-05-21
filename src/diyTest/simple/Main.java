package diyTest.simple;

import com.google.gson.Gson;

/**
 * 自定义类的解析与生成
 * Created by daidaijie on 2016/5/21.
 */
public class Main {
    public static void main(String[] args) {

        //自定义的类的生成
        Gson gson = new Gson();
        User user = new User();
        user.setName("daidaijie");
        user.setAge(21);
        user.setEmailAddress("13yjli3@stu.edu.cn");

        String jsonObject = gson.toJson(user);
        System.out.println("jsonObject = " + jsonObject);

        System.out.println();

        //自定义类的解析
        User newUser = gson.fromJson(jsonObject, User.class);
        System.out.println("newUser = " + newUser);

    }
}
