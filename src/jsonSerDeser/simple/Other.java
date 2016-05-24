package jsonSerDeser.simple;

import com.google.gson.*;

import java.lang.reflect.Type;

/**
 * Created by daidaijie on 2016/5/24.
 */
public class Other {
    public static void main(String[] args) {
        JsonSerializer<Number> numberJsonSerializer = new JsonSerializer<Number>() {
            @Override
            public JsonElement serialize(Number number, Type type, JsonSerializationContext jsonSerializationContext) {
                return new JsonPrimitive(String.valueOf(number));
            }
        };

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Integer.class,numberJsonSerializer)
                .registerTypeAdapter(Long.class,numberJsonSerializer)
                .registerTypeAdapter(Float.class,numberJsonSerializer)
                .registerTypeAdapter(Double.class,numberJsonSerializer)
                .create();

        System.out.println(gson.toJson(100.0f));
    }
}
