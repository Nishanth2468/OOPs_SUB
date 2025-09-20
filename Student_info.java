public class Student_info {
  String name;
   int rollnumber;
   double marks;
   
    void displaydetails() {
      System.out.println("Name :" + name);
      System.out.println("Roll number:" + rollnumber);
      System.out.println("Marks : " + marks);
    }
    public static void main(String[] args) {
      // TODO Auto-generated method stub
       Student_info aizen = new Student_info();
       aizen.name = "ram";
       aizen.rollnumber = 128;
       aizen.marks = 9.9;
    
    aizen.displaydetails();
}
}