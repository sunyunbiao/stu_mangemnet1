package cn.nike.stu_mangement.dao;

import cn.nike.stu_mangement.entity.Stu;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Mapper
public interface DaoStuTable {
    //各种查询操作
    @Select("select * from stu where id=#{id}")
    public Stu getStuById(int id);
    @Select("select * from stu where sno=#{sno}")
    public Stu getStuBySno(String sno);
    @Select("select * from stu ")
    public List<Stu> getAllStu();
    @Select("select * from stu where sname like concat('%',#{name},'%')")
    public List<Stu> getStuByName(String name);

    //各种添加操作
    @Insert("insert into stu(sno,sname,major,grades,email,tel) values (#{sno},#{sname},#{major},#{grades},#{email},#{tel})")
    public boolean insertStu( Stu stu);

    //修改
    @Update("update stu set sno= #{sno},sname=#{sname},major=#{major},grades=#{grades},email=#{email},tel=#{tel} where id=#{id}")
    public boolean updateStu(Stu stu);
    @Delete("delete from stu where id=#{id}")
    public boolean deleteStu(int id);
}
