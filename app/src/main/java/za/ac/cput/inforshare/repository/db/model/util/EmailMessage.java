package za.ac.cput.inforshare.repository.db.model.util;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by MUAMBA on 2/15/2018.
 */


@Entity(nameInDb = "EmailMessage")
public class EmailMessage {

    @Property(nameInDb = "subject")
    private String subject;

    @Property(nameInDb = "recipient")
    private String recipient;

    @Property(nameInDb = "from")
    private String from;

    @Property(nameInDb = "text")
    private String text;

    @Property(nameInDb = "html")
    private String html;

    @Transient
    private SmtpConfig smtpConfig; // i'm not very sure about this line of code

    @Generated(hash = 75168220)
    public EmailMessage(String subject, String recipient, String from, String text, String html) {
        this.subject = subject;
        this.recipient = recipient;
        this.from = from;
        this.text = text;
        this.html = html;
    }

    @Generated(hash = 2006509433)
    public EmailMessage() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public SmtpConfig getSmtpConfig() {
        return smtpConfig;
    }

    public void setSmtpConfig(SmtpConfig smtpConfig) {
        this.smtpConfig = smtpConfig;
    }
}
