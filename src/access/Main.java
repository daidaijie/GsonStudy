package access;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Modifier;

/**
 * Created by daidaijie on 2016/5/21.
 */
public class Main {

    public static void main(String[] args) {
        ModifierSample modifierSample = new ModifierSample();
        Gson gson = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.FINAL, Modifier.STATIC, Modifier.PRIVATE)
                .create();
        System.out.println(gson.toJson(modifierSample));

    }
}
