package za.ac.cput.inforshare.repository.db.model.organisation;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by MUAMBA on 2/15/2018.
 */

@Entity(nameInDb = "OrganisationLogo")
public class OrganisationLogo {

    @Property(nameInDb = "org")
    private String org;

    @Property(nameInDb = "id  ")
    private String id;

    @Property(nameInDb = "url  ")
    private String url;

    @Property(nameInDb = "size  ")
    private String size;

    @Property(nameInDb = "description  ")
    private String description;

    @Property(nameInDb = "mime  ")
    private String mime;

    @Property(nameInDb = "date  ")
    private Date date;

    @Generated(hash = 1167166464)
    public OrganisationLogo(String org, String id, String url, String size, String description, String mime, Date date) {
        this.org = org;
        this.id = id;
        this.url = url;
        this.size = size;
        this.description = description;
        this.mime = mime;
        this.date = date;
    }

    @Generated(hash = 1440629347)
    public OrganisationLogo() {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

