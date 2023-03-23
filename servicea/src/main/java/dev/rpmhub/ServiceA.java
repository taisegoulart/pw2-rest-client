/**
 * Copyright 2022 RPMHub @ https://github.com/rpmhub/pw2-rest-client
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.rpmhub;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;
//TODO Injeção de dependência (o que estava sendo pedido no arquivo de códito) e ejetar um service (o que estava escrito na descrição da issue) são a mesma coisa?
@Path("/servicea")
public class ServiceA { 
    
//Instanciando o RestClient para o Service B via injeção de dependência
@Inject
@RestClient

ServiceRemotoB remotoB;
    /**
     * @param name
     * @return nome da pessoa inserida no patch
     */
    @GET
    @Path("/person/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(@PathParam("name") String name){

        // Completando o método
        return remotoB.getPerson(name);
    }

}
