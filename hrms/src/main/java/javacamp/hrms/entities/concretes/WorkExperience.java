package javacamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="work_experience")
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperience {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull
	@NotBlank
	@Column(name="company_name")
	private String companyName;
	
	@NotNull
	@NotBlank
	@Column(name="job_title")
	private String jobTitle;
	
	@NotNull
	@Column(name="start_year")
	private int startYear;
	
	@Column(name="end_year")
	private int endYear;
	
	@Column(name="work_status")
	private String workStatus;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="resume_id")
	private Resume resume;
}
