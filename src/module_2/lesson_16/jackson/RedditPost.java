package module_2.lesson_16.jackson;

public class RedditPost {
    private String subreddit;
    private String title;
    private String author;

    @Override
    public String toString() {
        return "/r: " + subreddit + " title: " + title + " by " + author;
    }
}
