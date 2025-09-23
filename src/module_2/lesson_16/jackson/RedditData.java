package module_2.lesson_16.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RedditData {
    @JsonProperty("children")
    private List<RedditPostWrapper> postWrappers;

    public List<RedditPostWrapper> getPostWrappers() {
        return postWrappers;
    }
}
