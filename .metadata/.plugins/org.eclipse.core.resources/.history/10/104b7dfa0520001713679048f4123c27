package textExcel;

public class ValueCell extends RealCell implements Cell {
	
	private String words;
	
	public ValueCell (String words){ //input value
		super (words);
		this.words = words;
	}
	
	@Override
	public String abbreviatedCellText() {

		String abrv = GetValue(words)+"";
		abrv += "          ";
		return abrv.substring(0,10); //pad and then substring to fit
		
	}

	@Override
	public String fullCellText() {
	
		if (words.indexOf(".")<0){ //deals with added extraneous 0.0 when casting integer to double
			return words;
		}
		return GetValue(words)+"";
	}
	
	public double GetValue (String words){
		return super.getDoubleValue(words); //uses super method to get double value
	}

}