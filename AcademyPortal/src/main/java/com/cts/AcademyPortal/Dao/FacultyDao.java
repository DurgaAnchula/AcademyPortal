package com.cts.AcademyPortal.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.AcademyPortal.Models.FacultyReg;


	@Repository
	public interface FacultyDao  extends CrudRepository<FacultyReg, Integer>{

}
