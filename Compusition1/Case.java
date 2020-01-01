package Compusition1;

/**
 * Case
 */
public class Case {
    private String model;
    private String manufecturer;
    private String powerSupply;
    private Dimension dimensions;

    public Case(String model, String manufecturer, String powerSupply, Dimension dimensions)
    {
        this.model = model;
        this.manufecturer= manufecturer;
        this.powerSupply = powerSupply;
        this.dimensions =dimensions;
    }

    public void powerOn()
    {
        System.out.println("Power ON...");
    }
    public String getModel()
    {
        return model;
    }
    public String getManufecturer()
    {
        return manufecturer;
    }
    public String getPowerSupply()
    {
        return powerSupply;
    }
    public Dimension getDimensions()
    {
        return dimensions;
    }
}