package strategy;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

/**
 * Created by daidaijie on 2016/5/21.
 */
public class Main {

    public static void main(String[] args) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.addSerializationExclusionStrategy(new ExclusionStrategy() {
            @Override
            public boolean shouldSkipField(FieldAttributes fieldAttributes) {
                //这里作判断，决定要不要排除该字段,return true为排除
                if ("finalField".equals(fieldAttributes.getName())) return true;
                Expose expose = fieldAttributes.getAnnotation(Expose.class);
                if (expose != null && expose.deserialize() == false) return true;

                return false;
            }

            @Override
            public boolean shouldSkipClass(Class<?> aClass) {
                // 直接排除某个类 ，return true为排除
                return (aClass == int.class || aClass == Integer.class);
            }
        });
        Gson gson = gsonBuilder.create();
    }


}
