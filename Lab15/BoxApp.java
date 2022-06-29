public class BoxApp{
    public static void main(String [] Args){
        Box[] boxes = {new Box(5.1), new Box(2.2, 4, 6), new Box(3.5), new Box(4), new Box(19.2, 4.4, 1)};// notice this is an array fo type box because this is not a primitve type, this is a reference type 
        for(Box box: boxes){ // this is a referece type
            System.out.println(box);
        }
        if(getLargestBoxBySA(boxes)==getLargestBoxByVol(boxes)){ 
            System.out.println("The same box is biggest by volume and by surface area."); 
        }
        else{
            System.out.println("2 different boxes are biggest by volume vs surface area.");
        }   
    }

    public static Box getLargestBoxByVol(Box[] boxes){ // dont understand this wehre its of type box // see we are returning a box type 
        Box largestBox = boxes[0]; // decalrinign a vairable of type box that keeps track of the largest box, similar to the temps , whre we set the largest box to a size of 0
        for (Box box: boxes){
            if (box.getVolume() > largestBox.getVolume()){ // calling the getvolum method adn check against teh current box that is being run 
                // so that if the current box is larger than the previous largest box it becomes the alrgest box 
                largestBox =  box;
            }
        }
        return largestBox; // returns a type of box that is the largest by volume 
    }
    
    
    
    public static Box getLargestBoxBySA(Box[] boxes){ // dont understand this wehre its of type box // see we are returning a box type 
        Box largestBoxBySA = boxes[0]; // decalrinign a vairable of type box that keeps track of the largest box, similar to the temps , whre we set the largest box to a size of 0
        for (Box box: boxes){
            if (box.getSurfaceArea() > largestBoxBySA.getSurfaceArea()){ // calling the getvolum method adn check against teh current box that is being run 
                // so that if the current box is larger than the previous largest box it becomes the alrgest box 
                largestBoxBySA =  box;
            }
        }
        return largestBoxBySA; // returns a type of box that is the largest by volume 
    }
}

// from this code we can see that we are able to give in inputs of the height, wdth and length and then see if the 

// we want to write a method that will return the box with teh largest surface area 