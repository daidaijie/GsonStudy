package version;

import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;

/**
 * Created by daidaijie on 2016/5/21.
 */
public class SinceUntilSample {

    @Since(4)
    public String since;

    @Until(5)
    public String until;

    @Override
    public String toString() {
        return "SinceUntilSample{" +
                "since='" + since + '\'' +
                ", until='" + until + '\'' +
                '}';
    }
}
