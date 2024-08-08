package escenario02.dominio;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import escenario02.enumerators.Modalidad;
import escenario02.enumerators.NivelDeDificultad;

public class CursoTeorico extends Curso{
	
	private Modalidad modalidad;

	public CursoTeorico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CursoTeorico(String nombre, int cantidadDeHoras, NivelDeDificultad nivelDeDificultad, List<Examen> examenes,
			Map<UUID, Estudiante> estudiantes) {
		super(nombre, cantidadDeHoras, nivelDeDificultad, examenes, estudiantes);
		// TODO Auto-generated constructor stub
	}

	public CursoTeorico(Modalidad modalidad) {
		super();
		this.modalidad = modalidad;
	}

	public Modalidad getModalidad() {
		return modalidad;
	}

	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}
	

}
