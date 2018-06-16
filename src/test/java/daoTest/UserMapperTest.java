package daoTest;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import mybatis.dataObject.SysUser;
import mybatis.dataObject.SysUserExample;
import mybatis.mapper.SysUserMapper;

/**   
 * Copyright © 2018 eazytec.com(卓易科技) All rights reserved.
 * 
 * @Package: daoTest 
 * @author: createdByliuyx 
 * @date: 2018年6月9日 下午10:35:55 
 */
public class UserMapperTest extends BaseMapperTest{

	@Test
	public void  testSelectById(){
		
		SqlSession sqlSession=getSqlSession();
		try {
			SysUserMapper mapper=sqlSession.getMapper(SysUserMapper.class);
			SysUser user=mapper.selectByPrimaryKey(1050l);
			System.out.println(user);
		} finally {
			// TODO: handle finally clause
			sqlSession.close();
		}
	}
	
	@Test
	public void  selectUserAndRoleById(){
		
		SqlSession sqlSession=getSqlSession();
		try {
			SysUserMapper mapper=sqlSession.getMapper(SysUserMapper.class);
			SysUser user=mapper.selectUserAndRoleById(1001l);
			System.out.println(user);
		} finally {
			// TODO: handle finally clause
			sqlSession.close();
		}
	}
	@Test
	public void  selectUserAndRoleById2(){
		
		SqlSession sqlSession=getSqlSession();
		try {
			SysUserMapper mapper=sqlSession.getMapper(SysUserMapper.class);
			SysUser user=mapper.selectUserAndRoleById2(1001l);
			System.out.println(user);
		} finally {
			// TODO: handle finally clause
			sqlSession.close();
		}
	}
	
	@Test
	public void  selectUserAndRoleByIdExtend(){
		
		SqlSession sqlSession=getSqlSession();
		try {
			SysUserMapper mapper=sqlSession.getMapper(SysUserMapper.class);
			SysUser user=mapper.selectUserAndRoleByIdExtend(1001l);
			System.out.println(user);
		} finally {
			// TODO: handle finally clause
			sqlSession.close();
		}
	}
	
	@Test
	public void  selectUserAndRoleByIdAssociation(){
		
		SqlSession sqlSession=getSqlSession();
		try {
			SysUserMapper mapper=sqlSession.getMapper(SysUserMapper.class);
			SysUser user=mapper.selectUserAndRoleByIdAssociation(1001l);
			System.out.println(user);
		} finally {
			// TODO: handle finally clause
			sqlSession.close();
		}
	}
}
