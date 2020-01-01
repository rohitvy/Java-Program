package Compusition1;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {    
        Dimension dimensions = new Dimension(20,20,5);
        Case theCase = new Case("220","Dell","240",dimensions);

        Resolution resolution = new Resolution(360,480);
        Monitor theMonitor = new Monitor("LED","ACER",16,resolution);

        Motherboard theMotherboard = new Motherboard("Octa-core","Intel",2,2,"Unix");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);
        
        // The Case methods
        System.out.println("CASE");
        thePC.getCase().powerOn();
        // The Monitor methods
        System.out.println("Monitor");
        thePC.getMonitor().drawPixelAt(10,10,"blue");
        // The Motherboard methods
        System.out.println("Motherboard");
        thePC.getMotherboard().loadProgram("programName");
    }
}