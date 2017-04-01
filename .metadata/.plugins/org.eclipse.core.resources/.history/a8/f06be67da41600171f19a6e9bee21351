package textExcel;

public class TextCell implements Cell {
	
	private String cellContents;
	
	public TextCell (String contents){
		cellContents = contents; 
	}
	@Override
	public String abbreviatedCellText() {
		String returnStr = cellContents;
		int cellValueLength = cellContents.length();
		if (cellContents.length() < 10){						//test to process length and whether to return, cut, or add to it
			while (returnStr.length() < 10){			//adding to string
				returnStr += " ";
			}
			return returnStr;
		} else if (cellContents.length() > 10){				//cutting size
			returnStr = returnStr.substring(0, 10);
			return returnStr;
		}else{						//if 10 in length
			return cellContents;
		}
	}

	@Override
	public String fullCellText() {
		return "\"" + cellContents + "\"";					//returns un modified text with quotation marks
	}

	public String getType(){
		return "TextCell";								//returns type of cell
	}
}