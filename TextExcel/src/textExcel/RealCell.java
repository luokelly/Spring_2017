package textExcel;

public class RealCell implements Cell {
	
	private String words;
	 
	public RealCell (String words){
		this.words = words;
	}
	@Override
	public String abbreviatedCellText() {
		return "          ";
	}

	@Override
	public String fullCellText() {

		return words;
	}
	
	public double getDoubleValue(String words){
		return Double.parseDouble(words); //super method
	}
}