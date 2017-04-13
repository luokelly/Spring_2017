package textExcel;

//This class sets up location from spreadsheet

public class SpreadsheetLocation implements Location
{
	int row;
	char col;

    public int getRow(){
        return row - 1; //zero indexing so -1
    }

    public int getCol(){
        return col - 65; //char value
    }
    
    public SpreadsheetLocation(String input){
    	row = Integer.parseInt(input.substring(1)); //takes part of array that includes location
    	col = input.charAt(0);
    }

}
