package za.ac.cput.inforshare.repository.db.model.comments;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;


/**
 * Created by MUAMBA on 2/14/2018.
 */


@Entity(nameInDb = "ResponseStatus")

public class ResponseStatus {

    @Property(nameInDb = "responseId  ")
    private String responseId  ;

    @Property(nameInDb = "status  ")
    private String status  ;

    @Property(nameInDb = "date")
    private Date date;
@Generated(hash = 868506051)
public ResponseStatus(String responseId, String status, Date date) {
    this.responseId = responseId;
    this.status = status;
    this.date = date;
}

@Generated(hash = 985743911)
public ResponseStatus() {
}

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
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