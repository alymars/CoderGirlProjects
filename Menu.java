package Microblog;

import java.util.Iterator;
import java.util.Scanner;
import static java.lang.System.out;

public class Menu {

    private Blog myBlog;

    public void display_menu() {
        out.println("1. Create new user\n2. Become existing user\n3. Write post as current user\n4. Print all users\n5. Print all posts");
        out.println();
        out.println("You are currently user \"" + myBlog.getCurrentUser().getUsername() + "\". What would you like to do?\n> 3");
    }

    private void printUsernames(){
        Iterator myIterator = this.myBlog.getUsers().iterator();
        while (myIterator.hasNext()) {
            User u = (User) myIterator.next();
            out.println(u.getUsername());
        }
    }

    private void printUsers(){

        Iterator myIterator = this.myBlog.getUsers().iterator();
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
        Iterator myIterator = this.myBlog.getPosts().iterator();
        while (myIterator.hasNext()) {
            Post p = (Post) myIterator.next();
            out.println("Posts:");
            out.println("    user:" + p.getAuthor());
            out.println("    post:" + p.getBlogContents());
            out.println("    link:" + p.getWebAddress());
        }
    }

    private void addUser(String username, String realname, String email, String url){
        this.myBlog.getUsers().add(new User(username, realname, email, url));
    }

    private void addPost(String author, int postOrder, String blogContents, String webAddress){
        this.myBlog.getPosts().add(new Post(author, postOrder, blogContents, webAddress));
    }

    public Menu(Blog blog) {
        this.myBlog = blog;
        Scanner keyboard = new Scanner(System.in);
        display_menu();
        switch (Integer.parseInt(keyboard.nextLine())) {

            case 1:
                String username, realname, email, url;

                out.println("Enter username here:");
                username = keyboard.nextLine();
                out.println("Enter realname here:");
                realname = keyboard.nextLine();
                out.println("Enter email here:");
                email = keyboard.nextLine();
                out.println("Enter Avatar URL here:");
                url = keyboard.nextLine();

                out.println("This user is now added.");
                out.println();

                addUser(username, realname, email, url);

                new Menu(blog);
                break;

            case 2:
                String usernameInput;

                out.println("Which user would you like to become?");
                printUsernames();
                usernameInput = keyboard.next();
                this.myBlog.setCurrentUser(usernameInput);
                out.println("You are now user " + usernameInput);
                out.println();

                new Menu(blog);
                break;

            case 3:
                String author;
                int postOrder = 1;
                String blogContents;
                String webAddress;
                Post lastPostByUser = null;


                Iterator myIterator = this.myBlog.getPosts().iterator();
                while (myIterator.hasNext()) {
                    Post p = (Post) myIterator.next();
                    if(p.getAuthor() == this.myBlog.getCurrentUser().getUsername()){
                        lastPostByUser = p;
                    }
                }

                if(lastPostByUser != null){
                    out.println(lastPostByUser.getBlogContents());
                }

                out.println("Enter new post here.");
                author = myBlog.getCurrentUser().getUsername();
                out.println("Write your post:");
                blogContents = keyboard.nextLine();
                out.println("BlogLink:");
                webAddress = keyboard.nextLine();
                addPost(author, postOrder, blogContents, webAddress);
                new Menu(blog);

            case 4:
                out.println();
                printUsers();
                out.println();

                new Menu(blog);

            case 5:
                out.println();
                printPosts();
                out.println();

                new Menu(blog);
        }
    }
}

