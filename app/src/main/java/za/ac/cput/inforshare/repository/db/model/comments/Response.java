package za.ac.cput.inforshare.repository.db.model.comments;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;

/**
 * Created by MUAMBA on 2/14/2018.
 */


@Entity(nameInDb = "Response")
public class Response {


    @Property(nameInDb = "commentId  ")
    private String commentId  ;

    @Property(nameInDb = "responseId  ")
    private String responseId  ;

    @Property(nameInDb = "response  ")
    private String response  ;

    @Property(nameInDb = "emailId")
    private String emailId ;

    @Property(nameInDb = "ipaddress")
    private String ipaddress;

    @Property(nameInDb = "date")
    private Date date;
@Generated(hash = 1727678937)
public Response(String commentId, String responseId, String response, String emailId, String ipaddress, Date date) {
    this.commentId = commentId;
    this.responseId = responseId;
    this.response = response;
    this.emailId = emailId;
    this.ipaddress = ipaddress;
    this.date = date;
}

@Generated(hash = 2002184916)
public Response() {
}

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}