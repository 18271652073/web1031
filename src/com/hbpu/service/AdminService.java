package com.hbpu.service;

import java.util.List;

import com.hbpu.po.Admin;

public interface AdminService {
	public List<Admin> loginAdmin(Admin admin);
	public Boolean updateAdmin(Admin admin);
}
