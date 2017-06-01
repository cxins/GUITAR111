import org.junit.Test;

import guitar.dao.InventoryDao;
import guitar.dao.impl.InventoryDaoimplSqlite;
import guitar.entity.Guitar;
import guitar.entity.GuitarSpec;
import guitar.service.InventoryService;
import guitar.service.impl.InventoryServiceimpl;
import util.JDBC;

import static org.junit.Assert.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ServiceimplTest {

	@Test
	public void Search(){
		Guitar searchGuitar=new Guitar("123",123,new GuitarSpec("123", "123", "123", 123, "1233", "123")); 
		InventoryServiceimpl GuitarServiceimpl=new InventoryServiceimpl();
		System.out.println("serialNumber: "+GuitarServiceimpl.Search(searchGuitar).get(0).getSerialNumber());
		System.out.println("price: "+GuitarServiceimpl.Search(searchGuitar).get(0).getPrice());
		System.out.println("builder: "+GuitarServiceimpl.Search(searchGuitar).get(0).getSpec().getBuilder());
		System.out.println("model: "+GuitarServiceimpl.Search(searchGuitar).get(0).getSpec().getModel());
		System.out.println("numStrings: "+GuitarServiceimpl.Search(searchGuitar).get(0).getSpec().getNumStrings());
		System.out.println("type: "+GuitarServiceimpl.Search(searchGuitar).get(0).getSpec().getType());
		System.out.println("backWood: "+GuitarServiceimpl.Search(searchGuitar).get(0).getSpec().getBackWood());
		System.out.println("topWood: "+GuitarServiceimpl.Search(searchGuitar).get(0).getSpec().getTopWood());
	}
	@Test
	public void add(){
		Guitar searchGuitar=new Guitar("111", 111,new GuitarSpec("111", "111", "111", 111, "111", "111")); 
		InventoryService GuitarServiceimpl=new InventoryServiceimpl();
		GuitarServiceimpl.add(searchGuitar);
	}
		
}
