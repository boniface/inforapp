package za.ac.cput.inforshare.repository.db.model.users;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by christian on 2018/02/13.
 */



@Entity(nameInDb = "UserContact")
public class UserContact {

    @Id(autoincrement = true)
    private Long emailId;

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "contactTypeId  ")
    private String contactTypeId  ;

    @Property(nameInDb = "contactNumber  ")
    private String contactNumber  ;



    @Property(nameInDb = "date")
    private String date;

    @Property(nameInDb = "state")
    private String state;


    @Generated(hash = 1543916479)
    public UserContact(Long emailId, Long id, String contactTypeId  , String contactNumber  , String date, String state) {
        this.emailId = emailId;
        this.id = id;
        this.contactTypeId   = contactTypeId  ;
        this.contactNumber   = contactNumber  ;
        this.date = date;
        this.state = state;
    }

    @Generated(hash = 586692638)
    public UserContact() {
    }

    public Long getEmailId() {
        return this.emailId;
    }

    public void setEmailId(Long emailId) {
        this.emailId = emailId;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContactTypeId() {
        return this.contactTypeId  ;
    }

    public void setContactTypeId(String contactTypeId  ) {
        this.contactTypeId   = contactTypeId;
    }

    public String getContactNumber() {
        return this.contactNumber  ;
    }

    public void setContactNumber(String contactNumber  ) {
        this.contactNumber   = contactNumber;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}