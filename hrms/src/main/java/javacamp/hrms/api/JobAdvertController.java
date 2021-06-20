package javacamp.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.JobAdvertService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.JobAdvert;

@RestController
@RequestMapping("/api/jobadvert")
public class JobAdvertController {

	private JobAdvertService jobAdvertService;

	@Autowired
	public JobAdvertController(JobAdvertService jobAdvertService) {
		super();
		this.jobAdvertService = jobAdvertService;
	}
	
	
	@PostMapping("/add")
	public Result addJobAdvert(@RequestBody JobAdvert jobAdvert)
	{
		return this.jobAdvertService.add(jobAdvert);
	}
	
	@GetMapping("/getByStatus")
	public DataResult<List<JobAdvert>> getByStatus(){
		
		return this.jobAdvertService.getByStatus();
	}
	
	@PostMapping("/inactivejobadvert")
	public Result closeJobAdvert(@RequestParam int id)
	{
		return this.jobAdvertService.closeJobAdvert(id);
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvert>> getAll()
	{
		return this.jobAdvertService.getAll();
	}
	
		
	@GetMapping("/findAllByOrderByCreatedAt")
	public DataResult<List<JobAdvert>> findAllByOrderByCreatedAtDesc(){
		return this.jobAdvertService.findAllByOrderByCreatedAtDesc();
	}	
	
	
	@GetMapping("/getAllOpenJobAdvertByEmployer")
	public DataResult<List<JobAdvert>> getByStatusJobAdvertAndEmployer(@RequestParam int id){
		return this.jobAdvertService.getByStatusJobAdvertAndEmployer(id);
	}
}
