package com.hbpu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbpu.mapper.AdminMapper;
import com.hbpu.po.Admin;
import com.hbpu.po.AdminExample;
import com.hbpu.po.AdminExample.Criteria;
import com.hbpu.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminMapper adminMapper;
	@Override
	public List<Admin> loginAdmin(Admin admin) {
		AdminExample adminExample=new AdminExample();
		Criteria criteria= adminExample.createCriteria();
		criteria.andUsernameEqualTo(admin.getUsername());
		criteria.andPasswordEqualTo(admin.getPassword());
		List<Admin> adminList= adminMapper.selectByExample(adminExample);
		return adminList;
	}
	@Override
	public Boolean updateAdmin(Admin admin) {
		AdminExample adminExample=new AdminExample();
		Criteria criteria= adminExample.createCriteria();
		criteria.andIdEqualTo(admin.getId());
		adminMapper.updateByExample(admin, adminExample);
		return null;
	}

}
