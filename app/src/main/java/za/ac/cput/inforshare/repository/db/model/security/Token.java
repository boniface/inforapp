package za.ac.cput.inforshare.repository.db.model.security;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MUAMBA on 2/15/2018.
 */
@Entity(nameInDb = "Token")
public class Token {

    @Property(nameInDb = "id")
    private String id;

    @Property(nameInDb = "tokenValue  ")
    private String tokenValue;

    @Generated(hash = 582824165)
    public Token(String id, String tokenValue) {
        this.id = id;
        this.tokenValue = tokenValue;
    }

    @Generated(hash = 79808889)
    public Token() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }
}
