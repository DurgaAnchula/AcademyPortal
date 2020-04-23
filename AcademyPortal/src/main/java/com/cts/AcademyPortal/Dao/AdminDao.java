package com.cts.AcademyPortal.Dao;

import java.util.Optional;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.AcademyPortal.Models.AdminReg;

@Repository
public interface AdminDao  extends CrudRepository<AdminReg, String>{

}
