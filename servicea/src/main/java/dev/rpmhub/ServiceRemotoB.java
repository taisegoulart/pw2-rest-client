package dev.rpmhub;
//Adição dos imports necessários
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
//Implementando a interface de um cliente para se comunicar com o ServiceB
@RegisterRestClient(baseUri ="http://localhost:4444/serviceb") 
//Porta 4444 foi utilizada pois estamos querendo nos comunicar com o B, mesmo que esse arquivo esteja dentro do Service A

public interface ServiceRemotoB {
    //Interface fará a conexão com o ServiceB e também estabelece os métodos que devem ser chamados
    @GET
    @Path("/person/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public Person getPerson (@PathParam("name") String name);
}
