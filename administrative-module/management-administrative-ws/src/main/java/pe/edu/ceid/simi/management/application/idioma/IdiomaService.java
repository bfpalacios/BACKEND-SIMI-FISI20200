package pe.edu.ceid.simi.management.application.idioma;

import java.util.List;

import pe.edu.ceid.simi.management.domain.idioma.model.Idioma;


public interface IdiomaService {
	String crearIdioma(Idioma idioma);
	String editIdioma(Idioma idioma, int id);
	List<Idioma> getIdiomas();
	String deleteIdioma(int cidioma);
	Idioma getIdiomaById(int id);
}
