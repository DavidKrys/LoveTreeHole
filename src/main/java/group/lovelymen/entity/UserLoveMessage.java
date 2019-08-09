package group.lovelymen.entity;

import java.io.Serializable;
import java.util.Date;

public class UserLoveMessage implements Serializable {
    private Long id;

    private Long userId;

    private String loveMessage;

    private Date createdTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLoveMessage() {
        return loveMessage;
    }

    public void setLoveMessage(String loveMessage) {
        this.loveMessage = loveMessage == null ? null : loveMessage.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}