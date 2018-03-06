package za.ac.cput.inforshare.repository.db.model.contents;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;



/**
 * Created by MUAMBA on 2/14/2018.
 */


@Entity(nameInDb = "Category")
public class Category {

    @Property(nameInDb = "id  ")
    private String id;

    @Property(nameInDb = "name  ")
    private String name;

    @Property(nameInDb = "description  ")
    private String description;

@Generated(hash = 505596883)
public Category(String id, String name, String description) {
    this.id = id;
    this.name = name;
    this.description = description;
}

@Generated(hash = 1150634039)
public Category() {
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
}

