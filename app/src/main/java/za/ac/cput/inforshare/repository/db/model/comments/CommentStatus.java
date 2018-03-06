package za.ac.cput.inforshare.repository.db.model.comments;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;



/**
 * Created by MUAMBA on 2/14/2018.
 */

@Entity(nameInDb = "CommentStatus")
public class CommentStatus {

    @Property(nameInDb = "commentId")
    private String commentId  ;

    @Property(nameInDb = "status")
    private String status;

    @Property(nameInDb = "date")
    private Date date;
@Generated(hash = 1923263259)
public CommentStatus(String commentId, String status, Date date) {
    this.commentId = commentId;
    this.status = status;
    this.date = date;
}

@Generated(hash = 2136910496)
public CommentStatus() {
}

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
