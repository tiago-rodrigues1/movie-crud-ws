
package br.edu.ifrn.sc.pds.pratica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de createMovie complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="createMovie"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filme" type="{http://ws.pratica.pds.sc.ifrn.edu.br/}filme" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createMovie", propOrder = {
    "filme"
})
public class CreateMovie {

    protected Filme filme;

    /**
     * Obtém o valor da propriedade filme.
     * 
     * @return
     *     possible object is
     *     {@link Filme }
     *     
     */
    public Filme getFilme() {
        return filme;
    }

    /**
     * Define o valor da propriedade filme.
     * 
     * @param value
     *     allowed object is
     *     {@link Filme }
     *     
     */
    public void setFilme(Filme value) {
        this.filme = value;
    }

}
