package textExcel;
//This class carries out operations for formulas in cells

public class FormulaCell extends RealCell implements Cell{
	
	private String text;
	private Cell[][] cells; //initialize cells
	
	public FormulaCell(String text, Cell[][] cells){ 
		super(text);
		this.text = text;
		this.cells = cells;
		
	}
	
	public String abbreviatedCellText(){
		
		String shorten = getValue(text) + "";
		shorten += "          ";
		return shorten.substring(0, 10); //pads, then substrings to 10 char
	}

	
	public String fullCellText() {
		return text;
	}
	
	public double getValue (String input){
		
		String [] splitInput = input.split(" "); //split at spaces into 3 parts
		String operand = "";
		String operator= "";
		String secOperand = "";
		
		for (int i = 0; i <= splitInput.length; i++){
			
			if (testCell(splitInput[i])){
				SpreadsheetLocation loc = new SpreadsheetLocation(splitInput[i].toUpperCase());
				
				splitInput [i] = ((RealCell) cells[loc.getCol()][loc.getRow()]).fullCellText();
			}
		}
		
		int i = 0; //initialize variable to 0
		String result = splitInput[i+1];
		
		while (i <= splitInput.length - 5){
			operand = result;
			operator = splitInput[i + 2];
			secOperand = splitInput[i + 3];
			result = Calculate(secOperand, operand, operator);
			i += 2;
		}
		return Double.parseDouble(result);
	}
	

    public String Calculate(String operand, String secOperand, String operator){ //split into two parts
    	String answer = " ";
    	double firstNum = Double.parseDouble(operand);
    	double secNum = Double.parseDouble(secOperand);
    	

    	if (operator.equals("+")){  //test for addition 		
    		answer = firstNum + secNum + "";
    	}
    	else if (operator.equals("-")){ //test for subtraction
    		answer = firstNum - secNum + "";
    	}
    	else if (operator.equals("*")){ //test for multiplication
    		answer = firstNum * secNum + "";
    	}
    	else { //test for division
    		answer = firstNum / secNum + "";
    	}   
		return answer;
    }
    
	public boolean testCell (String input){ //compare letters and return true or false 
		
		if (Character.isLetter(input.charAt(0)) && Character.isDigit(input.charAt(1))) {
			return true;
		}
		else{
			return false;
		}
	}
}