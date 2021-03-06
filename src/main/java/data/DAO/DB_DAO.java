package data.DAO;

import java.util.HashMap;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import data.DTO.DB_DTO;

@Repository
public class DB_DAO extends SqlSessionDaoSupport implements DB_DAO_INTERFACE{
	
	//유저이름 가져오기 
	@Override
	public String getUserName(String name) {
		
		HashMap<String, String> map = new HashMap<String, String>();
			map.put("user_name", name);
		return getSqlSession().selectOne("getUserName", map);
	}
	//나이 불러오기 
	@Override
	public int getUserAge(String age) {
		HashMap<String, String> map = new HashMap<String, String>();
			map.put("user_age", age);
		return getSqlSession().selectOne("getUserAge", map);
	}
	//성별 불러오기 
	@Override
	public String getUserGender(String gender) {
		HashMap<String, String> map = new HashMap<String, String>();
			map.put("user_gender", gender);
		return getSqlSession().selectOne("getUserGender", map);
	}
	//모두 불러오기 
	@Override
	public DB_DTO getUserAll(String all) {
		HashMap<String, String> map = new HashMap<String, String>();
			map.put("user_all", all);
		return getSqlSession().selectOne("getUserAll", map);
	}
	
}