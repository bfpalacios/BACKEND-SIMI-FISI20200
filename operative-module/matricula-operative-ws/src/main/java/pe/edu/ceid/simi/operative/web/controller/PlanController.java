package pe.edu.ceid.simi.operative.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.ceid.simi.operative.application.plan.PlanService;
import pe.edu.ceid.simi.operative.domain.plan.model.PlanDTO;

@RestController
@RequestMapping({"/api/v1/programacionCurso/plan"})

public class PlanController {

	@Autowired
	private PlanService service;
	
	
	@GetMapping(path = {"/listPlan"})
	public List<PlanDTO> getPlan() {
		return this.service.getPlan();
	}
}
