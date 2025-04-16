package com.app.Petcare_BE_v5.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.Petcare_BE_v5.model.Manager;
import com.app.Petcare_BE_v5.model.Pet;
import com.app.Petcare_BE_v5.model.PetCareCenter;
import com.app.Petcare_BE_v5.model.PetOwner;
import com.app.Petcare_BE_v5.model.Document;
import com.app.Petcare_BE_v5.model.PetService;
import com.app.Petcare_BE_v5.enums.PetServiceType;
import com.app.Petcare_BE_v5.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterPets")
@Table(schema = "\"petcare_be_v5_518\"", name = "\"PetCareCenterPets\"")
@Data
public class PetCareCenterPets{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"PetId\"")
    private Integer petId;
 
}