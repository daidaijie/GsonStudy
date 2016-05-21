package builder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import diyTest.simple.User;

/**
 * Created by daidaijie on 2016/5/21.
 */
public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .serializeNulls()
                .setPrettyPrinting()
                .create();
        User user = new User();
        user.setName("daidaijie");
        user.setAge(21);
        String jsonObject = gson.toJson(user);
        System.out.println("jsonObject = " + jsonObject);


        Gson gson2 = new GsonBuilder()
                //序列化null
                .serializeNulls()
                // 设置日期时间格式，另有2个重载方法
                // 在序列化和反序化时均生效
                .setDateFormat("yyyy-MM-dd")
                // 禁此序列化内部类
                .disableInnerClassSerialization()
                //生成不可执行的Json（多了 )]}' 这4个字符）
                .generateNonExecutableJson()
                //禁止转义html标签
                .disableHtmlEscaping()
                //格式化输出
                .setPrettyPrinting()
                .create();
    }
}
