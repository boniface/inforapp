package za.ac.cput.inforshare.repository.db.model.organisation;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by MUAMBA on 2/15/2018.
 */

@Entity(nameInDb = "Location")
public class Location {

    @Property(nameInDb = "org")
    private String org;

    @Property(nameInDb = "id  ")
    private String id;

    @Property(nameInDb = "name  ")
    private String name;

    @Property(nameInDb = "locationTypeId")
    private String locationTypeId;

    @Property(nameInDb = "code  ")
    private String code;

    @Property(nameInDb = "latitude  ")
    private String latitude;

    @Property(nameInDb = "longitude  ")
    private String longitude;

    @Property(nameInDb = "parentId  ")
    private String parentId;


    @Property(nameInDb = "state  ")
    private String state;

    @Property(nameInDb = "date  ")
    private Date date;
@Generated(hash = 269229895)
public Location(String org, String id, String name, String locationTypeId, String code,
        String latitude, String longitude, String parentId, String state, Date date) {
    this.org = org;
    this.id = id;
    this.name = name;
    this.locationTypeId = locationTypeId;
    this.code = code;
    this.latitude = latitude;
    this.longitude = longitude;
    this.parentId = parentId;
    this.state = state;
    this.date = date;
}

@Generated(hash = 375979639)
public Location() {
}

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocationTypeId() {
        return locationTypeId;
    }

    public void setLocationTypeId(String locationTypeId) {
        this.locationTypeId = locationTypeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}