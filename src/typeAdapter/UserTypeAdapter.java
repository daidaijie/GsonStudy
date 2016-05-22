package typeAdapter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import diyTest.simple.User;

import java.io.IOException;

/**
 * Created by daidaijie on 2016/5/22.
 */
public class UserTypeAdapter extends TypeAdapter<User> {
    @Override
    public void write(JsonWriter jsonWriter, User user) throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("name").value(user.getName());
        jsonWriter.name("age").value(user.getAge());
        jsonWriter.name("emailAddress").value(user.getEmailAddress());
        jsonWriter.endObject();
    }

    @Override
    public User read(JsonReader jsonReader) throws IOException {
        User user = new User();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            switch (jsonReader.nextName()) {
                case "name":
                    user.setName(jsonReader.nextString());
                    break;
                case "age":
                    user.setAge(jsonReader.nextInt());
                    break;
                case "email":
                case "email_address":
                case "emailAddress":
                    user.setEmailAddress(jsonReader.nextString());
                    break;


            }
        }
        jsonReader.endObject();
        return user;

    }
}
