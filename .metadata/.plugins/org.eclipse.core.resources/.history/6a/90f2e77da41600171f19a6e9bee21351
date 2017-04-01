package textExcel;

public class ValueCell extends RealCell {
	private double valueDoub;

	@Override
	public String abbreviatedCellText() {				//call to return 10 char length string of value
		return super.abbreviatedCellText();
	}

	@Override
	public String fullCellText() {						//returns pure string with no modification
		return super.fullCellText();
	}
	
	public ValueCell (String enteredVal){				//constructor that assigns string to supers field and reads string to get double value, assigns that to this field
		super (enteredVal);
		valueDoub = Double.parseDouble(super.fullCellText());		
	}
	
	public double getDoubleValue(){					//returns double's value for this value cell
		return valueDoub;
	}
	
	public String getType(){						// returns type of cell
		return "ValueCell";
	}

}