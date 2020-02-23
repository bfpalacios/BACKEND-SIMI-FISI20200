package pe.edu.ceid.simi.management.domain.periodoacademico.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.periodoacademico.model.PeriodoAcademico;

public interface PeriodoAcademicoRepository {
	PeriodoAcademico crearPeriodoAcademico(PeriodoAcademico periodo);
	PeriodoAcademico editPeriodoAcademico(PeriodoAcademico periodo, int id);
	List<PeriodoAcademico> getPeriodosAcademicos();
	boolean deletePeriodoAcademico(int cperiodo);
	PeriodoAcademico getPeriodoAcademicoById(int id);
}
