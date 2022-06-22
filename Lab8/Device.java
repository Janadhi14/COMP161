public class Device{
    private String model;
    private boolean wiFi;
    private int usb;
    private double price;
    //public methods now
    public Device(){}
    /** replacement constructor */
    public Device(String model, boolean wiFi, int usb){
       this.model = model;
       this.wiFi = wiFi;
       this.usb = usb;
    }
    /** mutators */
    public void setPrice(double price){
       price = price;
    }
    /** accessors */
    public int getUSB(){
       return usb;
    }
 
    public double getPrice(){
       return price;
    }
    public String getModel(){
       return model;
    }
 }