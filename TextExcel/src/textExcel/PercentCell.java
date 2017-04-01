package textExcel;

public class PercentCell extends RealCell implements Cell {
	
private String words;
	
	public PercentCell (String words){
		super (words);
		this.words = words;
	}
	
	@Override
	public String abbreviatedCellText() {
		String abrv = "";
		if (words.indexOf(".")>0){
			abrv = words.substring(0, words.indexOf(".")); //checking if there is a decimal in the percentage, and truncates the decimal
		}
		abrv += "%         ";
		return abrv.substring(0,10);
	}

	@Override
	public String fullCellText() {
		return GetValue(words)+""; //returns string version of double
	}
	
	public double GetValue (String words){
		return Double.parseDouble(words.substring(0, words.length()-1))/100; //converts percent to double
		
	}
}