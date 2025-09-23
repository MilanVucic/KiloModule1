package module_2.lesson_16.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RedditPostWrapper {
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("data")
    private RedditPost post;

    public RedditPost getPost() {
        return post;
    }
}
