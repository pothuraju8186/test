package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.IEmployeeDao;
import com.example.Model.EmployeeModel;
@Service
	public class EmployeeService implements IEmployeeService {
	@Autowired
		private IEmployeeDao ied;
	@Override
		public int saveEmployee(EmployeeModel em) {
		int x=0;
		if(ied.save(em)!=null) {
			x=1;
	}else{
		 x=0;
	}
     return x;
	}
//@Override
//	public List<EmployeeModel> viewEmployee(){
//	List<EmployeeModel> l1=ied.findAll();
//	return l1;
//}
//@SuppressWarnings("deprecation")
//@Override
//	public EmployeeModel editEmployee(long id) {
//		EmployeeModel emp=ied.getOne(id);
//			return emp;
//}
//@Override
//	public void updateEmployee(EmployeeModel em) {
//		ied.save(em);
//}
//@Override
//	public void deleteEmployee(long id) {
//		ied.deleteById(id);
//		//TOOO Auto generated method stub
//}
//	@Override
//	public List<EmployeeModel> viewEmployee() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public EmployeeModel editEmployee(long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public void updateEmployee(EmployeeModel em) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void deleteEmployee(long id) {
//		// TODO Auto-generated method stub
//		
	
}


