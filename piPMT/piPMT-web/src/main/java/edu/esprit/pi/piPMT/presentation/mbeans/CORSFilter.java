package edu.esprit.pi.piPMT.presentation.mbeans;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;

@Provider
@PreMatching
public class CORSFilter implements ContainerResponseFilter, ContainerRequestFilter {
 
    @Override
    public void filter(ContainerRequestContext requestContext,
            ContainerResponseContext response) {
        response.getHeaders().putSingle("Access-Control-Allow-Origin", "*");
        response.getHeaders().putSingle("Access-Control-Allow-Methods",
                                        "GET, POST, PUT, DELETE");
        response.getHeaders().putSingle("Access-Control-Allow-Headers",
                                        "content-type");
        response.getHeaders().putSingle("X-Powered-By", "EPITA.");
    }
 
    @Override
    public void filter(ContainerRequestContext requestContext)
            throws IOException {
        requestContext.getHeaders().putSingle("Access-Control-Allow-Origin",
                                              "*");
        requestContext.getHeaders().putSingle("Access-Control-Allow-Methods",
                                              "GET, POST, PUT, DELETE");
        requestContext.getHeaders().putSingle("Access-Control-Allow-Headers",
                                              "content-type");
    }
}