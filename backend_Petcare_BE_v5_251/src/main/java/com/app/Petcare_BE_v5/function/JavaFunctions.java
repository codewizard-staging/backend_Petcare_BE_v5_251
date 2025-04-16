package com.app.Petcare_BE_v5.function;

import com.app.Petcare_BE_v5.model.Manager;
import com.app.Petcare_BE_v5.model.Pet;
import com.app.Petcare_BE_v5.model.PetCareCenter;
import com.app.Petcare_BE_v5.model.PetOwner;
import com.app.Petcare_BE_v5.model.Document;
import com.app.Petcare_BE_v5.model.PetService;
import com.app.Petcare_BE_v5.enums.PetServiceType;
import com.app.Petcare_BE_v5.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.Petcare_BE_v5.repository.PetServiceRepository;
import com.app.Petcare_BE_v5.repository.PetOwnerRepository;
import com.app.Petcare_BE_v5.repository.PetCareCenterRepository;
import com.app.Petcare_BE_v5.repository.ManagerRepository;
import com.app.Petcare_BE_v5.repository.DocumentRepository;
import com.app.Petcare_BE_v5.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
