package za.ac.cput.inforshare.repository.db.model.comments;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by hashcode on 2/14/2018.
 */
@Entity(nameInDb = "abuse")
public class abuse {

    @Id
    private String siteId ;

    @Property
    private String commentIdOrResponseId  ;

    @Property(nameInDb = "date")
    private String date;

    @Property(nameInDb = "details  ")
    private String details  ;

    @Property(nameInDb = "emailId")
    private String emailId ;

    public abuse (String siteId , String commentIdOrResponseId  ,String date, String details, String emailId  ) {
        this.siteId  = siteId ;
        this.commentIdOrResponseId   = commentIdOrResponseId  ;
        this.date = date;
        this.details   = details  ;
        this.emailId = emailId;
    }

    public abuse() {
    }

    public String getSiteId() {
        return this.siteId ;
    }

    public void setSiteId(String siteId) {
        this.siteId  = siteId ;
    }


    public String commentIdOrResponseId() {
        return this.commentIdOrResponseId  ;
    }

    public void setCommentIdOrResponseId(String commentIdOrResponseId  ) {
        this.commentIdOrResponseId   = commentIdOrResponseId  ;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetails() {
        return this.details  ;
    }

    public void setDetails(String details  ) {
        this.details   = details  ;
    }

    public String getEmailId(){ return this.emailId; }

    public void setEmailId(String emailId){ this.emailId = emailId ; }

}
