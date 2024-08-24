package org.Riwi.EventsAPIcmRest.controllers.GenericMethods;

public interface ReadByIdControllerMethod<Entity, ID> {
    public Entity readById(ID id);
}
