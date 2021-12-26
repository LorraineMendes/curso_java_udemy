package SesaoTrezeStringBuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comments = new ArrayList<>();

    public Post() {

    }

    // Mais uma vez, a LISTA NAO ENTRA NO CONTRUTOR
    public Post(Date moment, String title, String contend, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = contend;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContend() {
        return content;
    }

    public void setContend(String contend) {
        this.content = contend;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    // Esse metodo nao pode existir, nao posso ter uns construtor de lista, pois ja tenho uma lista sendo criada lna linha 13
    //public void setComments(List<Comment> comments) {
    //    this.comments = comments;
    //} No lugar do mẽtodo set, fazemos o add e o remove

    public void addComment (Comment comment){
        comments.add(comment);
    }
    public void removeComment (Comment comment){
        comments.remove(comment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append("Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");

        for (Comment c : comments){
            sb.append(c.getText() + "\n");
        }

        return sb.toString();

    }

}
