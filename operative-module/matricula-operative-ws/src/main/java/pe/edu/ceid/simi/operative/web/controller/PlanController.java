package pe.edu.ceid.simi.operative.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.ceid.simi.operative.domain.plan.model.Plan;
import pe.edu.ceid.simi.operative.domain.plan.model.PlanDTO;
import pe.edu.ceid.simi.operative.application.plan.PlanService;

import java.util.List;

@RestController
@RequestMapping({"/api/v1/programacionCurso/plan"})

public class PlanController {

	@Autowired
	private PlanService service;
	
	
	@GetMapping(path = {"/listPlan/{id}"})
	public List<PlanDTO> getPlan(@PathVariable int id) {
		return this.service.getPlan(id);
	}
}
