
package textExcel;

public class TextCell implements Cell {
	
	private String words;
	
	public TextCell (String words){ //initial input
		this.words = words;
	}
	@Override
	public String abbreviatedCellText() {
		String abrv = words;
		abrv += "          ";
		return abrv.substring(0,10); //pad, then format to 10 char
	}

	@Override
	public String fullCellText() {
		return "\"" + words + "\"";
	}

}