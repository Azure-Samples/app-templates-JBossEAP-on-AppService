package org.agoncal.application.petstore.util;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DatabaseProducer {

    // ======================================
    // = Attributes =
    // ======================================

    @Produces
    @PersistenceContext(unitName = "applicationPetstorePU")
    private EntityManager em;
}
