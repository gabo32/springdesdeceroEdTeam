package com.gabo32.edteam.curso.dao.imp;

import com.gabo32.edteam.curso.dao.RoleDao;
import com.gabo32.edteam.curso.models.Permiso;
import com.gabo32.edteam.curso.models.Role;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class RoleDaoImp implements RoleDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public List<Role> getAll() {
        String hql = "FROM Role as r";
        return (List<Role>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public Role get(long id) {
        return entityManager.find(Role.class, id);
    }

    @Transactional
    @Override
    public Role register(Role role) {
        entityManager.merge(role);
        return role;
    }

    @Transactional
    @Override
    public Role update(Role role) {
        return entityManager.merge(role);
    }

    @Transactional
    @Override
    public void delete(long id) {
        Role role = get(id);
        entityManager.remove(role);
    }
}
