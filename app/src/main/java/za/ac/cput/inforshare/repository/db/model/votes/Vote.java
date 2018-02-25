package za.ac.cput.inforshare.repository.db.model.votes;

import android.app.admin.DeviceAdminInfo;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by MUAMBA on 2/15/2018.
 */

@Entity(nameInDb = "Vote")
public class Vote {

    @Property(nameInDb = "siteId")
    private String siteId;

    @Property(nameInDb = "itemId")
    private String itemId;

    @Property(nameInDb = "ipAddress")
    private String ipAddress;

    @Property(nameInDb = "itemOwnerId")
    private String itemOwnerId;

    @Property(nameInDb = "date")
    private Date date;

    @Property(nameInDb = "status")
    private  String status ;

    @Generated(hash = 539278141)
    public Vote(String siteId, String itemId, String ipAddress, String itemOwnerId,
            Date date, String status) {
        this.siteId = siteId;
        this.itemId = itemId;
        this.ipAddress = ipAddress;
        this.itemOwnerId = itemOwnerId;
        this.date = date;
        this.status = status;
    }

    @Generated(hash = 1235976307)
    public Vote() {
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getItemOwnerId() {
        return itemOwnerId;
    }

    public void setItemOwnerId(String itemOwnerId) {
        this.itemOwnerId = itemOwnerId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
