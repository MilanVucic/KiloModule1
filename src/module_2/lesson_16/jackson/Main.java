package module_2.lesson_16.jackson;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new JsonMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.setVisibility(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));

        try {
            RedditResponse redditResponse = objectMapper.readValue(new URL("https://www.reddit.com/.json"), RedditResponse.class);

            for (RedditPostWrapper wrapper : redditResponse.getData().getPostWrappers()) {
                System.out.println(wrapper.getPost());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
