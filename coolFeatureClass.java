public class CoolFeatureClass
{
    private int intField;
    private string strField;

    public CoolFeatureClass(int i, string s)
    {
        this.intField = i;
        this.strField = s;
    }

    /* Getters/Setters Methods */

    public int getIntField()
    {
        return intField;
    }

    public void setIntField(int value)
    {
        intField = value;
    }

    public int getStrField()
    {
        return strField;
    }

    public void setStrField(string value)
    {
        strField = value;
    }
}