package com.example.EducationalLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EducationalLoan.Model.LoanApplicationModel;

public interface LoanRepo extends JpaRepository<LoanApplicationModel,Integer> {

}
