package za.ac.cput.inforshare.repository.db.model.demographics;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MUAMBA on 2/14/2018.
 */

@Entity(nameInDb = "Role")
public class Role {

    @Property(nameInDb = "id  ")
    private String id;

    @Property(nameInDb = "name  ")
    private String name;

    @Property(nameInDb = "description  ")
    private String description;

    @Property(nameInDb = "state  ")
    private String state;


    public Role (String id,String name, String description, String state ) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.state = state;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
