package com.example.zoo.Zrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.zoo.model.Querytesting;

import jakarta.transaction.Transactional;

public interface Queryrepository extends JpaRepository<Querytesting, Integer> {
	
	
	@Query(value="select * from querytable",nativeQuery = true)
	public List<Querytesting> getallval();
	
	
	@Modifying
	@Transactional
	@Query(value="delete from querytable where id=?1",nativeQuery = true)
	public void delbyid(int id);
	
	@Query( "select s from Querytesting s where s.id=?1")
	public Querytesting selectbyidjpql(int id);
	
	@Modifying
	@Transactional
	@Query("update Querytesting set firstname=?1 where id=?2")
	public void upjpql(String name,int id);
	

}
