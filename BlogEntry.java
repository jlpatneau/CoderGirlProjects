
public class BlogEntry
{
    private static int nextBlogIndex = 1;
    // instance variables 
    //private int userId;
    private String userName;
    private int blogIndex;
    private String blogPost;
    private String blogLink;

    public BlogEntry(String userName, String blogPost, String blogLink) {
        // initialize instance variables
        this.blogIndex = nextBlogIndex;
        nextBlogIndex++;
        //this.userId = userId;
        this.userName = userName;
        this.blogPost = blogPost;
        this.blogLink = blogLink;

    }

    public int getBlogIndex() {
        return blogIndex;
    }

    public String getBlogPost()  {
        return blogPost;
    }

    public String getBlogLink() {
        return blogLink;
    }

    public String getBlogUserName() {
        return userName;
    }
}
