package test.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.icss.dao.ResourceDAO;
import com.icss.po.ResourcePO;

public class ResourceDAOTest {
	
	ResourceDAO dao = new ResourceDAO();
	
	@Before
	public void test() {
		System.out.println("Test ResourceDAO");
	}

	@Test
	public void testAddResourcePO() throws Exception{
		ResourcePO po = new ResourcePO();
		po.setResName("test1");
		po.setResType(1);
		po.setResUploader(1);
		po.setResDownloads(2);
		po.setResVisitTimes(3);
		long aa = new java.util.Date().getTime();
		java.sql.Date d = new java.sql.Date(aa);
		po.setResUploadTime(d);
		po.setResSize(3);
		po.setResFormat("png");
		po.setResUrl("asda");
		po.setResDescription("this is a test");
		
		dao.add(po);
		System.out.println("Test ResourceDAO success");
	}

	@Ignore
	@Test
	public void testModifyResourcePO() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testDeleteResourcePO() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testFindByIdResourcePO() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testPageAllResByTables() {
		fail("Not yet implemented");
	}

}
