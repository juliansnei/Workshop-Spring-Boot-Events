package org.Riwi.EventsAPIcmRest.controllers.InterfacesControllersPerEntity;

import org.Riwi.EventsAPIcmRest.controllers.GenericMethods.*;
import org.Riwi.EventsAPIcmRest.entities.EventEntity;

public interface InterfaceEventController extends
        SaveControllerMethod<EventEntity>,
        ReadAllControllerMethod<EventEntity>,
        ReadByIdControllerMethod<EventEntity,String>,
        DestroyControllerMethod<String>{
}
