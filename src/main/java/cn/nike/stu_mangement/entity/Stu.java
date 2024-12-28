package cn.nike.stu_mangement.entity;

public class Stu {
    private int id;
    private String sno;
    private String sname;
    private String major;
    private double grades;
    private String email;
    private String tel;
    public Stu() {}
    public Stu(int id, String sno,String sname, String major, double grades, String email, String tel) {
        this.id = id;
        this.sno = sno;
        this.sname = sname;
        this.major = major;
        this.grades = grades;
        this.email = email;
        this.tel = tel;

    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    @Override
    public String toString() {
        return "Stu [id=" + id + ",sno="+sno+", sname=" + sname + ", major="+ major +
                ", grades=" + grades + ", email=" + email + ", tel=" + tel + "]";
    }
}
