package com.buffalo.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buffalo.edu.entity.Sprint;
import com.buffalo.edu.repository.SprintRepository;

@Service
public class SprintService {
	
	@Autowired
	private SprintRepository sprintRepository;

	public List<Sprint> getAllSprints() {
		return sprintRepository.findAll();
	}

	public Sprint addSprint(Sprint sprint) {
		return sprintRepository.save(sprint);
	}

}
