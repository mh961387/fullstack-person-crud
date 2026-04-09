package mh961387.services;

import mh961387.data.dto.PersonDTO;
import mh961387.exception.ResourceNotFoundException;
import static mh961387.mapper.ObjectMapper.parseListObjects;
import static mh961387.mapper.ObjectMapper.parseObject;

import mh961387.model.Person;
import mh961387.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = LoggerFactory.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;

    public List<PersonDTO> findAll(){
        return parseListObjects(repository.findAll(), PersonDTO.class);
    }

    public PersonDTO findById(Long id){
        var entity = repository.findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID."));
        logger.info("findAll person!");
        return parseObject(entity, PersonDTO.class);
    }

    private void validateDuplicateDocument(Person person){

        Optional<Person> existente =
                repository.findByDocument(person.getDocument());

        if (existente.isPresent() &&
                !existente.get().getId().equals(person.getId())) {

            throw new IllegalArgumentException("Document already registered");
        }
    }

    public PersonDTO create (PersonDTO person){
        var entity = parseObject(person, Person.class);

        validateDuplicateDocument(entity);

        logger.info("Creating one person!");
        return parseObject(repository.save(entity), PersonDTO.class);
    }

    public PersonDTO update (PersonDTO person){
        Person entity = repository.findById(person.getId())
                            .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID."));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setGender(person.getGender());
        entity.setAddress(person.getAddress());
        entity.setZipCode(person.getZipCode());
        entity.setCity(person.getCity());
        entity.setState(person.getState());
        entity.setDateBirth(person.getDateBirth());
        entity.setDocument(person.getDocument());
        entity.setFone(person.getFone());

        validateDuplicateDocument(entity);

        logger.info("Update one person!");
        return parseObject(repository.save(entity), PersonDTO.class);
    }

    public void delete(Long id){
        Person entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID."));
        logger.info("Deleting one person!");
        repository.delete(entity);
    }

}
