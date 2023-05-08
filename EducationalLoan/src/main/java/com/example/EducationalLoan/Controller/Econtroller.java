package com.example.EducationalLoan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EducationalLoan.Model.LoanApplicationModel;
import com.example.EducationalLoan.Model.UserModel;
import com.example.EducationalLoan.Service.Eservice;

@RestController
public class Econtroller {
    @Autowired
	public Eservice serv;
	
    @PostMapping("/getalluser")
    public List<UserModel> getalldet()
    {
    	return serv.getalldet();
    }
    
    @PostMapping("/user/post")
	public UserModel postdet(@RequestBody UserModel um)
	{
		return serv.postdet(um);
	}
	
	@DeleteMapping("/user/delete/{id}")
	public String deledet(@PathVariable("id")int id)
	{
		serv.deledet(id);
		return "Deletion was successful";
	}
	
	@PutMapping("/user/update")
	public UserModel putdet(@RequestBody UserModel um)
	{
		return serv.putdet(um);
	
	}
	 @GetMapping("/loan/getalluser")
	    public List<LoanApplicationModel> getalldetloan()
	    {
	    	return serv.getalldetloan();
	    }
	 
	 @PostMapping("/loan/post")
		public LoanApplicationModel postdetloan(@RequestBody LoanApplicationModel um)
		{
			return serv.postdetloan(um);
		}
		
		@DeleteMapping("/loan/delete/{id}")
		public String deledetloan(@PathVariable("id")int id)
		{
			serv.deledetloan(id);
			return "Deletion was successful";
		}
		
		@PutMapping("/loan/update")
		public LoanApplicationModel putdetloan(@RequestBody LoanApplicationModel um)
		{
			return serv.putdetloan(um);
		}
	    

	
}
   