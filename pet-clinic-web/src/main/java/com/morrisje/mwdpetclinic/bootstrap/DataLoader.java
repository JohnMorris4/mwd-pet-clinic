package com.morrisje.mwdpetclinic.bootstrap;

import com.morrisje.mwdpetclinic.model.Owner;
import com.morrisje.mwdpetclinic.model.Pet;
import com.morrisje.mwdpetclinic.model.PetType;
import com.morrisje.mwdpetclinic.model.Vet;
import com.morrisje.mwdpetclinic.services.OwnerService;
import com.morrisje.mwdpetclinic.services.PetTypeService;
import com.morrisje.mwdpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by jmorris on 12/9/18
 */
@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

//    ==== Constructors ===
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;

        this.petTypeService = petTypeService;
    }




    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatType = petTypeService.save(cat);






        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("155 Elm Street");
        owner1.setCity("Camden");
        owner1.setState("SC");
        owner1.setZipCode("29020");
        owner1.setTelephone("(803) 285-1725");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(saveDogType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Killer");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Michaelson");
        owner2.setAddress("185 S. Lake Drive");
        owner2.setCity("Ridgeway");
        owner2.setState("SC");
        owner2.setZipCode("29169");
        owner2.setTelephone("(803) 753-1993");

        Pet fionasPet = new Pet();
        fionasPet.setPetType(saveCatType);
        fionasPet.setOwner(owner2);
        fionasPet.setBirthDate(LocalDate.now());
        fionasPet.setName("Buffy");
        owner2.getPets().add(fionasPet);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
