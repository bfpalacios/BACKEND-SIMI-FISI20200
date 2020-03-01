package pe.edu.ceid.simi.operative.application.plan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.operative.domain.plan.model.PlanDTO;
import pe.edu.ceid.simi.operative.domain.plan.repository.PlanRepository;

@Service
public class PlanServiceImpl implements PlanService{
	
	@Autowired
	private PlanRepository repository;
	
	public List<PlanDTO> getPlan() {
		// TODO Auto-generated method stub
		return this.repository.getPlan();
	}

}
