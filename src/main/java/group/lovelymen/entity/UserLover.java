package group.lovelymen.entity;

import java.io.Serializable;

public class UserLover implements Serializable {
    private Long id;

    private Long userId;

    private Long loverId;

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

    public Long getLoverId() {
        return loverId;
    }

    public void setLoverId(Long loverId) {
        this.loverId = loverId;
    }
}