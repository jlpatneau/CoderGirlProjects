

public class Blog
{
    
    public static void main(String[] args)
    {
        printBlog(createBlog());
        printUsers(createUser());
    }

    public Blog()
    { 
        
    }

    public static BlogEntry[] createBlog() {
        BlogEntry[] blogs = new BlogEntry[5];
        
        blogs[0] = new BlogEntry("jgirl", "Anyone got plans for tonight?", "");
        blogs[1] = new BlogEntry("tman", "Did you see the new Star Wars - the Last Jedi trailer?", "www.starwars.com");
        blogs[2] = new BlogEntry("jgirl", "I did and I can't wait until December", "www.starwars.com/lastjedi");
        blogs[3] = new BlogEntry("suzz", "I hope that new cute critter isn't wookie food.", "");
        blogs[4] = new BlogEntry("tman", "Do you think Rey is going to the dark side?", "");
        
        return blogs;
    }
        
    public static BlogUser[] createUser() {
        BlogUser[] users = new BlogUser[3];
        
        users[0] = new BlogUser("www.google.com/tman.jpeg", "tman", "Tim Smith", "tsmith@gmail.com");
        users[1] = new BlogUser("www.google.com/jgirl.jpeg", "jgirl", "Julie Jones", "jjones@gmail.com");
        users[2] = new BlogUser("www.google.com/suzz.jpeg", "suzz", "Suzy Strong", "sstrong@gmail.com");
        
        return users;
    }
    
    public static void printBlog(BlogEntry[] blogs)
    {
        System.out.println("Welcome to the Star Wars Blog");
        for (int count = 0; count < blogs.length; count++) {
            System.out.println(blogs[count].getBlogIndex() + " - " + blogs[count].getBlogUserName() + " - " + 
                blogs[count].getBlogPost() );
            System.out.println(blogs[count].getBlogLink() );
            //System.out.println("\n");
        }
    }
    public static void printUsers(BlogUser[] users)
    {
        System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        System.out.println("Blog User Information");
        for (int count = 0; count < users.length; count++) {
            System.out.println("\n" + users[count].getUserPic() + "  " + users[count].getUserName() );
            System.out.println(users[count].getRealName() );
            System.out.println(users[count].getEmail() );
        }
    }
}
