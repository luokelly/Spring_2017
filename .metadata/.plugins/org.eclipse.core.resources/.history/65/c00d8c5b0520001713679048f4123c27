package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
    
	char column;
	int row;
	
    @Override
    public int getRow()
    {
        return row-1; //account for zero-indexing for array
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return column - 65; //take the char value and convert to array index
    }
    
    public SpreadsheetLocation(String cellName) //parses string location into array index
    {
    	column = cellName.charAt(0);
    	row = Integer.parseInt(cellName.substring(1));
    }

}
