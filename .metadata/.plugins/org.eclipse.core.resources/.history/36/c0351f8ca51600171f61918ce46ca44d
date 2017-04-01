package textExcel;
import java.util.*;
import java.io.*;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int rows = 20;
	private int cols = 12;
	Cell[][] cells;
	
	public Spreadsheet(){
		cells = new EmptyCell[20][12];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				cells[i][j] = new EmptyCell();
				
			}
		}
		System.out.print(this.getGridText());
	}
	public String processCommand(String command)
<<<<<<< HEAD
	{	
		if (command.length()==0){ //if no command, catches 
			return "";
=======
	{
		String[] commandArr = command.split(" ", 3);
		if(command.equals("")){ //return value of cell
			return command;
>>>>>>> parent of cddd147... Checkpoint 2
		}

		String [] input = command.split(" ",3); //divide up command input into an array
		
<<<<<<< HEAD
		if (!(command.indexOf("save")<0)){ //save the spreadsheet
			System.out.println("saved to: " + input[1]);
			return saveSpreadsheet(input[1]);
		}
		if (!(command.indexOf("open")<0)){ //open up the spreadsheet
			System.out.println("opened from: " + input[1]);
			return openSpreadsheet(input[1]); 
		}
		if (input[0].toLowerCase().equals("clear")){ //run the clearCell method
			clearCell(input);
			return getGridText();
		}
		else if (input.length > 2){ //run the setCell method to assign value
			setCell(input);
			return getGridText();
		}
		else { //run the getCell method to inspect cell
			SpreadsheetLocation placeholder = new SpreadsheetLocation(input[0].toUpperCase());
			return getCell(placeholder).fullCellText();
=======
		if(command.toUpperCase().equals("CLEAR")){ //clear entire sheet and return entire sheet grid
			for(int i = 0; i < cells.length; i++){
				for(int j = 0; j<cells[i].length; j++){
					cells[i][j] = new EmptyCell();
				}
				return this.getGridText();
			}
		
			
			
			
		} else if (commandArr.length > 1) { //if more than one input and:
		if (commandArr[1].equals("=")) { //has an equal sign then it is an equality
			SpreadsheetLocation gridLoc = new SpreadsheetLocation(commandArr[0]);
			int rowNum = gridLoc.getRow();
			int colNum = gridLoc.getCol();
			
		//assign string and return String of entire sheet grid
		}
		if (commandArr[0].toLowerCase().equals("clear")){ 
			for (int i = 1; i < commandArr.length; i++) {
				SpreadsheetLocation gridLoc = new SpreadsheetLocation(commandArr[i]);
				int rowNum = gridLoc.getRow();
				int colNum = gridLoc.getCol();
				cells[colNum][gridLoc.getRow()] = new EmptyCell();
			return getGridText();
			}
		}
		else if (commandArr.length > 2){ 
			
			return getGridText();
>>>>>>> parent of cddd147... Checkpoint 2
		}
		else { //run the getCell method to inspect cell
			SpreadsheetLocation placeholder = new SpreadsheetLocation(commandArr[0].toUpperCase());
			return getCell(placeholder).fullCellText();
		}
		}//clear a written cell and return entire sheet grid
		
		return command;
	}
<<<<<<< HEAD
	

	
=======

>>>>>>> parent of cddd147... Checkpoint 2
	@Override
	public int getRows()
	{
		return rows;
	}
	
	@Override
	
	public int getCols()
	{
		return cols;
	}

	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return cells[loc.getRow()][loc.getCol()];
	}

public void setCell (String [] input){ //assign the cell a value
		
		String testInput = input[2]; 
		SpreadsheetLocation placeholder = new SpreadsheetLocation(input[0].toUpperCase());
		if (testInput.charAt(0) == 34){ //if a text cell, take the string between the quotes and fill the array element with a text cell
			String words = input[2].substring(1, (input[2].length()-1));
			cells[placeholder.getCol()] [placeholder.getRow()] = new TextCell (words);
		}
		else if (testInput.substring(testInput.length()-1).equals("%")){ //if a percent cell
			cells[placeholder.getCol()] [placeholder.getRow()] = new PercentCell (testInput);	
		}
		else if (testInput.substring(testInput.length()-1).equals(")")){ //if a formula cell
			cells[placeholder.getCol()] [placeholder.getRow()] = new FormulaCell (testInput);	
		}
		else { // if a value cell
			cells[placeholder.getCol()] [placeholder.getRow()] = new ValueCell (testInput);	
		}
	}

public void clearCell (String [] input){
	if (input.length > 1){ //if "clear" all
		SpreadsheetLocation placeholder = new SpreadsheetLocation(input[1].toUpperCase());
		cells[placeholder.getCol()] [placeholder.getRow()] = new EmptyCell (); //make everything an empty cell
	}
	else {
		for (int j = 0; j < 20; j++ ){
			for (int k = 0; k < 12; k++){
				cells[k][j] = new EmptyCell(); //target the specific cell to empty
			}			
		}
	}
}


	public String saveSpreadsheet (String fileName){ //takes the grid and saves it to a file in the text excel directory
		
	     PrintStream outputFile;
	     try {
	            outputFile = new PrintStream(new File(fileName));  //write the new file            
	     }
	     catch (FileNotFoundException e) {   	 
	            return "File not found: " + fileName;   //throws error if file does not exist
	     }
	     for (int j = 0; j < 20; j++){  	 
	    	 for (int k = 0; k < 12; k++){
	    		 if (!(cells[k][j] instanceof EmptyCell)){ //checks to make sure only cells with data are saved.		 
	    			 outputFile.println((char)(k+65) + "" + (j+1) + "," + cells[k][j].getClass().getSimpleName() + ","+ cells[k][j].fullCellText());
	    			 //prints the cell to the output file in the format Location,Type,Full Value
	    		 }
			 }	 
	     }
	     outputFile.close(); //closes the file
		 return "";
	}

	private String openSpreadsheet(String fileName) {
		
	     Scanner inputFile;
	     try {
	            inputFile = new Scanner(new File(fileName)); //open up the file from the directory
	     }
	     catch (FileNotFoundException e) {
	            return "File not found: " + fileName; //throws error if file does not exist
	     }
	     while (inputFile.hasNextLine()) { //reads the file line by line
            String [] fileContent = inputFile.nextLine().split(",", 3); //splits each line of the file into location, type, and full text value
            if (fileContent[1].equals("PercentCell")){ //changes the formatting if it is a percent cell for proper use of setCell()
           	 String percentVal = "" + (Double.parseDouble(fileContent[2])*100);
           	fileContent[2] = (percentVal)+"%";
            }
            setCell(fileContent); //uses previous setCell method to push each cell into the spreadsheet   
        }
	     
	     inputFile.close();
	     return getGridText(); //returns the opened spreadsheet
	}
	
	public String getGridText() // return entire sheet grid
	{
		String header = "   ";
		for (char i = 'A'; i <= 'L'; i++){
			header += "|" + i + "         ";	
		}
		header += "|";
		
		String whole = "\n";
		
		for (int j = 0; j < rows; j++ ){
			whole += ((j+1) + "   ").substring(0, 3);
			whole += "|";
			for (int k = 0; k < cols; k++){
				whole += cells[j][k].abbreviatedCellText() + "|";
			}			
			whole += "\n";
		}
		return header + whole;
	}

}
