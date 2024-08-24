package org.Riwi.EventsAPIcmRest.controllers.GenericMethods;

import java.util.List;

public interface ReadAllControllerMethod<Entity> {
    public List<Entity> readAll();
}
