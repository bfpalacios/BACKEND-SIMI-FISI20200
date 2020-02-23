package pe.edu.ceid.simi.management.domain.diasclase.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.diasclase.model.DiasClase;


public interface DiasClaseRepository {
	DiasClase crearDiasClase(DiasClase diasClase);
	DiasClase editDiasClase(DiasClase diasClase, int id);
	List<DiasClase> getDiasClase();
	DiasClase getDiasClaseById(int id);
	boolean deleteDiasClase(int cdia);
}
