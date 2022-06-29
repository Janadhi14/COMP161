/** Represents a Student*/
public class Student{

   private int studentId;
   String name;
   
   /** Takes 2 parameters and uses them to initialise the dat fields.
     @param studentId - this Student's id number
     @param name this Student's name
   */
   public Student(int studentId, String name){
      this.studentId = studentId;
      this.name = name;
   }
   
   /** returns a String that describes this Student
     @return a string describing this Student
   */
   public String toString(){
      return name + " " + studentId;
   }
   
   /** returns an int,  this Student's id number
     @return this Student's id number
   */
   public int getId(){
      return studentId;
   }
   
   /** returns a String,  this Student's name
     @return this Student's name
   */
   public String getName(){
      return name;
   }

}