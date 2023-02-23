package com.feri.mybatis.test;

import com.feri.mybatis.dao.TeacherDao;
import com.feri.mybatis.entity.Teacher;
import com.feri.mybatis.util.MybatisUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;

/**
 * ━━━━━━神兽出没━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　 ┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　  ┃
 * 　　┃　　　　　　 ┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛Code is far away from bug with the animal protecting
 * 　　　　┃　　　┃    神兽保佑,代码无bug
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━永无BUG!━━━━━━
 *
 * @Description:
 * @Author: 邢朋辉
 * @Date: 2023/2/23 10:06
 */
public class MybatisTest02 {
    @Test
    public void t1(){
        TeacherDao dao= MybatisUtil.getMapper(TeacherDao.class);
        //开启分页
        PageHelper.startPage(1,3);
        //自动拦截并实现分页拼接
        PageInfo<Teacher> pageInfo=new PageInfo<>(dao.all());
        System.err.println(pageInfo);
    }
}
