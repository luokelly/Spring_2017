package textExcel;

//This class takes in an input of text and returns full or shortened text
public class TextCell implements Cell {
	
private String text;
	
	public TextCell (String input){ 
		this.text = input; //set text to input
		
	}
	
	public String fullCellText(){
		
		return "\"" + text + "\"";
		
	}
	
	public String abbreviatedCellText(){
		
		String shorten = text;
		shorten += "          "; //10 spaces
		return shorten.substring(0,10); //returns only 10 char
		
	}
}