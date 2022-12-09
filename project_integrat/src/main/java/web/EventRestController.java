package web;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entites.Evenement;
import repositories.EventRepository;

@RestController
public class EventRestController {
	private EventRepository eventRepository;
	
	public EventRestController (EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}
	
	@GetMapping(path = "/events")
	public List<Evenement> listEvenement(){
	return eventRepository.findAll();
	}
	
	@GetMapping(path = "/events/{id}")
	public Evenement getEvenement(@PathVariable Long id ){
	return eventRepository.findById(id).get();	
	}
	
	@PostMapping(path = "/events")
	public Evenement save(@PathVariable Evenement evenement ){
	return eventRepository.save(evenement);	
	}
	
	@PutMapping(path = "/events/{id_event}")
	public Evenement update(@PathVariable Long id ,@RequestBody Evenement evenement ){
		evenement.setId(id);
		return eventRepository.save(evenement);	
	}
	
	@DeleteMapping(path = "/events/{id_event}")
	public void delete(@PathVariable Long id ){
		
		 eventRepository.deleteById(id);	
	}
	
	
	
}

