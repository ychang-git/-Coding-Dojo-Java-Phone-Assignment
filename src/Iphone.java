
public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
  @Override
   public String ring() {
       // your code here
	  return this.getRingTone();
  	
   }
  @Override
    public String unlock() {
       // your code here
	  return "Unlock with fingerprint";
	  
   }
    @Override
    public void displayInfo() {
    	System.out.println( "Iphone" + " " + this.getVersionNumber() + " " + this.getCarrier() + " " ) ;
    }
}