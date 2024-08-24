package org.Riwi.EventsAPIcmRest.services.ImplementationServices;

import org.Riwi.EventsAPIcmRest.entities.EventEntity;
import org.Riwi.EventsAPIcmRest.repository.EventRepository;
import org.Riwi.EventsAPIcmRest.services.InterfacesPerEntitiy.InterfaceEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements InterfaceEventService {

    @Autowired
    EventRepository eventRepository;

    @Override
    public EventEntity save(EventEntity eventEntity){
        return eventRepository.save(eventEntity);
    }

    @Override
    public void destroy(String id) {
        eventRepository.deleteById(id);
    }

    @Override
    public List<EventEntity> readAll() {
        return eventRepository.findAll();
    }



    @Override
    public EventEntity readById(String id) {
        return eventRepository.findById(id).orElse(null);
    }


    @Override
    public Page<EventEntity> findPaginated(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
        return eventRepository.findAll(pageable);
    }
}
