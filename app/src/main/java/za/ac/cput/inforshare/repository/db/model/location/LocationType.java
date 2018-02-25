package za.ac.cput.inforshare.repository.db.model.location;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MUAMBA on 2/14/2018.
 */

@Entity(nameInDb = "LocationType")
public class LocationType {

    @Property(nameInDb = "id  ")
    private String id;

    @Property(nameInDb = "name  ")
    private String name;

    @Property(nameInDb = "code  ")
    private String code;

    @Property(nameInDb = "state  ")
    private String state;

@Generated(hash = 181863257)
public LocationType(String id, String name, String code, String state) {
    this.id = id;
    this.name = name;
    this.code = code;
    this.state = state;
}

@Generated(hash = 317781457)
public LocationType() {
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
