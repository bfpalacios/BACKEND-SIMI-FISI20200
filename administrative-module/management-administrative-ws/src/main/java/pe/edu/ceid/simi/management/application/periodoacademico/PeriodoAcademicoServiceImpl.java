package pe.edu.ceid.simi.management.application.periodoacademico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.management.domain.periodoacademico.model.PeriodoAcademico;
import pe.edu.ceid.simi.management.domain.periodoacademico.repository.PeriodoAcademicoRepository;

@Service
public class PeriodoAcademicoServiceImpl implements PeriodoAcademicoService {

	@Autowired
	private PeriodoAcademicoRepository repository;
	
	@Override
	public PeriodoAcademico crearPeriodoAcademico(PeriodoAcademico periodo) {
		// TODO Auto-generated method stub
		return this.repository.crearPeriodoAcademico(periodo);
	}

	@Override
	public PeriodoAcademico editPeriodoAcademico(PeriodoAcademico periodo, int id) {
		// TODO Auto-generated method stub
		return this.repository.editPeriodoAcademico(periodo, id);
	}

	@Override
	public List<PeriodoAcademico> getPeriodosAcademicos() {
		// TODO Auto-generated method stub
		return this.repository.getPeriodosAcademicos();
	}

	@Override
	public boolean deletePeriodoAcademico(int cperiodo) {
		// TODO Auto-generated method stub
		return this.repository.deletePeriodoAcademico(cperiodo);
	}

	@Override
	public PeriodoAcademico getPeriodoAcademicoById(int id) {
		// TODO Auto-generated method stub
		return this.repository.getPeriodoAcademicoById(id);
	}

}
