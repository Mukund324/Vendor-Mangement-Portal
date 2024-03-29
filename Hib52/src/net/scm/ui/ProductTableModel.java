package net.scm.ui;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import net.scm.model.*;

public class ProductTableModel extends AbstractTableModel
{
	

	private static final long serialVersionUID = 1L;
	private final List<ProductModel> productList;
	private final String[] columnNames = new String[] 
	{
		"Name", "ProductID", "Price", "Industry", "Fuel Type", "Supplied To"
    };
	
	private final Class[] columnClass = new Class[] 
	{
	        Integer.class,  String.class, String.class, Integer.class, String.class, String.class
	};
	
    public ProductTableModel(List<ProductModel> productList)
    {
        this.productList = productList;
    }
    
    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
    }
 /*
    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return columnClass[columnIndex];
    }
*/
 
    @Override
    public int getColumnCount()
    {
        return columnNames.length;
    }
 
    @Override
    public int getRowCount()
    {
        return productList.size();
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        ProductModel row = productList.get(rowIndex);
        if(0 == columnIndex) {
            return row.getProdName();
        }
        else if(1 == columnIndex) {
            return row.getProdId();
        }
        else if(2 == columnIndex) {
            return row.getProdPrice();
        }
        else if(3 == columnIndex) {
            return row.getProdRating();
        }
        else if(4 == columnIndex) {
            return row.getProdMake();
        }
        else if(5 == columnIndex) {
            return row.getProdCountry();
        }
        return null;
    }
}
