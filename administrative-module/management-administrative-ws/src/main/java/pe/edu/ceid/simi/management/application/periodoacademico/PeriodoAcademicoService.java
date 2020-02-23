package pe.edu.ceid.simi.management.application.periodoacademico;

import java.util.List;

import pe.edu.ceid.simi.management.domain.periodoacademico.model.PeriodoAcademico;

public interface PeriodoAcademicoService {
	PeriodoAcademico crearPeriodoAcademico(PeriodoAcademico periodo);
	PeriodoAcademico editPeriodoAcademico(PeriodoAcademico periodo, int id);
	List<PeriodoAcademico> getPeriodosAcademicos();
	boolean deletePeriodoAcademico(int cperiodo);
	PeriodoAcademico getPeriodoAcademicoById(int id);
}
