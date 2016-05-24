package jsonSerDeser.simple;

import com.google.gson.*;

import java.lang.reflect.Type;

/**
 * Created by daidaijie on 2016/5/24.
 */
public class Main {
    public static void main(String[] args) {

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Integer.class, new JsonDeserializer<Integer>() {
                    @Override
                    public Integer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                        try {
                            return jsonElement.getAsInt();
                        } catch (NumberFormatException e) {
                            return -1;
                        }
                    }
                }).create();

        System.out.println(gson.toJson(100));
        System.out.println(gson.fromJson("\"\"", Integer.class));

    }
}
