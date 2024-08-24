package org.Riwi.EventsAPIcmRest.repository;

import org.Riwi.EventsAPIcmRest.entities.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<EventEntity, String> {
}
