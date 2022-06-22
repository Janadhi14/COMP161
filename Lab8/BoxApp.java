public class BoxApp{
    public static void main(String [] Args){
        Box box1 = new Box(2,2,2);
        Box box2 = new Box(2,2,2);
            if (box1.isCube()){// code that box1 is a cube  
                System.out.println("This box is a cube");

            } else {
                System.out.println("this box is not a cube");

            }
        if(box1.getVolume() < box2.getVolume()){
            System.out.println("box1 is smaller than box2.");
        } else if(box1.getVolume() == box2.getVolume()){
            System.out.println("both boxes have the same volume ");
        } else
            System.out.println("box1 is bigger than box2.");
        } 
    
    }

// from this code we can see that we are able to give in inputs of the height, wdth and length and then see if the 