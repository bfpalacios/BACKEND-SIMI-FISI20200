package pe.edu.ceid.simi.operative.infraestructure.plan.jdbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;
import pe.edu.ceid.simi.operative.domain.plan.model.PlanDTO;
import pe.edu.ceid.simi.operative.domain.plan.repository.PlanRepository;

@Component
public class PlanRepositoryImpl implements PlanRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private PlanRowMapper row;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<PlanDTO> getPlan(int id) {
		
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_PLAN_LIST");
		Map<String, Object> params = new HashMap<>();
        params.put("P_ID_IDIOMA", id);
		
		 Map<String, Object> result = jdbcCall.execute(params);
		 List<PlanDTO> plan = new ArrayList<>();
		 List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) result.values().toArray()[0];
		 r.forEach((v) -> plan.add(row.mapRowPlan(v)));
		 return plan;
	}
}