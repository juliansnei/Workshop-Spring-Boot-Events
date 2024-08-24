package org.Riwi.EventsAPIcmRest.controllers.ImplementationControllers;

import org.Riwi.EventsAPIcmRest.controllers.InterfacesControllersPerEntity.InterfaceEventController;
import org.Riwi.EventsAPIcmRest.entities.EventEntity;
import org.Riwi.EventsAPIcmRest.services.InterfacesPerEntitiy.InterfaceEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventsController implements InterfaceEventController {

    @Autowired
    InterfaceEventService eventService;

    @Override
    @DeleteMapping("/{id}")
    public void destroy(@PathVariable("id") String id) {
        eventService.destroy(id);
    }

    @Override
    @GetMapping("/all")
    public List<EventEntity> readAll() {
        return eventService.readAll();
    }

    @Override
    @GetMapping("/{event-id}")
    public EventEntity readById(@PathVariable("event-id") String id) {
        return eventService.readById(id);
    }

    @Override
    @PostMapping("/save")
    public EventEntity save(@RequestBody EventEntity eventEntity) {
        return eventService.save(eventEntity);
    }

    @PostMapping("/update")
    public EventEntity update(@RequestBody EventEntity eventEntity) {
        return eventService.save(eventEntity);
    }

    @GetMapping("page/{pageNo}")
    public List<EventEntity> findPaginated(@PathVariable (value = "pageNo") int pageNo){
        int pageSize = 2;

        Page<EventEntity> page = eventService.findPaginated(pageNo, pageSize);
        List<EventEntity> listEvents = page.getContent();
        return listEvents;
    }
}
