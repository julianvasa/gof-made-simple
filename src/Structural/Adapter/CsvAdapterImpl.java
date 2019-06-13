package Structural.Adapter;

public class CsvAdapterImpl implements TextFormattable {
    CsvFormattable csvFormatter;
    public CsvAdapterImpl(CsvFormattable csvFormatter){
        this.csvFormatter=csvFormatter;
    }
    @Override
    public String formatText(String text)
    {
        String formattedText=csvFormatter.formatCsvText(text);
        return formattedText;
    }

    public static void main (String[] args){
        String testString=" Formatting line 1. Formatting line 2. Formatting line 3.";
        TextFormattable newLineFormatter=new TextFormattableImpl();
        String resultString = newLineFormatter.formatText(testString);
        System.out.println(resultString);
        CsvFormattable csvFormatter=new CsvFormattableImpl();
        TextFormattable csvAdapter=new CsvAdapterImpl(csvFormatter);
        String resultCsvString=csvAdapter.formatText(testString);
        System.out.println(resultCsvString);
    }
}