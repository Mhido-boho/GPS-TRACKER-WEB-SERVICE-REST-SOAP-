package ws;


import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.IGPSTrackerLocal;
import entities.GPSTracker;



@Stateless
@Path("/")
public class TrackerRestService {
	@EJB
	private IGPSTrackerLocal gl;
	@POST
    @Path("/GPSTrackers")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean ajouter(GPSTracker obj) {
		return gl.ajouter(obj);
	}
	@PUT
    @Path("/GPSTrackers/")
	public boolean modifier(GPSTracker obj) {
		return gl.modifier(obj);
	}
	public boolean supprimer(GPSTracker obj) {
		return gl.supprimer(obj);
	}
	@GET
	@Path("/GPSTrackers/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public GPSTracker findById(@PathParam(value = "id") int id) {
		return gl.findById(id);
	}
	
	
	@Path("/GPSTrackers/sim/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public GPSTracker findBySim(@PathParam(value = "code") String code) {
		return gl.findBySim(code);
	}
	@GET
	@Path("/GPSTrackers/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<GPSTracker> findAll() {
		return gl.findAll();
	}
	

}
