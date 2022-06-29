/** Application class for Dog.java */
public class DogApp{
   public static void main(String[]args){ 
      Dog[] dogs = {new Dog("Nan","Corgi", 'f', 7564, 12, true, "small"),
                   new Dog("Giles","Schnauzer",'m', 9457, 5, true, "medium"),
                   new Dog("Remus","Labrador",'m', 5623, 3, true, "large"),
                   new Dog("Carriad", "Golden Retriever", 'f', 9457, 5, true, "large"),
                   new Dog("Muttleigh","Mixed", 'f', 7457, 4, true, "small"),
                   new Dog("Mrs Jones", "Miniature Schnauzer", 'f', 1238, 0, false, "small"),
                   new Dog("Brian","Mixed", 'm', 9234, 5, true, "medium"),
                   new Dog("Beth", "Border Collie", 'f',9457, 7, false, "medium"),
                   new Dog("Jodie","Labrador",'f', 6547, 5, true, "large"),
                   new Dog("Vicar","Mixed",'m', 7896, 8, true, "small"),
                   new Dog("Trevor","Mixed",'m', 5489, 14, true, "large"),
                   new Dog("Buster RIP","Fox Terrier",'m',  2659, 3, true, "small"),
                   new Dog("Elsie", "Border Collie",'f', 7349, 5, true, "medium"),
                   new Dog("Prudence", "Poodle", 'f', 1356, 15, true, "large"),
                   new Dog("Stan", "Mixed", 'm', 9823, 7, false, "small"),
                   new Dog("Tud mya", "Jack Russell Terrier",'m',  5357, 5, true, "small"),
                   new Dog("Chloe", "Labrador",'f',  9447, 7, true, "large"),
                   new Dog("The Duchess","Mixed", 'f', 9422, 8, true, "small"),
                   new Dog("Marilyn","Golden Retriever", 'm',3358, 6, true, "large"),
                   new Dog("Einstein","Border Colloodle", 'm', 6291, 5, true, "medium"),
                   new Dog("Molly", "Fox Terrier", 'f', 2947, 2, true, "small")};
      chippedDogs(dogs);
      namesofdogs("Mixed", dogs);
                  }
    // we need to write  a method that takes a reference to an array of dog objects and retunrs a count of how mant are not microchipped using the array provided 
    // and the print out how many are not microhipped using a reference to an array of dog objects 
      public static void chippedDogs(Dog [] dogs){
         int numMicroChipped = 0;
         int numNotMicroChipped = 0;
         for (Dog dog: dogs){
            if (dog.isMicroChipped() == true){
               numMicroChipped++;
            } else if (dog.isMicroChipped() == false){
               numNotMicroChipped++;
            }
      } System.out.println(numMicroChipped + " are microchipped and there are " + numNotMicroChipped + " that are not microchipped");
   } 


      public static void namesofdogs(String breed, Dog [] dogs){
         for(Dog dog: dogs){
            if (dog.getBreed().equals(breed)){
               System.out.println(dog.getName());
            }
         }
      
      

   } 

}