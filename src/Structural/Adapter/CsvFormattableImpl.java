package Structural.Adapter;

public class CsvFormattableImpl implements CsvFormattable{
    @Override
    public String formatCsvText(String text){
        String formattedText=text.replace(".",",");
        return formattedText;
    }
}