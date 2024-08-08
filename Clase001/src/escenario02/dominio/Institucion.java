package escenario02.dominio;

import java.util.ArrayList;
import java.util.List;

public class Institucion {
	
	private List<Curso> cursos = new ArrayList<>();

	public Institucion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Institucion(List<Curso> cursos) {
		super();
		this.cursos = cursos;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	

}
