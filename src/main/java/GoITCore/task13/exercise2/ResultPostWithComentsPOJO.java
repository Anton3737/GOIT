package GoITCore.task13.exercise2;

import java.util.List;

public class ResultPostWithComentsPOJO {

    private String post;
    private List comments;

    public ResultPostWithComentsPOJO(String post, List comments) {
        this.post = post;
        this.comments = comments;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public List getComments() {
        return comments;
    }

    public void setComments(List comments) {
        this.comments = comments;
    }
}
