package pe.edu.ceid.simi.management.domain.idioma.repository;
import java.util.List;

import pe.edu.ceid.simi.management.domain.idioma.model.Idioma;

public interface IdiomaRepository {
	String crearIdioma(Idioma idioma);
	String editIdioma(Idioma idioma, int id);
	List<Idioma> getIdiomas();
	String deleteIdioma(int cidioma);
	Idioma getIdiomaById(int id);
}
