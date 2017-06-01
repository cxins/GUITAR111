package guitar.service;

import java.util.List;

import guitar.dao.InventoryDao;
import guitar.dao.impl.InventoryDaoimplSqlite;
import guitar.entity.Guitar;
import guitar.entity.GuitarSpec;
import guitar.service.impl.InventoryServiceimpl;

public interface InventoryService {

	List<Guitar> Search(Guitar searchGuitar);	
	boolean add(Guitar guitar);
	boolean del(String serialNumber);
}
