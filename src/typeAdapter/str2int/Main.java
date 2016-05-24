package typeAdapter.str2int;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Created by daidaijie on 2016/5/24.
 */
public class Main {
    public static void main(String[] args) {

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Integer.class, new TypeAdapter<Integer>() {
                    @Override
                    public void write(JsonWriter jsonWriter, Integer integer) throws IOException {
                        jsonWriter.value(String.valueOf(integer));
                    }

                    @Override
                    public Integer read(JsonReader jsonReader) throws IOException {

                        try {
                            return Integer.parseInt(jsonReader.nextString());
                        } catch (NumberFormatException e) {
                            return -1;
                        }

                    }
                }).create();
        System.out.println(gson.toJson("20"));
        System.out.println(gson.fromJson("\"\"",Integer.class));

    }
}
