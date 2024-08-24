package org.Riwi.EventsAPIcmRest.services.InterfacesPerEntitiy;
import org.Riwi.EventsAPIcmRest.services.CRUD.*;
import org.Riwi.EventsAPIcmRest.entities.EventEntity;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;


@Service
public interface InterfaceEventService extends
        Save<EventEntity>,
        Destroy<String>,
        ReadAll<EventEntity>,
        ReadById<EventEntity,String>{
    Page<EventEntity> findPaginated(int pageNo, int pageSize);
}
