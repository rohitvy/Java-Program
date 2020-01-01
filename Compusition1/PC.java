package Compusition1;

/**
 * PC
 */
public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard)
    {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }

    public Case getCase()
    {
        return theCase;
    }
    public Monitor getMonitor()
    {
        return theMonitor;
    }
    public Motherboard getMotherboard()
    {
        return theMotherboard;
    }
}