package org.Riwi.EventsAPIcmRest.services.CRUD;

public interface ReadById<Entity, ID>{
    public Entity readById(ID id);
}
