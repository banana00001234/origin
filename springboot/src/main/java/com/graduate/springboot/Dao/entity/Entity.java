package com.graduate.springboot.Dao.entity;

import java.io.Serializable;
import java.util.Date;

public class Entity implements Serializable {
    private static final long serialVersionUID =1L;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column announcement.ann_Id
     *
     * @mbg.generated
     */
    private Integer annId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column announcement.ann_pic_url
     *
     * @mbg.generated
     */
    private String annPicUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column announcement.ann_title
     *
     * @mbg.generated
     */
    private String annTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column announcement.ann_content
     *
     * @mbg.generated
     */
    private String annContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column announcement.ann_datetime
     *
     * @mbg.generated
     */
    private Date annDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column announcement.ann_author
     *
     * @mbg.generated
     */
    private String annAuthor;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column announcement.ann_Id
     *
     * @return the value of announcement.ann_Id
     *
     * @mbg.generated
     */
    public Integer getAnnId() {
        return annId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column announcement.ann_Id
     *
     * @param annId the value for announcement.ann_Id
     *
     * @mbg.generated
     */
    public void setAnnId(Integer annId) {
        this.annId = annId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column announcement.ann_pic_url
     *
     * @return the value of announcement.ann_pic_url
     *
     * @mbg.generated
     */
    public String getAnnPicUrl() {
        return annPicUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column announcement.ann_pic_url
     *
     * @param annPicUrl the value for announcement.ann_pic_url
     *
     * @mbg.generated
     */
    public void setAnnPicUrl(String annPicUrl) {
        this.annPicUrl = annPicUrl == null ? null : annPicUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column announcement.ann_title
     *
     * @return the value of announcement.ann_title
     *
     * @mbg.generated
     */
    public String getAnnTitle() {
        return annTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column announcement.ann_title
     *
     * @param annTitle the value for announcement.ann_title
     *
     * @mbg.generated
     */
    public void setAnnTitle(String annTitle) {
        this.annTitle = annTitle == null ? null : annTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column announcement.ann_content
     *
     * @return the value of announcement.ann_content
     *
     * @mbg.generated
     */
    public String getAnnContent() {
        return annContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column announcement.ann_content
     *
     * @param annContent the value for announcement.ann_content
     *
     * @mbg.generated
     */
    public void setAnnContent(String annContent) {
        this.annContent = annContent == null ? null : annContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column announcement.ann_datetime
     *
     * @return the value of announcement.ann_datetime
     *
     * @mbg.generated
     */
    public Date getAnnDatetime() {
        return annDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column announcement.ann_datetime
     *
     * @param annDatetime the value for announcement.ann_datetime
     *
     * @mbg.generated
     */
    public void setAnnDatetime(Date annDatetime) {
        this.annDatetime = annDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column announcement.ann_author
     *
     * @return the value of announcement.ann_author
     *
     * @mbg.generated
     */
    public String getAnnAuthor() {
        return annAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column announcement.ann_author
     *
     * @param annAuthor the value for announcement.ann_author
     *
     * @mbg.generated
     */
    public void setAnnAuthor(String annAuthor) {
        this.annAuthor = annAuthor == null ? null : annAuthor.trim();
    }
}