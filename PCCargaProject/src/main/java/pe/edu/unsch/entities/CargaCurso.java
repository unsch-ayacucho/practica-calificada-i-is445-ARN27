package pe.edu.unsch.entities;
// Generated 05/07/2019 12:27:33 PM by Hibernate Tools 5.1.7.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CargaCurso generated by hbm2java
 */
@Entity
@Table(name = "carga_curso", catalog = "cargabd")
public class CargaCurso implements java.io.Serializable {

	private int idcargaCurso;
	private Carga carga;
	private Curso curso;

	public CargaCurso() {
	}

	public CargaCurso(int idcargaCurso, Carga carga, Curso curso) {
		this.idcargaCurso = idcargaCurso;
		this.carga = carga;
		this.curso = curso;
	}

	@Id

	@Column(name = "idcarga_curso", unique = true, nullable = false)
	public int getIdcargaCurso() {
		return this.idcargaCurso;
	}

	public void setIdcargaCurso(int idcargaCurso) {
		this.idcargaCurso = idcargaCurso;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcarga", nullable = false)
	public Carga getCarga() {
		return this.carga;
	}

	public void setCarga(Carga carga) {
		this.carga = carga;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcurso", nullable = false)
	public Curso getCurso() {
		return this.curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
