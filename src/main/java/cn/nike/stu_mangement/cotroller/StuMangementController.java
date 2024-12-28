package cn.nike.stu_mangement.cotroller;

import cn.nike.stu_mangement.entity.Stu;
import cn.nike.stu_mangement.services.StuManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/stu")
@CrossOrigin(origins = "http://localhost:8080")
public class StuMangementController {
    @Autowired
    StuManagement stuManagement;
    @RequestMapping("/getallstu")
    public List<Stu>GetAllStu(){
        List<Stu> students=stuManagement.QueryAllStu();
        if(students==null){
            System.out.println("Controller--students is null");
            return null;
        }
        //students.forEach(student->System.out.println(student));
        return students;
    }
    @RequestMapping("/getstubyid/{id}")
    public Stu GetStuById(@PathVariable int id){
        return stuManagement.QueryStuById(id);
    }
    @RequestMapping("/getstubysno/{sno}")
    public Stu GetStuBySno(@PathVariable String sno){
        return stuManagement.QueryStuBysno(sno);
    }
    @RequestMapping("/getstubyname/{name}")
    public List<Stu> GetStuByName(@PathVariable String name){
        return stuManagement.QueryStuByName(name);
    }
    @RequestMapping(value="/add" ,method = RequestMethod.POST)
    public void AddStu(@RequestBody Stu stu) throws Exception {

        stuManagement.addStu(stu);
        System.out.println("添加成功");
    }
    @PutMapping("/update")
    public void UpdateStu(@RequestBody Stu stu) throws Exception {
        System.out.println(stu);
        stuManagement.updateStu(stu);
    }
    @RequestMapping("/delete")
    public void deleteStu(@RequestBody Stu stu) throws Exception {
        System.out.println("到达后端");
        System.out.println(stu);
        int id=stu.getId();
        stuManagement.deleteStu(id);
    }
}
