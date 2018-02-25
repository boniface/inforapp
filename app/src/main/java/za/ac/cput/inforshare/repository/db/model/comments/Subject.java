package za.ac.cput.inforshare.repository.db.model.comments;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;
/**
 * Created by MUAMBA on 2/14/2018.
 */


    @Entity(nameInDb = "Subject")
    public class Subject {


        @Property(nameInDb = "siteId  ")
        private String siteId  ;

        @Property(nameInDb = "subjectId  ")
        private String subjectId  ;

        @Property(nameInDb = "name  ")
        private String name  ;

        @Property(nameInDb = "url")
        private String url ;

        @Property(nameInDb = "date")
        private Date date;
@Generated(hash = 1812999756)
public Subject(String siteId, String subjectId, String name, String url, Date date) {
    this.siteId = siteId;
    this.subjectId = subjectId;
    this.name = name;
    this.url = url;
    this.date = date;
}

@Generated(hash = 1617906264)
public Subject() {
}

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
