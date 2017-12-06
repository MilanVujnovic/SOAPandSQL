package com.JobsDemoSoap.test;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class Test {
	
 

	private int job_id;

	public List<String> getJob_id(){
		List<String> jobs = new ArrayList<>();
		jobs.add("job_id 12345");
		jobs.add("time of request");
			return jobs;
		}
		
	}


