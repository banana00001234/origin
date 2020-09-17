package com.graduate.springboot.Dao.entity;

import java.io.Serializable;
import java.util.Date;

public class WechatUser implements Serializable {
    private static final long serialVersionUID =1L;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechatuser_info.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechatuser_info.openid
     *
     * @mbg.generated
     */
    private String openid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechatuser_info.custom_code
     *
     * @mbg.generated
     */
    private String customCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechatuser_info.nickName
     *
     * @mbg.generated
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechatuser_info.gender
     *
     * @mbg.generated
     */
    private Integer gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechatuser_info.language
     *
     * @mbg.generated
     */
    private String language;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechatuser_info.country
     *
     * @mbg.generated
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechatuser_info.city
     *
     * @mbg.generated
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechatuser_info.province
     *
     * @mbg.generated
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechatuser_info.last_login
     *
     * @mbg.generated
     */
    private Date lastLogin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechatuser_info.avatarUrl
     *
     * @mbg.generated
     */
    private String avatarurl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechatuser_info.id
     *
     * @return the value of wechatuser_info.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechatuser_info.id
     *
     * @param id the value for wechatuser_info.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechatuser_info.openid
     *
     * @return the value of wechatuser_info.openid
     *
     * @mbg.generated
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechatuser_info.openid
     *
     * @param openid the value for wechatuser_info.openid
     *
     * @mbg.generated
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechatuser_info.custom_code
     *
     * @return the value of wechatuser_info.custom_code
     *
     * @mbg.generated
     */
    public String getCustomCode() {
        return customCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechatuser_info.custom_code
     *
     * @param customCode the value for wechatuser_info.custom_code
     *
     * @mbg.generated
     */
    public void setCustomCode(String customCode) {
        this.customCode = customCode == null ? null : customCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechatuser_info.nickName
     *
     * @return the value of wechatuser_info.nickName
     *
     * @mbg.generated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechatuser_info.nickName
     *
     * @param nickname the value for wechatuser_info.nickName
     *
     * @mbg.generated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechatuser_info.gender
     *
     * @return the value of wechatuser_info.gender
     *
     * @mbg.generated
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechatuser_info.gender
     *
     * @param gender the value for wechatuser_info.gender
     *
     * @mbg.generated
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechatuser_info.language
     *
     * @return the value of wechatuser_info.language
     *
     * @mbg.generated
     */
    public String getLanguage() {
        return language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechatuser_info.language
     *
     * @param language the value for wechatuser_info.language
     *
     * @mbg.generated
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechatuser_info.country
     *
     * @return the value of wechatuser_info.country
     *
     * @mbg.generated
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechatuser_info.country
     *
     * @param country the value for wechatuser_info.country
     *
     * @mbg.generated
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechatuser_info.city
     *
     * @return the value of wechatuser_info.city
     *
     * @mbg.generated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechatuser_info.city
     *
     * @param city the value for wechatuser_info.city
     *
     * @mbg.generated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechatuser_info.province
     *
     * @return the value of wechatuser_info.province
     *
     * @mbg.generated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechatuser_info.province
     *
     * @param province the value for wechatuser_info.province
     *
     * @mbg.generated
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechatuser_info.last_login
     *
     * @return the value of wechatuser_info.last_login
     *
     * @mbg.generated
     */
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechatuser_info.last_login
     *
     * @param lastLogin the value for wechatuser_info.last_login
     *
     * @mbg.generated
     */
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechatuser_info.avatarUrl
     *
     * @return the value of wechatuser_info.avatarUrl
     *
     * @mbg.generated
     */
    public String getAvatarurl() {
        return avatarurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechatuser_info.avatarUrl
     *
     * @param avatarurl the value for wechatuser_info.avatarUrl
     *
     * @mbg.generated
     */
    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl == null ? null : avatarurl.trim();
    }
}