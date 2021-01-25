package model;

public class Model
{

    private ModularCounter red = new ModularCounter(0,256);
    private ModularCounter green = new ModularCounter(0,256);
    private ModularCounter blue = new ModularCounter(0,256);

    public Model()
    {

    }

    public void changColorViaAbsoluteValue(ColorCode cc, String value)
    {

    }

    public void changColorViaAbsoluteValue(ColorCode cc, int value)
    {
        if(cc == ColorCode.RED)
        {
            red.inc(value);
        }
        else if(cc == ColorCode.GREEN)
        {
            green.inc(value);
        }
        else if(cc == ColorCode.BLUE)
        {
            blue.inc(value);
        }
        else
        {
            System.out.println("Nochmal!");
        }
    }

    public void changColorViaRelativeValue(ColorCode cc, String value)
    {

    }

    public void changColorViaRelativeValue(ColorCode cc, int value) {
        if (cc.equals(ColorCode.RED)) {
            if (value < 0) {
                value = value * (-1);
                red.dec(value);
            }
            else
            {
                red.inc(value);
            }
        } else if (cc.equals(ColorCode.GREEN)) {
            if (value < 0) {
                value = value * (-1);
                green.dec(value);
            }
            else
            {
                green.inc(value);
            }
        }
        else if (cc.equals(ColorCode.BLUE)) {
            if (value < 0) {
                value = value * (-1);
                blue.dec(value);
            }
            else
            {
                blue.inc(value);
            }
            }

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

        String hex = String.format("#%02x%02x%02x", r, g, b);
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
