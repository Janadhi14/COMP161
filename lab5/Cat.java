import java.util.Scanner;
/** default example*/
public class Cat{
   private String name;
   private String breed;
   private double age;
   private char sex;
   private boolean neutered;
   
   /** default constructor  */
   public Cat(){
   }
   /** constructor for the cat */
   public Cat(String na, String br, double ag, char sx, boolean nu){
   name = na;
   breed = br;
   age = ag;
   sex = sx;
   neutered = nu;
   }

   /**accessor for dog breed*/
   public String getName(){
      return name;
   }
   /**accessor for dog registration number*/
   public String getBreed(){
      return breed;
   }
   /**accessor for dog age*/
   public double getAge(){
      return age;
   }
   /** accessor for cat sex**/
   public char getSex(){
      return sex;
   }
   
   /**accessor for whether dog is microchipped*/
   public boolean getNeutered(){
      return neutered;
   }

   // now we need to write the set methods (accesors)
   //notice how we have to state what type of varible it is for a get method
   public void setName(int ag){
      age = ag;
   }

   public void setBreed(String br ){
      breed = br;
   }
   
   public void setAge(int ag){
      age = ag;
   }

   public void setNeutered(boolean nu){
      neutered = nu;
   }

   public void setName(String na){
      name = na;
  }
   

   public void displayCat(){
   System.out.println(name  + " is a " + age + " year old " + "(" + sex + "), " + neutered);
   }
}
