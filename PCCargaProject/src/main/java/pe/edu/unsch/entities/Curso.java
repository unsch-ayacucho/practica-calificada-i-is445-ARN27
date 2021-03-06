package pe.edu.unsch.entities;
// Generated 05/07/2019 12:27:33 PM by Hibernate Tools 5.1.7.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Curso generated by hbm2java
 */
@Entity
@Table(name = "curso", catalog = "cargabd")
public class Curso implements java.io.Serializable {

	private int idcurso;
	private String cursoNombre;
	private String sigla;
	private short horas;
	private Set<CargaCurso> cargaCursos = new HashSet<CargaCurso>(0);

	public Curso() {
	}

	public Curso(int idcurso, String cursoNombre, String sigla, short horas) {
		this.idcurso = idcurso;
		this.cursoNombre = cursoNombre;
		this.sigla = sigla;
		this.horas = horas;
	}

	public Curso(int idcurso, String cursoNombre, String sigla, short horas, Set<CargaCurso> cargaCursos) {
		this.idcurso = idcurso;
		this.cursoNombre = cursoNombre;
		this.sigla = sigla;
		this.horas = horas;
		this.cargaCursos = cargaCursos;
	}

	@Id

	@Column(name = "idcurso", unique = true, nullable = false)
	public int getIdcurso() {
		return this.idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	@Column(name = "curso_nombre", nullable = false, length = 50)
	public String getCursoNombre() {
		return this.cursoNombre;
	}

	public void setCursoNombre(String cursoNombre) {
		this.cursoNombre = cursoNombre;
	}

	@Column(name = "sigla", nullable = false, length = 10)
	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Column(name = "horas", nullable = false)
	public short getHoras() {
		return this.horas;
	}

	public void setHoras(short horas) {
		this.horas = horas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "curso")
	public Set<CargaCurso> getCargaCursos() {
		return this.cargaCursos;
	}

	public void setCargaCursos(Set<CargaCurso> cargaCursos) {
		this.cargaCursos = cargaCursos;
	}

}
