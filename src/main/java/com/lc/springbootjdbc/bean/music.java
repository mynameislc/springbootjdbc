package com.lc.springbootjdbc.bean;

/**
 * @BelongsProject: springbootjdbc
 * @BelongsPackage: com.lc.springbootjdbc.bean
 * @Author: lc
 * @CreateTime: 2019-06-08 19:09
 * @Description:
 */
public class music {
    private String dataUrl;
    private String title;
    private String coverImgUrl;

    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    public void setCoverImgUrl(String coverImgUrl) {
        this.coverImgUrl = coverImgUrl;
    }
}