package cn.nike.stu_mangement.services;


import cn.nike.stu_mangement.dao.DaoStuTable;
import cn.nike.stu_mangement.entity.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class StuManagement {
    @Autowired
    private DaoStuTable daostu;
    public List<Stu> QueryAllStu() {
        return daostu.getAllStu();
    }
    public Stu QueryStuById(int id) {
        return daostu.getStuById(id);
    }
    public List<Stu>QueryStuByName(String stuName) {
        return daostu.getStuByName(stuName);
    }
    public Stu QueryStuBysno(String sno) {

        return daostu.getStuBySno(sno);
    }

    public void addStu(Stu stu) throws Exception{
        //if(daostu.insertStu(stu.getSno(),stu.getSname(),stu.getGrades(),stu.getMajor(),stu.getEmail(),stu.getTel()))
        if(!daostu.insertStu(stu))throw new Exception("插入失败！");
    }

    public void updateStu(Stu stu) throws Exception{
        if(!daostu.updateStu(stu))throw new Exception("修改失败");
    }

    public void deleteStu(int id) throws Exception{
        if(!daostu.deleteStu(id))throw new Exception("删除失败!");
    }
}
