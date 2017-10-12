
public class BlogUser
{
    // instance variables 
    //private static int nextUserId = 0;
    //private int userId = 0;
    
    private String userPicture;
    private String userName;
    private String userRealName;
    private String userEmail;

    public BlogUser(String picture, String userName, String realName, String email)   
    {
        // initialise instance variables
        //this.userId = nextUserId;
        //nextUserId++;
        this.userPicture = picture;
        this.userName = userName;
        this.userRealName = realName;
        this.userEmail = email;
    }
    

    public String getUserName()
    {
        return userName ;
    }
    public String getUserPic()
    {
        return userPicture;
    }
    public String getRealName()
    {
        return userRealName;
    }
    public String getEmail()
    {
        return userEmail;
    }
}
