package Structural.Adapter;

public class TextFormattableImpl implements TextFormattable{
    @Override
    public String formatText(String text)
    {
        String formattedText=text.replace(".","\n");
        return formattedText;
    }
}