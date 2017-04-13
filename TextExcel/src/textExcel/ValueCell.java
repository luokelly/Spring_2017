package textExcel;

//This class inherits value and pads the input of value cells or returns full entire content
public class ValueCell extends RealCell implements Cell {
	
	private String text;
	
	public ValueCell(String text){ //input value
		super(text);
		this.text = text;
	}
	
	public double GetValue (String input){
		
		return super.getDoubleValue(input); //inherit input
		
	}
	
	public String abbreviatedCellText() {

		String shorten = GetValue(text)+"";
		shorten += "          ";
		return shorten.substring(0,10); //abbreviated and then pad to 10
		
	}

	public String fullCellText() {
	
		if (text.indexOf(".") < 0){ //gets rid of extra 0.0
			return text;
		}
		return GetValue(text) + "";
	}
	


}