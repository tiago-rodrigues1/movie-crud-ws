
package br.edu.ifrn.sc.pds.pratica;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * Eclipse Metro/2.4.8 (RELEASE-2.4.8-e044505; 2022-01-04T13:29:23+0000) JAXWS-RI/2.3.5 JAXWS-API/2.3.3 JAXB-RI/2.3.5 JAXB-API/2.3.3
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FilmeWS", targetNamespace = "http://ws.pratica.pds.sc.ifrn.edu.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FilmeWS {


    /**
     * 
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "destroyMovie", targetNamespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", className = "br.edu.ifrn.sc.pds.pratica.DestroyMovie")
    @ResponseWrapper(localName = "destroyMovieResponse", targetNamespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", className = "br.edu.ifrn.sc.pds.pratica.DestroyMovieResponse")
    @Action(input = "http://ws.pratica.pds.sc.ifrn.edu.br/FilmeWS/destroyMovieRequest", output = "http://ws.pratica.pds.sc.ifrn.edu.br/FilmeWS/destroyMovieResponse")
    public boolean destroyMovie(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param titulo
     * @return
     *     returns br.edu.ifrn.sc.pds.pratica.Filme
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retrieveMovie", targetNamespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", className = "br.edu.ifrn.sc.pds.pratica.RetrieveMovie")
    @ResponseWrapper(localName = "retrieveMovieResponse", targetNamespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", className = "br.edu.ifrn.sc.pds.pratica.RetrieveMovieResponse")
    @Action(input = "http://ws.pratica.pds.sc.ifrn.edu.br/FilmeWS/retrieveMovieRequest", output = "http://ws.pratica.pds.sc.ifrn.edu.br/FilmeWS/retrieveMovieResponse")
    public Filme retrieveMovie(
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo);

    /**
     * 
     * @param filme
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createMovie", targetNamespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", className = "br.edu.ifrn.sc.pds.pratica.CreateMovie")
    @ResponseWrapper(localName = "createMovieResponse", targetNamespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", className = "br.edu.ifrn.sc.pds.pratica.CreateMovieResponse")
    @Action(input = "http://ws.pratica.pds.sc.ifrn.edu.br/FilmeWS/createMovieRequest", output = "http://ws.pratica.pds.sc.ifrn.edu.br/FilmeWS/createMovieResponse")
    public boolean createMovie(
        @WebParam(name = "filme", targetNamespace = "")
        Filme filme);

    /**
     * 
     * @param filme
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateMovie", targetNamespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", className = "br.edu.ifrn.sc.pds.pratica.UpdateMovie")
    @ResponseWrapper(localName = "updateMovieResponse", targetNamespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", className = "br.edu.ifrn.sc.pds.pratica.UpdateMovieResponse")
    @Action(input = "http://ws.pratica.pds.sc.ifrn.edu.br/FilmeWS/updateMovieRequest", output = "http://ws.pratica.pds.sc.ifrn.edu.br/FilmeWS/updateMovieResponse")
    public boolean updateMovie(
        @WebParam(name = "filme", targetNamespace = "")
        Filme filme);

    /**
     * 
     * @return
     *     returns java.util.List<br.edu.ifrn.sc.pds.pratica.Filme>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listMovies", targetNamespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", className = "br.edu.ifrn.sc.pds.pratica.ListMovies")
    @ResponseWrapper(localName = "listMoviesResponse", targetNamespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", className = "br.edu.ifrn.sc.pds.pratica.ListMoviesResponse")
    @Action(input = "http://ws.pratica.pds.sc.ifrn.edu.br/FilmeWS/listMoviesRequest", output = "http://ws.pratica.pds.sc.ifrn.edu.br/FilmeWS/listMoviesResponse")
    public List<Filme> listMovies();

}