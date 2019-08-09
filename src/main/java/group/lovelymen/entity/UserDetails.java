package group.lovelymen.entity;

import java.io.Serializable;

public class UserDetails implements Serializable {
    private Long id;

    private String treeHoleId;

    private String password;

    private String portraitImage;

    private String sex;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTreeHoleId() {
        return treeHoleId;
    }

    public void setTreeHoleId(String treeHoleId) {
        this.treeHoleId = treeHoleId == null ? null : treeHoleId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPortraitImage() {
        return portraitImage;
    }

    public void setPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage == null ? null : portraitImage.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
}