package innerTest;

import com.google.gson.Gson;

/**
 * Created by daidaijie on 2016/5/21.
 * 基本数据类型解析
 */
public class Main {

    public static void main(String[] args) {
        Gson gson = new Gson();

        //基本数据类型的解析
        int i = gson.fromJson("100", int.class);
        System.out.println(i);

        double d = gson.fromJson("99.99", double.class);
        System.out.println(d);

        boolean b = gson.fromJson("true", boolean.class);
        System.out.println(b);

        String str = gson.fromJson("String", String.class);
        System.out.println("str = " + str);

        System.out.println();

        //基本数据类型的生成
        String jsonNumber = gson.toJson(100);
        System.out.println("jsonNumber = " + jsonNumber);

        String jsonBoolean = gson.toJson(false);
        System.out.println("jsonBoolean = " + jsonBoolean);

        String jsonString = gson.toJson("String");
        System.out.println("jsonString = " + jsonString);

    }
}
