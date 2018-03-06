package za.ac.cput.inforshare.repository.db.model.demographics;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MUAMBA on 2/14/2018.
 */


@Entity(nameInDb = "MaritalStatus")
public class MaritalStatus {

    @Property(nameInDb = "id  ")
    private String id;

    @Property(nameInDb = "name  ")
    private String name;

    @Property(nameInDb = "state  ")
    private String state;

@Generated(hash = 1460026454)
public MaritalStatus(String id, String name, String state) {
    this.id = id;
    this.name = name;
    this.state = state;
}

@Generated(hash = 1560619158)
public MaritalStatus() {
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}


