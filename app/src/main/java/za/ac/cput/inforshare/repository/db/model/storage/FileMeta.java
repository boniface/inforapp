package za.ac.cput.inforshare.repository.db.model.storage;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MUAMBA on 2/15/2018.
 */


@Entity(nameInDb = "FileMeta")
public class FileMeta {

    @Property(nameInDb = "fileName")
    private String fileName;

    @Property(nameInDb = "contentType")
    private String contentType;

    @Generated(hash = 596481423)
    public FileMeta(String fileName, String contentType) {
        this.fileName = fileName;
        this.contentType = contentType;
    }

    @Generated(hash = 156030689)
    public FileMeta() {
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
