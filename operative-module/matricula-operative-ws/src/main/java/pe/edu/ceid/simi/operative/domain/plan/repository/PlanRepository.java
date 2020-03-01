package pe.edu.ceid.simi.operative.domain.plan.repository;

import java.util.List;

import pe.edu.ceid.simi.operative.domain.plan.model.Plan;
import pe.edu.ceid.simi.operative.domain.plan.model.PlanDTO;

public interface PlanRepository {
	List<PlanDTO> getPlan();
}
