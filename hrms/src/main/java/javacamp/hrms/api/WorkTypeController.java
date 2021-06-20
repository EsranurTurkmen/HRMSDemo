package javacamp.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javacamp.hrms.entities.concretes.WorkType;
import javacamp.hrms.business.abstracts.WorkTypeService;
import javacamp.hrms.core.utilities.results.DataResult;

@RestController
@RequestMapping("/api/worktype")
@CrossOrigin
public class WorkTypeController {

	private WorkTypeService workTypeService;

	@Autowired
	public WorkTypeController(WorkTypeService workTypeService) {
		super();
		this.workTypeService = workTypeService;
	}
	
	@GetMapping("/getAll")
    public DataResult<List<WorkType>> getAll(){
      
		return this.workTypeService.getAll();
    }
	
}
