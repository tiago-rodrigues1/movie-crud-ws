
package br.edu.ifrn.sc.pds.pratica;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifrn.sc.pds.pratica package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateMovie_QNAME = new QName("http://ws.pratica.pds.sc.ifrn.edu.br/", "createMovie");
    private final static QName _CreateMovieResponse_QNAME = new QName("http://ws.pratica.pds.sc.ifrn.edu.br/", "createMovieResponse");
    private final static QName _DestroyMovie_QNAME = new QName("http://ws.pratica.pds.sc.ifrn.edu.br/", "destroyMovie");
    private final static QName _DestroyMovieResponse_QNAME = new QName("http://ws.pratica.pds.sc.ifrn.edu.br/", "destroyMovieResponse");
    private final static QName _ListMovies_QNAME = new QName("http://ws.pratica.pds.sc.ifrn.edu.br/", "listMovies");
    private final static QName _ListMoviesResponse_QNAME = new QName("http://ws.pratica.pds.sc.ifrn.edu.br/", "listMoviesResponse");
    private final static QName _RetrieveMovie_QNAME = new QName("http://ws.pratica.pds.sc.ifrn.edu.br/", "retrieveMovie");
    private final static QName _RetrieveMovieResponse_QNAME = new QName("http://ws.pratica.pds.sc.ifrn.edu.br/", "retrieveMovieResponse");
    private final static QName _UpdateMovie_QNAME = new QName("http://ws.pratica.pds.sc.ifrn.edu.br/", "updateMovie");
    private final static QName _UpdateMovieResponse_QNAME = new QName("http://ws.pratica.pds.sc.ifrn.edu.br/", "updateMovieResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifrn.sc.pds.pratica
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateMovie }
     * 
     */
    public CreateMovie createCreateMovie() {
        return new CreateMovie();
    }

    /**
     * Create an instance of {@link CreateMovieResponse }
     * 
     */
    public CreateMovieResponse createCreateMovieResponse() {
        return new CreateMovieResponse();
    }

    /**
     * Create an instance of {@link DestroyMovie }
     * 
     */
    public DestroyMovie createDestroyMovie() {
        return new DestroyMovie();
    }

    /**
     * Create an instance of {@link DestroyMovieResponse }
     * 
     */
    public DestroyMovieResponse createDestroyMovieResponse() {
        return new DestroyMovieResponse();
    }

    /**
     * Create an instance of {@link ListMovies }
     * 
     */
    public ListMovies createListMovies() {
        return new ListMovies();
    }

    /**
     * Create an instance of {@link ListMoviesResponse }
     * 
     */
    public ListMoviesResponse createListMoviesResponse() {
        return new ListMoviesResponse();
    }

    /**
     * Create an instance of {@link RetrieveMovie }
     * 
     */
    public RetrieveMovie createRetrieveMovie() {
        return new RetrieveMovie();
    }

    /**
     * Create an instance of {@link RetrieveMovieResponse }
     * 
     */
    public RetrieveMovieResponse createRetrieveMovieResponse() {
        return new RetrieveMovieResponse();
    }

    /**
     * Create an instance of {@link UpdateMovie }
     * 
     */
    public UpdateMovie createUpdateMovie() {
        return new UpdateMovie();
    }

    /**
     * Create an instance of {@link UpdateMovieResponse }
     * 
     */
    public UpdateMovieResponse createUpdateMovieResponse() {
        return new UpdateMovieResponse();
    }

    /**
     * Create an instance of {@link Filme }
     * 
     */
    public Filme createFilme() {
        return new Filme();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMovie }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateMovie }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", name = "createMovie")
    public JAXBElement<CreateMovie> createCreateMovie(CreateMovie value) {
        return new JAXBElement<CreateMovie>(_CreateMovie_QNAME, CreateMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMovieResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateMovieResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", name = "createMovieResponse")
    public JAXBElement<CreateMovieResponse> createCreateMovieResponse(CreateMovieResponse value) {
        return new JAXBElement<CreateMovieResponse>(_CreateMovieResponse_QNAME, CreateMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestroyMovie }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DestroyMovie }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", name = "destroyMovie")
    public JAXBElement<DestroyMovie> createDestroyMovie(DestroyMovie value) {
        return new JAXBElement<DestroyMovie>(_DestroyMovie_QNAME, DestroyMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestroyMovieResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DestroyMovieResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", name = "destroyMovieResponse")
    public JAXBElement<DestroyMovieResponse> createDestroyMovieResponse(DestroyMovieResponse value) {
        return new JAXBElement<DestroyMovieResponse>(_DestroyMovieResponse_QNAME, DestroyMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMovies }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListMovies }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", name = "listMovies")
    public JAXBElement<ListMovies> createListMovies(ListMovies value) {
        return new JAXBElement<ListMovies>(_ListMovies_QNAME, ListMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMoviesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListMoviesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", name = "listMoviesResponse")
    public JAXBElement<ListMoviesResponse> createListMoviesResponse(ListMoviesResponse value) {
        return new JAXBElement<ListMoviesResponse>(_ListMoviesResponse_QNAME, ListMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMovie }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveMovie }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", name = "retrieveMovie")
    public JAXBElement<RetrieveMovie> createRetrieveMovie(RetrieveMovie value) {
        return new JAXBElement<RetrieveMovie>(_RetrieveMovie_QNAME, RetrieveMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMovieResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveMovieResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", name = "retrieveMovieResponse")
    public JAXBElement<RetrieveMovieResponse> createRetrieveMovieResponse(RetrieveMovieResponse value) {
        return new JAXBElement<RetrieveMovieResponse>(_RetrieveMovieResponse_QNAME, RetrieveMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMovie }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateMovie }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", name = "updateMovie")
    public JAXBElement<UpdateMovie> createUpdateMovie(UpdateMovie value) {
        return new JAXBElement<UpdateMovie>(_UpdateMovie_QNAME, UpdateMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMovieResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateMovieResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.pratica.pds.sc.ifrn.edu.br/", name = "updateMovieResponse")
    public JAXBElement<UpdateMovieResponse> createUpdateMovieResponse(UpdateMovieResponse value) {
        return new JAXBElement<UpdateMovieResponse>(_UpdateMovieResponse_QNAME, UpdateMovieResponse.class, null, value);
    }

}
