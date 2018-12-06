package Microblog;

import java.util.ArrayList;
import java.util.Iterator;

import static java.lang.System.out;

public class Blog {

    private ArrayList<User> users;
    private ArrayList<Post> posts;
    private User currentUser;

    public static void main(String[] args) {

        Blog myBlog = new Blog();
        myBlog.users = new ArrayList();
        myBlog.posts = new ArrayList();
        myBlog.setupObjects();
        myBlog.currentUser = myBlog.users.get(0);

        Menu myMenu = new Menu(myBlog);

        myBlog.printPosts();
        myBlog.printUsers();
    }

    public User getCurrentUser(){
        return currentUser;
    }

    public void setCurrentUser(String username){
        Iterator myIterator = this.users.iterator();
        while (myIterator.hasNext()) {
            User u = (User) myIterator.next();

            if(u.getUsername().equals(username)) {
                currentUser = u;
            }

        }
    }

    public ArrayList getUsers() {
        return users;
    }

    public ArrayList getPosts() {
        return posts;
    }

    private void printUsers() {

        Iterator myIterator = this.users.iterator();
        while (myIterator.hasNext()) {
            User u = (User) myIterator.next();
            out.println("Microblog.User:");
            out.println("    username:" + u.getUsername());
            out.println("    name:" + u.getRealName());
            out.println("    email address:" + u.getEmailAddress());
            out.println("    avatar URL:" + u.getAvatarUrl());
            out.println();
            out.println();

        }
    }

    private void printPosts() {
        Iterator myIterator = this.posts.iterator();
        while (myIterator.hasNext()) {
            Post p = (Post) myIterator.next();
            out.println("Posts:");
            out.println("    user:" + p.getAuthor());
            out.println("    post:" + p.getBlogContents());
            out.println("    link:" + p.getWebAddress());
        }
    }

    private void setupObjects() {
        setupUsers();
        setupPosts();
    }

    private void setupUsers(){
        this.users.add(new User("alymar", "Alyssa", "blah@blah.com", "test.com/blah.gif"));
        this.users.add(new User("iourimar", "Iouri", "blah@blah.com", "test.com/blah.gif"));
        this.users.add(new User("jackiemar", "Jackie", "blah@blah.com", "test.com/blah.gif"));
    }

    private void setupPosts(){
        this.posts.add(new Post("alymar", 1, "this is a blog post","blog.com/link"));
        this.posts.add(new Post("iourimar", 2, "this is a blog post","blog.com/link"));
        this.posts.add(new Post("iourimar", 3, "this is a last blog post","blog.com/link"));
        this.posts.add(new Post("jackiemar", 4, "this is a blog post","blog.com/link"));
        this.posts.add(new Post("alymar", 5, "this is a last blog post","blog.com/link"));

    }
}



