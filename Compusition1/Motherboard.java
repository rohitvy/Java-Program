package Compusition1;

/**
 * Motherboard
 */
public class Motherboard {

    private String model;
    private String manufecturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;
    
    public Motherboard (String model, String manufecturer, int ramSlots, int cardSlots, String bios)
    {
        this.model = model;
        this.manufecturer = manufecturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName)
    {
        System.out.println(programName + " is now loading.....");
    }

    public String getModel()
    {
        return model;
    }
    public String getManufecturer()
    {
        return manufecturer;
    }
    public int getRamSlots()
    {
        return ramSlots;
    }
    public int getCardSlots()
    {
        return cardSlots;
    }
    public String getBios()
    {
        return bios;
    }
}