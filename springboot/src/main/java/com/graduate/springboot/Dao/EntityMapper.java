package com.graduate.springboot.Dao;

import com.graduate.springboot.Dao.entity.Entity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface EntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announcement
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer annId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announcement
     *
     * @mbg.generated
     */
    int insert(Entity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announcement
     *
     * @mbg.generated
     */
    int insertSelective(Entity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announcement
     *
     * @mbg.generated
     */
    Entity selectByPrimaryKey(Integer annId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announcement
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Entity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announcement
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Entity record);

    List<Entity> selectAnn();
}