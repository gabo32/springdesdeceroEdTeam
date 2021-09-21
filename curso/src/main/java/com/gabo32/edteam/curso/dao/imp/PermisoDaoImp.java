package com.gabo32.edteam.curso.dao.imp;

import com.gabo32.edteam.curso.dao.PermisoDao;
import com.gabo32.edteam.curso.models.Permiso;
import com.gabo32.edteam.curso.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class PermisoDaoImp implements PermisoDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public List<Permiso> getAll() {
        String hql = "FROM Permiso as p";
        return (List<Permiso>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public Permiso get(long id) {
        return entityManager.find(Permiso.class, id);
    }

    @Transactional
    @Override
    public Permiso register(Permiso permiso) {
        entityManager.merge(permiso);
        return permiso;
    }

    @Transactional
    @Override
    public Permiso update(Permiso permiso) {
        return entityManager.merge(permiso);
    }

    @Transactional
    @Override
    public void delete(long id) {
        Permiso permiso = get(id);
        entityManager.remove(permiso);
    }
}
