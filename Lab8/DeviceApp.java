public class DeviceApp{
   public static void main(String[] args){
      Device device1 = new Device("NB42", true, 5);
      Device device2 = new Device("PI53", false, 4);
      System.out.println(maxUSB(device1, device2).getModel());
   }

   // see how we use a public static Device  statement which measn we are suing it as an instance 
   public static Device maxUSB(Device a, Device b){
      if(a.getUSB()>b.getUSB())
         return a;
         else return b;  
   }
}

// 