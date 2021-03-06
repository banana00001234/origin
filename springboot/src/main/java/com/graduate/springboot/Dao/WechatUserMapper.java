package com.graduate.springboot.Dao;

import com.graduate.springboot.Dao.entity.WechatUser;

import java.util.List;

public interface WechatUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechatuser_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechatuser_info
     *
     * @mbg.generated
     */
    int insert(WechatUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechatuser_info
     *
     * @mbg.generated
     */
    int insertSelective(WechatUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechatuser_info
     *
     * @mbg.generated
     */
    WechatUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechatuser_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(WechatUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechatuser_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(WechatUser record);
    WechatUser selectByOpenid(String openid);
    WechatUser selectBySessionKey(String custom_code);
}