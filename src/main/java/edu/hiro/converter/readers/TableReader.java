package edu.hiro.converter.readers;

import edu.hiro.util.CTable;

public interface TableReader
{	
	void loadTable(CTable table);
	void loadInBatches(CTable table);
}
