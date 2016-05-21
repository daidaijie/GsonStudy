package diyTest.rename;

import com.google.gson.annotations.SerializedName;

/**
 * Created by daidaijie on 2016/5/21.
 */
public class User {

    private String name;
    private int age;

    //value为生成的名字，alternate为备选的
    //注：当多种情况同时出时，以最后一个出现的值为准。
    @SerializedName(value = "emailAddress", alternate = {"email", "email_address"})
    private String emailAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
