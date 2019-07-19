package pe.edu.unsch.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pe.edu.unsch.entities.Carga;

@Repository("cargaDao")
public class CargaDaoImpl implements CargaDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Carga> listarCarga() {
		return entityManager
				.createQuery("select new Carga(d.docenteNombre as nombre, d.docenteApellido as apellido, s.nombre as semestres, c.horas as hora) "
						+ "from Carga c "
						+ "inner join c.docente d "
						+ "inner join c.semestre s", Carga.class)
				.getResultList();
	}

}
