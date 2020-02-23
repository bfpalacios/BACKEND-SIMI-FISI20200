package pe.edu.ceid.simi.management.application.idioma;

import java.util.List;

import pe.edu.ceid.simi.management.domain.idioma.model.Idioma;


public interface IdiomaService {
	Idioma crearIdioma(Idioma idioma);
	Idioma editIdioma(Idioma idioma, int id);
	List<Idioma> getIdiomas();
	boolean deleteIdioma(int cidioma);
	Idioma getIdiomaById(int id);
}
