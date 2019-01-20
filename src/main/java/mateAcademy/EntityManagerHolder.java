package mateAcademy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerHolder {
    protected static EntityManager em;

    static {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("PatientPU");
        em = emf.createEntityManager();
    }

    public static EntityManager getEntityManager() {
        return em;
    }

    private EntityManagerHolder() {
    }
}
