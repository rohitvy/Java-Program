package Compusition1;

/**
 * Monitor
 */
public class Monitor {

    private String model;
    private String manufecturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor (String model, String manufecturer, int size, Resolution nativeResolution)
    {
        this.model = model;
        this.manufecturer= manufecturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color)
    {
        System.out.println("Drawing pixel at " + x + " , " + y + " in color " + color);
    }

    public String getModel()
    {
        return model;
    }
    public String getManufecturer()
    {
        return manufecturer;
    }
    public int getSize()
    {
        return size;
    }
    public Resolution getNativResolution()
    {
        return nativeResolution;
    }
}