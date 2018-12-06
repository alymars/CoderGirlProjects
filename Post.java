package Microblog;

import java.util.ArrayList;

public class Post {

    private String author;
    private int postOrder;
    private String blogContents;
    private String webAddress;

    public Post(String author, int postOrder, String blogContents, String webAddress) {
        this.author = author;
        this.postOrder = postOrder;
        this.blogContents = blogContents;
        this.webAddress = webAddress;
    }

    public String getAuthor() {
        return author;
    }

    public int getPostOrder() {
        return postOrder;
    }

    public String getBlogContents() {
        return blogContents;
    }

    public String getWebAddress() {
        return webAddress;
    }
}