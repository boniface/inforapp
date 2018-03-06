package za.ac.cput.inforshare.repository.db.model.util;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by MUAMBA on 2/15/2018.
 */

@Entity(nameInDb = "ItemStatus")
public class ItemStatus {

    @Property(nameInDb = "itemId")
    private String itemId;

    @Property(nameInDb = "date")
    private Date date;

    @Property(nameInDb = "status")
    private String status;

    @Property(nameInDb = "description")
    private String description;

    @Generated(hash = 970992038)
    public ItemStatus(String itemId, Date date, String status, String description) {
        this.itemId = itemId;
        this.date = date;
        this.status = status;
        this.description = description;
    }

    @Generated(hash = 430409100)
    public ItemStatus() {
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
