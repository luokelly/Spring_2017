package textExcel;

//This class inherits value and pads the input of percent cells or returns entire content

public class PercentCell extends RealCell implements Cell {
	
	private String text;
	
	public PercentCell (String input){
		super(input); //inherit from superclass
		this.text = input;
	}
	
	public double GetValue (String text){
		return Double.parseDouble(text.substring(0, text.length()-1))/100; //change from percent to double
	}

	public String abbreviatedCellText() {
		String shorten = "";
		
		if (text.indexOf(".") > 0){
			shorten = text.substring(0, text.indexOf(".")); //check for percentage
		}
		shorten += "%         ";
		return shorten.substring(0,10); //pad to 10
	}

	public String fullCellText() {
		return GetValue(text)+""; //return string
	}


}