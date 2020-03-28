package ru.argustelecom.task.witalijbukatkin.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
    private static EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("entity");

    private static EntityManager entityManager = entityManagerFactory
            .createEntityManager();

    public static EntityManager getEntityManager() {
        return entityManager;
    }

    public static void shutdown(){
        entityManagerFactory.close();
    }
}
