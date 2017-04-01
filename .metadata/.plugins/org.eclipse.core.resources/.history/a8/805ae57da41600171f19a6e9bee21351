package textExcel;

public class PercentCell extends RealCell {
	
	@Override
	public String abbreviatedCellText() {
		String returnStr = ((int)(getDoubleValue())) + "%";		// base string, with percent value
		//String returnStr = value;
		if (returnStr.length() < 10){							// adding to length with spaces to fit 10 chars
			while (returnStr.length() < 10){
				returnStr += " ";
			}
			return returnStr;
		} else if (returnStr.length() > 10){					//cuts base string to length of 10
			returnStr = returnStr.substring(0, 10);
			return returnStr;
		}else{
			return returnStr;									//if 10 in length, returns base string
		}

	}

	@Override
	public String fullCellText() {
		return (getDoubleValue()/100.0) + "";					//Takes double value, turns it into decimal percent form, and casts it back to a string
	}
	
	public PercentCell(String initialValue){
		super(initialValue);									//Constructor, uses super contructor in order to assign passed value to the string field
	}
	
	public double getDoubleValue(){
		return Double.parseDouble(super.fullCellText().substring(0, super.fullCellText().length()-1)); 		//breaks down the string field into parsed double without the last char (%) 
	}

	public String getType(){
		return "PercentCell";									//returns cell type
	}
}