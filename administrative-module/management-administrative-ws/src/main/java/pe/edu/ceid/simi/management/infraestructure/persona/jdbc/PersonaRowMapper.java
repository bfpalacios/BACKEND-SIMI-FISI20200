package pe.edu.ceid.simi.management.infraestructure.persona.jdbc;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.persona.model.Persona;

@Component
public class PersonaRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Persona> mapRowPersona(List<Map<String, Object>> rows){
		List<Persona> personass = new ArrayList<Persona>();
		
		for(Map<String, Object> row: rows) {
			int idPersona = Integer.parseInt(row.get("ID_PERSONA").toString());
			String nombre = row.get("NOMBRE").toString();
			String apellidoPat = row.get("APELLIDO_PAT").toString();
			String apellidoMat =row.get("APELLIDO_MAT").toString();
			int dni = Integer.parseInt(row.get("DNI").toString());
			int genero = Integer.parseInt(row.get("GENERO").toString());
			int edad = Integer.parseInt(row.get("EDAD").toString());
			Date fechaAlta = (Date) row.get("FECHA_ALTA");
			Date fechaMod = (Date) row.get("FECHA_MOD");
			Persona p = new Persona(idPersona, nombre, apellidoPat, apellidoMat, dni,
					genero, edad, fechaAlta, fechaMod);
			personass.add(p);
		}
		
		return personass;
	}
	
}
