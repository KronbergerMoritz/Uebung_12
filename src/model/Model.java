package model;

import java.io.*;

public class Model
{

    private ModularCounter red = new ModularCounter(0,256);
    private ModularCounter green = new ModularCounter(0,256);
    private ModularCounter blue = new ModularCounter(0,256);

    public Model()
    {

    }


    public void saveColors()
    {
        try{
            FileWriter fw = new FileWriter("./save/savedFile.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Color File Format 1.0");
            bw.newLine();
            bw.write(""+red.getValue());
            bw.newLine();
            bw.write(""+ green.getValue());
            bw.newLine();
            bw.write(""+blue.getValue());
            bw.newLine();
            bw.close();
            fw.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void loadColors()
    {
        String string;
        int color = 0;
        try
        {
            FileReader fr = new FileReader("./save/savedFile.txt");
            BufferedReader br = new BufferedReader(fr);

            while((string = br.readLine()) != null)
            {
                if(color==0)
                {
                    if(string.equals("Color File Format 1.0") == false)
                    {
                        break;
                    }
                }
                else if(color == 1)
                {
                    changColorViaAbsoluteValue(ColorCode.RED,string);
                }
                else if(color == 2)
                {
                    changColorViaAbsoluteValue(ColorCode.GREEN,string);
                }
                else if(color == 3)
                {
                    changColorViaAbsoluteValue(ColorCode.BLUE,string);
                    break;
                }
                color++;
            }
            br.close();
            fr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    public void changColorViaAbsoluteValue(ColorCode cc, String value)
    {
        int i = Integer.parseInt(value);
        changColorViaAbsoluteValue(cc,i);
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
