package test.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.icss.dao.UserInfoDAO;
import com.icss.po.UserInfoPO;

public class UserInfoDAOTest {

	UserInfoDAO dao=new UserInfoDAO();
	
	@Before
	public void test(){
		System.out.println("Test UserInfoDAO");
	}
	
//	@Ignore
	@Test
	public void testAddUserInfoPO() throws Exception{
		UserInfoPO po=new UserInfoPO();
		po.setUserTypeId(1);
		po.setUserName("aaaaa");
		po.setUserPwd("12345");
		po.setUserPhone("1359787556");
		po.setUserEmail("123@126.com");
		po.setUserSex("male");
		long aa=new java.util.Date().getTime();
		java.sql.Date d=new java.sql.Date(aa);
		po.setUserBirthday(d);
		dao.add(po);
		System.out.println("Test UserInfoDAO success");
		//写入sql下的date
	}
	@Ignore
	@Test
	public void testModifyUserInfoPO() throws Exception{
		fail("Not yet implemented");
	}
	@Ignore
	@Test
	public void testDeleteUserInfoPO() throws Exception{
		fail("Not yet implemented");
	}
	@Ignore
	@Test
	public void testFindAll() throws Exception{
		System.out.println(dao.findAll().size());
	}
	@Ignore
	@Test
	public void testFindByIdUserInfoPO() throws Exception{
		fail("Not yet implemented");
	}
	@Ignore
	@Test
	public void testPageAllByTables() throws Exception{
		fail("Not yet implemented");
	}
	@Ignore
	@Test
	public void testFindUserToLogin() throws Exception{
		UserInfoPO po=new UserInfoPO();
		po.setUserName("lucy");
		po.setUserPwd("12345");
		po.setUserTypeId(1);
		System.out.println(dao.findUserToLogin(po).getUserId());
	}

}
