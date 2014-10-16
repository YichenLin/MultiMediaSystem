package test.dao;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.icss.dao.UserTypeDAO;

public class UserTypeDAOTest {

	private UserTypeDAO dao = new UserTypeDAO();

	@Ignore
	@Test
	public void testAddUserTypePO() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testModifyUserTypePO() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testDeleteUserTypePO() {
		fail("Not yet implemented");
	}

	
	@Test
	public void testFindAll() throws Exception {
		System.out.println(dao.findAll().size());
	}

	@Ignore
	@Test
	public void testFindByIdUserTypePO() {
		fail("Not yet implemented");
	}

}
