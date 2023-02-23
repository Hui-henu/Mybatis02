package com.feri.mybatis.dao;

import com.feri.mybatis.entity.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * .::::.
 * .::::::::.
 * :::::::::::  I && YOU
 * ..:::::::::::'
 * '::::::::::::'
 * .::::::::::
 * '::::::::::::::..
 * ..::::::::::::.
 * ``::::::::::::::::
 * ::::``:::::::::'        .:::.
 * ::::'   ':::::'       .::::::::.
 * .::::'      ::::     .:::::::'::::.
 * .:::'       :::::  .:::::::::' ':::::.
 * .::'        :::::.:::::::::'      ':::::.
 * .::'         ::::::::::::::'         ``::::.
 * ...:::           ::::::::::::'              ``::.
 * ````':.          ':::::::::'                  ::::..
 * '.:::::'                    ':'````..
 * ━━━━━━永无BUG!━━━━━━
 *
 * @Description:
 * @Author: 邢朋辉
 * @Date: 2023/2/23 09:35
 */
public interface TeacherDao {
    /**
     * 新增*/
    @Insert("insert into t_teacher(name,sex,ctime) values(#{name},#{sex},now())")
    @Options(useGeneratedKeys = true,keyProperty = "id")//获取自增主键的值
    int insert(Teacher teacher);
    /**
     * 查询*/
    @Select("select * from t_teacher ")
    @ResultType(Teacher.class)//设置查询行对应的数据类型
    List<Teacher> all();
    /**
     * 修改
     * @param name 要修改讲师的名称
     * @param id 对应的id*/
    @Update("update t_teacher set name=#{name} where id=#{id}")
    int update(@Param("id") int id,@Param("name") String name);
    /**
     * 删除*/
    @Delete("delete  from t_teacher where id=#{id}")
    int del(int id);

}
