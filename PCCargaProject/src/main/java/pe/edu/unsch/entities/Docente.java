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
 * Docente generated by hbm2java
 */
@Entity
@Table(name = "docente", catalog = "cargabd")
public class Docente implements java.io.Serializable {

	private int iddocente;
	private String docenteNombre;
	private String docenteApellido;
	private String horasSem;
	private Set<Carga> cargas = new HashSet<Carga>(0);

	public Docente() {
	}

	public Docente(int iddocente, String docenteNombre, String docenteApellido, String horasSem) {
		this.iddocente = iddocente;
		this.docenteNombre = docenteNombre;
		this.docenteApellido = docenteApellido;
		this.horasSem = horasSem;
	}

	public Docente(int iddocente, String docenteNombre, String docenteApellido, String horasSem, Set<Carga> cargas) {
		this.iddocente = iddocente;
		this.docenteNombre = docenteNombre;
		this.docenteApellido = docenteApellido;
		this.horasSem = horasSem;
		this.cargas = cargas;
	}

	@Id

	@Column(name = "iddocente", unique = true, nullable = false)
	public int getIddocente() {
		return this.iddocente;
	}

	public void setIddocente(int iddocente) {
		this.iddocente = iddocente;
	}

	@Column(name = "docente_nombre", nullable = false, length = 50)
	public String getDocenteNombre() {
		return this.docenteNombre;
	}

	public void setDocenteNombre(String docenteNombre) {
		this.docenteNombre = docenteNombre;
	}

	@Column(name = "docente_apellido", nullable = false, length = 50)
	public String getDocenteApellido() {
		return this.docenteApellido;
	}

	public void setDocenteApellido(String docenteApellido) {
		this.docenteApellido = docenteApellido;
	}

	@Column(name = "horas_sem", nullable = false, length = 8)
	public String getHorasSem() {
		return this.horasSem;
	}

	public void setHorasSem(String horasSem) {
		this.horasSem = horasSem;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "docente")
	public Set<Carga> getCargas() {
		return this.cargas;
	}

	public void setCargas(Set<Carga> cargas) {
		this.cargas = cargas;
	}

}
