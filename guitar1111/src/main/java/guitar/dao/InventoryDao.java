package guitar.dao;

import java.util.List;


import guitar.entity.Guitar;
import guitar.entity.GuitarSpec;

public interface InventoryDao {
	List<Guitar> Search(Guitar searchGuitar);	
	boolean add(Guitar guitar);
	boolean del(String serialNumber);

}
