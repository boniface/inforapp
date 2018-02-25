package za.ac.cput.inforshare.repository.db.model.security;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MUAMBA on 2/15/2018.
 */

@Entity(nameInDb = "LogInStatus")
public class LogInStatus {

    @Property(nameInDb = "status")
    private String status;
    @Generated(hash = 1364294609)
    public LogInStatus(String status) {
        this.status = status;
    }

    @Generated(hash = 1944898521)
    public LogInStatus() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
