package ArrayBased;

//overrloding constreuter
class TeacherRight {
    private  Integer teacherId;
    private  String teacherName;
    private  String teacherCourse;
    TeacherRight(Integer teacherId, String teacherName, String teacherCourse) {
     this.teacherId=teacherId;
        this.teacherCourse=teacherCourse;
        this.teacherName=teacherName;
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
public class TestHacker {
    public static void main(String[] args) {
        TeacherRight r=new TeacherRight(67,"saqihjhj","computer scince");
        System.out.println(r.getTeacherId());
        System.out.println(r.getTeacherCourse());
        System.out.println(r.ghetTecacherNmae());
    }
}
