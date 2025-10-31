interface Student{
  void displayGrade();
  void attendance();
}
class PG_Student implements Student{
  public void displayGrade(){
    System.out.println("PG student Grade:A");
  }
  public void attendance(){
    System.out.println("PG Student Attendance: 90%");
  }
}
class UG_Student implements Student{
  public void displayGrade(){
    System.out.println("UG student Grade:B");
  }
  public void attendance(){
    System.out.println("UG Student Attendance: 85%");
  }
}

public class InterfaceDemo {
  public static void main(String[] args) {
      Student pg = new PG_Student();
      Student ug = new UG_Student();
      pg.displayGrade();
      pg.attendance();
      ug.attendance();
      ug.displayGrade();
  }
}
