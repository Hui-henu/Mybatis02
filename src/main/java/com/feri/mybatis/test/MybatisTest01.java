package com.feri.mybatis.test;

import com.feri.mybatis.dao.TeacherDao;
import com.feri.mybatis.entity.Teacher;
import com.feri.mybatis.util.MybatisUtil;
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
 * @Date: 2023/2/23 09:41
 */
public class MybatisTest01 {
    @Test
    public void t1(){
        TeacherDao dao= MybatisUtil.getMapper(TeacherDao.class);

        System.err.println(dao.insert(new Teacher("瑞哥",1)));
    }
    @Test
    public void t2(){
        TeacherDao dao= MybatisUtil.getMapper(TeacherDao.class);
        System.err.println(dao.all());
    }
    @Test
    public void t3(){
        TeacherDao dao= MybatisUtil.getMapper(TeacherDao.class);
        System.err.println(dao.update(1,"邢哥"));
    }
    @Test
    public void t4(){
        TeacherDao dao= MybatisUtil.getMapper(TeacherDao.class);
        System.err.println(dao.del(1));
    }
    @Test
    public void t5(){
        TeacherDao dao= MybatisUtil.getMapper(TeacherDao.class);
        Teacher teacher=new Teacher("令娜",2);
        System.err.println(dao.insert(teacher));
        System.err.println(teacher.getId());
    }
}
