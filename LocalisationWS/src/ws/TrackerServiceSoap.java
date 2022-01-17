package ws;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import dao.IGPSTrackerLocal;
import entities.GPSTracker;

@WebService
public class TrackerServiceSoap {
	@EJB
	private IGPSTrackerLocal gl;
	
    @WebMethod
	public boolean ajouter(GPSTracker obj) {
		return gl.ajouter(obj);
	}
    @WebMethod
	public boolean modifier(GPSTracker obj) {
		return gl.modifier(obj);
	}
    @WebMethod
	public boolean supprimer(GPSTracker obj) {
		return gl.supprimer(obj);
	}
    @WebMethod
	public GPSTracker findById(int id) {
		return gl.findById(id);
	}
    @WebMethod
	public GPSTracker findBySim(String sim) {
		return gl.findBySim(sim);
	}
    @WebMethod
	public List<GPSTracker> findAll() {
		return gl.findAll();
	}
	
	

}
