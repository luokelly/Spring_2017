package textExcel;

public class TextCell implements Cell {
	
	private String text;
	
	public TextCell (String input){
		this.text = input;
	}
	@Override
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
		String abrv = text;
		abrv += "          ";
		return abrv.substring(0,10);
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return "\"" + text + "\"";
	}

}