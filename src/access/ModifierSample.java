package access;

/**
 * Created by daidaijie on 2016/5/21.
 */
public class ModifierSample {


    final String finalField = "final";

    static String staticField = "static";

    public String publicField = "public";

    protected String protectedFiele = "protected";

    String defaultField = "default";

    private String privateField = "private";

    @Override
    public String toString() {
        return "ModifierSample{" +
                "finalField='" + finalField + '\'' +
                ", publicField='" + publicField + '\'' +
                ", protectedFiele='" + protectedFiele + '\'' +
                ", defaultField='" + defaultField + '\'' +
                ", privateField='" + privateField + '\'' +
                '}';
    }
}
