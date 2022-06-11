package com.maktab74.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {


    private static final EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("HW8");
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}

