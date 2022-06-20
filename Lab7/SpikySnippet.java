/** Takes a Graphics object and draws a number of lines to depict a spiky star whose points are    
* determined using trigonometry methods from the Math class
* CONTAINS CODE BEYOND WHAT WE HAVE COVERED AT THIS POINT
* @param g - a Graphics object  
*/   
public void drawSpiky(Graphics g) {        
	double ax, ay, bx, by;// coordinates of the pointy bits - determined in the loop using trigonometry   
	int   innerRadius =  radius / 2;    
	double angle = Math.PI /2;  //allows star to start from 'north' position       
	double pointBase = Math.PI / numPoints;//How many radians do we add to the angle before finding the next point     
	g.setColor(colour);      
	for ( int i = 0; i < numPoints; i++ ) {         
		ax = midX + radius * Math.cos( angle );         
		ay = midY - radius * Math.sin( angle );        
		g.drawLine(midX, midY, (int)ax, (int)ay);        
		angle += pointBase;         
		bx = midX + innerRadius * Math.cos( angle );         
		by = midY - innerRadius * Math.sin( angle );         
		g.drawLine(midX, midY, (int)bx, (int)by);         
		angle += pointBase;     
	}
}