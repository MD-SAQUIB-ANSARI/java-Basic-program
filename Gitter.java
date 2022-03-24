package ArrayBased;
//import java.util.*;
class  Teacher1{
    private  Integer teacherId;
    private  String teacherName;
    private  String teacherCourse;
    public void setTeacherName()
    {
     this.teacherName=teacherName;
    }
    public  void setTeacherId()
    {
        this.teacherId=teacherId;
    }
    public void setTeacherCourse()
    {
        this.teacherCourse=teacherCourse;
    }
    public Integer getTeacherId()
    {
        return this.teacherId;
    }
    public String ghetTecacherNmae()
    {
        return this.teacherName;
    }
    public String getTeacherCourse()
    {
        return teacherCourse;
    }
}
public class Gitter {
    public static void main(String[] args) {
       Teacher1 R=new Teacher1();
       R.setTeacherId();
//       R.setTeacherName("gdghghv");
//       R.setTeacherCourse("xxxxxxxxxxxx");
        System.out.println(R.getTeacherId());
        System.out.println(R.ghetTecacherNmae());
        System.out.println(R.getTeacherCourse());
    }
}






