package com.app.Petcare_BE_v5.function;

import com.app.Petcare_BE_v5.model.Manager;
import com.app.Petcare_BE_v5.model.Pet;
import com.app.Petcare_BE_v5.model.PetCareCenter;
import com.app.Petcare_BE_v5.model.PetOwner;
import com.app.Petcare_BE_v5.model.Document;
import com.app.Petcare_BE_v5.model.PetService;




import com.app.Petcare_BE_v5.enums.PetServiceType;
import com.app.Petcare_BE_v5.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  