package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.WorkExperience;
import javacamp.hrms.entities.dtos.WorkExperienceSaveDto;

public interface WorkExperienceService {

	DataResult<List<WorkExperience>> getByWorkExperienceCompanyNameAndEndYearDesc();
	Result save(WorkExperienceSaveDto workExperience);
	DataResult<List<WorkExperience>> getAll();
}