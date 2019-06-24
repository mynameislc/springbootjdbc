package com.lc.springbootjdbc.bean;

/**
 * @BelongsProject: springbootjdbc
 * @BelongsPackage: com.lc.springbootjdbc.bean
 * @Author: lc
 * @CreateTime: 2019-06-08 19:09
 * @Description:
 */
public class food {
    private Integer id;
    private String title;
    private String detail_img;
    private String detail_content;
    private String date;
    private String author;
    private String avatar;
    private String detail_love_image1;
    private String detail_love_image2;
    private String love_count;
    private String attention_count;
    private String headImgSrc;
    private String detail;
    private music music;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail_img() {
        return detail_img;
    }

    public void setDetail_img(String detail_img) {
        this.detail_img = detail_img;
    }

    public String getDetail_content() {
        return detail_content;
    }

    public void setDetail_content(String detail_content) {
        this.detail_content = detail_content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDetail_love_image1() {
        return detail_love_image1;
    }

    public void setDetail_love_image1(String detail_love_image1) {
        this.detail_love_image1 = detail_love_image1;
    }

    public String getDetail_love_image2() {
        return detail_love_image2;
    }

    public void setDetail_love_image2(String detail_love_image2) {
        this.detail_love_image2 = detail_love_image2;
    }

    public String getLove_count() {
        return love_count;
    }

    public void setLove_count(String love_count) {
        this.love_count = love_count;
    }

    public String getAttention_count() {
        return attention_count;
    }

    public void setAttention_count(String attention_count) {
        this.attention_count = attention_count;
    }

    public String getHeadImgSrc() {
        return headImgSrc;
    }

    public void setHeadImgSrc(String headImgSrc) {
        this.headImgSrc = headImgSrc;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public com.lc.springbootjdbc.bean.music getMusic() {
        return music;
    }

    public void setMusic(com.lc.springbootjdbc.bean.music music) {
        this.music = music;
    }
}