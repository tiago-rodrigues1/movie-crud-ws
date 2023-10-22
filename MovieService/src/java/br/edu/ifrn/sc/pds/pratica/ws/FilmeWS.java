package br.edu.ifrn.sc.pds.pratica.ws;

import br.edu.ifrn.sc.pds.pratica.dominio.Filme;
import br.edu.ifrn.sc.pds.pratica.persistencia.FilmeDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "FilmeWS")
public class FilmeWS {
    
    @WebMethod(operationName="createMovie")
    public boolean createMovie(@WebParam(name="filme") Filme filme ) {
        FilmeDAO filmeDao = new FilmeDAO();
        return filmeDao.inserirFilme(filme);
    }
    
    @WebMethod(operationName="updateMovie")
    public boolean updateMovie(@WebParam(name="filme") Filme filme) {
        FilmeDAO filmeDao = new FilmeDAO();
        return filmeDao.alterarFilme(filme);
    }
    
    @WebMethod(operationName="listMovies")
    public List<Filme> listMovies() {
        FilmeDAO filmeDao = new FilmeDAO();
        return filmeDao.listarFilmes();
    }
    
    @WebMethod(operationName="destroyMovie")
    public boolean destroyMovie(@WebParam(name="id") int id) {
        FilmeDAO filmeDao = new FilmeDAO();
        return filmeDao.removerFilme(id);
    }
    
    @WebMethod(operationName="retrieveMovie")
    public Filme showMovie(@WebParam(name="titulo") String titulo) {
        FilmeDAO filmeDao = new FilmeDAO();
        return filmeDao.buscarFilme(titulo);
    }
}
