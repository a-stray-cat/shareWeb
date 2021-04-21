package astraycat.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import astraycat.demo.mapper.AdminMapper;
import astraycat.demo.model.Admin;
import astraycat.demo.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminMapper adminMapper;
	
	@Override
	public int login(Admin user) {
		// TODO Auto-generated method stub
		Admin userAdmin = adminMapper.selectAdminByAdminnameAndPassword(user.getAdminname(), user.getAdminpassword());
		Admin adminName = adminMapper.selectAdminByAdminname(user.getAdminname());
		int i = -1;
		if (userAdmin!=null) {
			i = 1;
		} else if (adminName!=null) {
			i = 2;
		} else {
			i = 3;
		}
		return i;
	}

}
