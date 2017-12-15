package com.lxit.crm.service.Impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.crm.dao.CompactDao;
import com.lxit.crm.dao.Impl.CompactDaoImpl;
import com.lxit.crm.entity.Compact;
import com.lxit.crm.entity.Dictionary;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.CompactService;

/**
 * 合同管理
 * 
 *
 */
@Service("compactService")
public class CompactServiceImpl implements CompactService {
	@Autowired
	private CompactDaoImpl compactDao;

	public CompactDaoImpl getCompactDao() {
		return compactDao;
	}

	public void setCompactDao(CompactDaoImpl compactDao) {
		this.compactDao = compactDao;
	}

	// 增加
	@Override
	public boolean CompactAdd(Compact compact) {
		System.out.println("sevser======"+compact);
		// TODO Auto-generated method stub
		return compactDao.CompactAdd(compact);
	}
     //查询状态
	@Override
	public List<Dictionary> compactState() {
		// TODO Auto-generated method stub
		return compactDao.compactState();
	}
	   //查询类型
		@Override
		public List<Dictionary> compactType() {
			// TODO Auto-generated method stub
			return compactDao.compactType();
		}
		//查询所有用户
			public List<User> userselect(){  
				return compactDao.userselect();
				   
			   }
			//查询合同数据进行分页
			@Override
			public List<Compact> compactselect(Compact compact) {
				// TODO Auto-generated method stub
				return compactDao.compactselect( compact);
			}
			//查询所有数据的数量
			@Override
			public int compactCount(Compact compact) {
				// TODO Auto-generated method stub
				return compactDao.compactCount(compact);
			}

			@Override
			public boolean compactUpdateState(Compact compact) {
				// TODO Auto-generated method stub
				
				return compactDao.compactUpdateState(compact);
			}

			@Override
			public boolean selectSubmit(Compact compact) {
				// TODO Auto-generated method stub
				
				return compactDao.selectSubmit( compact);
			}

			@Override
			public boolean selectri(int id) {
				// TODO Auto-generated method stub
				return compactDao.selectri(id);
			}

			@Override
			public Compact selectId(int id) {
				// TODO Auto-generated method stub
				return compactDao.selectId(id);
			}

			@Override
			public boolean CompactUpdate(Compact compact) {
				// TODO Auto-generated method stub
				return compactDao.CompactUpdate(compact);
			}

			@Override
			public boolean shks(Compact compact) {
				// TODO Auto-generated method stub
				return compactDao.shks(compact);
			}
			public boolean compactgkais(Compact compact){
				return compactDao.compactgkais(compact);
				
			}

			@Override
			public boolean compactassignmentk(Compact compact) {
				// TODO Auto-generated method stub
				return compactDao.compactassignmentk(compact);
			}

			@Override
			public boolean compactremovekss(Compact compact) {
				// TODO Auto-generated method stub
				return compactDao.compactremovek(compact);
			}

			@Override
			public boolean compactrcompactjudge(int id, int compactId) {
				// TODO Auto-generated method stub
				return compactDao.compactrcompactjudge(id, compactId);
			}

			@Override
			public boolean userSelectJudge(int id, int compactId) {
				// TODO Auto-generated method stub
				return compactDao.userSelectJudge(id, compactId);
			}

			@Override
			public List<Compact> compactselectshh(Compact compact) {
				// TODO Auto-generated method stub
				return compactDao.compactselectshh(compact);
			}

			@Override
			public int compactCountshh(Compact compact) {
				// TODO Auto-generated method stub
				return compactDao.compactCountshh(compact);
			}

			@Override
			public List<Compact> compactselectguanli(Compact compact) {
				// TODO Auto-generated method stub
				return compactDao.compactselectguanli(compact);
			}

			@Override
			public int compactCountguanli(Compact compact) {
				// TODO Auto-generated method stub
				return compactDao.compactCountguanli(compact);
			}
}
