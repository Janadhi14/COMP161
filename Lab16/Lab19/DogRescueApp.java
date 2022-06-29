import java.util.*;

/** Application class to manage Dog objects*/
public class DogRescueApp{
   private static ArrayList<Dog> currentDogs;
   
   public static void main(String[]args){ 
     
      currentDogs = new ArrayList<Dog> (Arrays.asList(
                   new Dog("Nan","Corgi", 'f', 7564, 12, true, "small"),
                   new Dog("Giles","Schnauzer",'m', 9457, 5, true, "medium"),
                   new Dog("Remus","Labrador",'m', 5623, 3, true, "large"),
                   new Dog("Carriad", "Golden Retriever", 'f', 2457, 5, true, "large"),
                   new Dog("Muttleigh","Mixed", 'f', 7457, 4, true, "small"),
                   new Dog("Mrs Jones", "Miniature Schnauzer", 'f', 1238, 0, false, "small"),
                   new Dog("Brian","Mixed", 'm', 9234, 5, true, "medium"),
                   new Dog("Beth", "Border Collie", 'f',9257, 7, false, "medium"),
                   new Dog("Jodie","Labrador",'f', 6547, 5, true, "large"),
                   new Dog("Vicar","Mixed",'m', 7896, 8, true, "small"),
                   new Dog("Trevor","Mixed",'m', 5489, 14, true, "large"),
                   new Dog("Buster RIP","Fox Terrier",'m', 2659, 3, true, "small"),
                   new Dog("Elsie", "Border Collie",'f', 7349, 5, true, "medium"),
                   new Dog("Prudence", "Poodle", 'f', 1356, 15, true, "large"),
                   new Dog("Stan", "Mixed", 'm', 9823, 7, false, "small"),
                   new Dog("Tud mya", "Jack Russell Terrier",'m', 5357, 5, true, "small"),
                   new Dog("Chloe", "Labrador",'f',  9447, 7, true, "large"),
                   new Dog("The Duchess","Mixed", 'f', 9422, 8, true, "small"),
                   new Dog("Marilyn", "Golden Retriever", 'm',3358, 6, true, "large"),
                   new Dog("Einstein","Border Colloodle", 'm', 6291, 5, true, "medium"),
                   new Dog("Molly", "Fox Terrier", 'f', 2947, 2, true, "small")));
                   
      System.out.println("\nWelcome to the Dog Rescue Trust!\nOur current dogs:\n");
   }
}
         
   
