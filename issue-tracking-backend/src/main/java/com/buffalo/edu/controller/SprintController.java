package com.buffalo.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buffalo.edu.entity.Sprint;
import com.buffalo.edu.service.SprintService;

@RestController
@RequestMapping("/sprint")
public class SprintController {
	
	@Autowired
	private SprintService sprintService;

	@GetMapping("/get-all-sprints")
	private List<Sprint> getAllSprints(){
		return sprintService.getAllSprints();
	}
	
	@PostMapping("/add-sprint")
	public Sprint addSprint(@RequestBody Sprint sprint) {
		return sprintService.addSprint(sprint);
	}
}
