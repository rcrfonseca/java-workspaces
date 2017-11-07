package webservices1;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name="WSMensagem")

public class WSMensagem {
	
	@WebMethod
	public String getMensagem(){
		return "Coti Caveiras...";
	}
}