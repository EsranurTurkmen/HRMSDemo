package javacamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.WorkType;

public interface WorkTypeRepository extends JpaRepository<WorkType,Integer>{

}
