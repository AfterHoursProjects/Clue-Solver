package restlets;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import resources.CardsResource;
import resources.StatusResource;
import resources.TriplesResource;

/**
 * @author matt
 * 
 */
public class ClueRestService extends Application {
	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.ws.rs.core.Application#getClasses()
	 */
	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> resources = new HashSet<Class<?>>();
		resources.add(StatusResource.class);
		resources.add(CardsResource.class);
		resources.add(TriplesResource.class);
		return resources;
	}
}
