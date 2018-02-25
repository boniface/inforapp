package za.ac.cput.inforshare.repository.db.model.users;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by christian on 2018/02/11.
 */
@Entity(nameInDb = "ValidUser")
public class ValidUser {

    @Id
    private String siteId ;

    @Id
    private String userId  ;

    @Property(nameInDb = "date")
    private Date date;

    @Property(nameInDb = "action  ")
    private String action  ;


    @Generated(hash = 609504769)
    public ValidUser(String siteId, String userId, Date date, String action) {
        this.siteId = siteId;
        this.userId = userId;
        this.date = date;
        this.action = action;
    }



    @Generated(hash = 1700679487)
    public ValidUser() {
    }



    public String getSiteId() {
        return this.siteId ;
    }

    public void setSiteId(String siteId) {
        this.siteId  = siteId ;
    }


    public String getUserId() {
        return this.userId  ;
    }

    public void setUserId(String userId  ) {
        this.userId   = userId  ;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAction() {
        return this.action  ;
    }

    public void setAction(String action  ) {
        this.action   = action  ;
    }
}