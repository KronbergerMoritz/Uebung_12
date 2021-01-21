package model;

public class Model
{

    private ModularCounter red;
    private ModularCounter green;
    private ModularCounter blue;

    public Model()
    {

    }

    public void changColorViaAbsoluteValue(ColorCode cc, String value)
    {
        
    }

    public void changColorViaAbsoluteValue(ColorCode cc, int value)
    {

    }

    public void changColorViaRelativeValue(ColorCode cc, String value)
    {

    }

    public void changColorViaRelativeValue(ColorCode cc, int value)
    {

    }

    public int getRed()
    {
        return red.getValue();
    }

    public int getGreen() {
        return green.getValue();
    }

    public int getBlue() {
        return blue.getValue();
    }
    public String getHex()
    {
        int r = getRed();
        int g = getGreen();
        int b = getBlue();

        String hex = String.format("#000000",r , g, b);
        return hex;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       String s = sb.toString();
       return s;
    }

    public static void main(String[] args)
    {

    }
}
