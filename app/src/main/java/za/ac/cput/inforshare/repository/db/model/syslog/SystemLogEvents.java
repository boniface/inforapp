package za.ac.cput.inforshare.repository.db.model.syslog;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by MUAMBA on 2/15/2018.
 */

@Entity(nameInDb = "SystemLogEvents")
public class SystemLogEvents {

    @Property(nameInDb = "siteId")
    private String siteId;

    @Property(nameInDb = "id")
    private String id;

    @Property(nameInDb = "eventName")
    private String eventName;

    @Property(nameInDb = "eventType")
    private String eventType;

    @Property(nameInDb = "message")
    private String message;

    @Property(nameInDb = "date")
    private Date date;

    @Generated(hash = 1920029627)
    public SystemLogEvents(String siteId, String id, String eventName, String eventType,
            String message, Date date) {
        this.siteId = siteId;
        this.id = id;
        this.eventName = eventName;
        this.eventType = eventType;
        this.message = message;
        this.date = date;
    }

    @Generated(hash = 2111059484)
    public SystemLogEvents() {
    }

    public String getSiteId() {
        return this.siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEventName() {
        return this.eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
