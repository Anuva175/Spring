package com.example.EducationalLoan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EducationalLoan.Model.LoanApplicationModel;
import com.example.EducationalLoan.Model.UserModel;
import com.example.EducationalLoan.Repository.LoanRepo;
import com.example.EducationalLoan.Repository.UserRepo;

@Service
public class Eservice {
   @Autowired
	public LoanRepo lrep;
	@Autowired
	public UserRepo urep;
	
	public List<UserModel> getalldet() {
		// TODO Auto-generated method stub
		return urep.findAll();
	}
	public UserModel postdet(UserModel um) {
		 //TODO Auto-generated method stub
		return urep.save(um);
	}
	public void deledet(int id) {
		// TODO Auto-generated method stub
	  urep.deleteById(id);
	}
	public UserModel putdet(UserModel um) {
		// TODO Auto-generated method stub
		return urep.saveAndFlush(um);
	}
	public List<LoanApplicationModel> getalldetloan() {
		// TODO Auto-generated method stub
		return lrep.findAll();
	}
	public LoanApplicationModel postdetloan(LoanApplicationModel um) {
		// TODO Auto-generated method stub
		return lrep.save(um);
	}
	public void deledetloan(int id) {
		// TODO Auto-generated method stub
	  lrep.deleteById(id);
	}
	public LoanApplicationModel putdetloan(LoanApplicationModel um) {
		// TODO Auto-generated method stub
		return lrep.saveAndFlush(um);
	}


}
