//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.06.03 a las 08:00:34 PM CDT 
//


package https.tis_uv_mx.pedido;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.tis_uv_mx.pedido package. 
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

    private final static QName _ListarPedidoRequest_QNAME = new QName("https://tis.uv.mx/pedido", "listarPedidoRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.tis_uv_mx.pedido
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarPedidoResponse }
     * 
     */
    public ListarPedidoResponse createListarPedidoResponse() {
        return new ListarPedidoResponse();
    }

    /**
     * Create an instance of {@link AgregarPedidoRequest }
     * 
     */
    public AgregarPedidoRequest createAgregarPedidoRequest() {
        return new AgregarPedidoRequest();
    }

    /**
     * Create an instance of {@link AgregarPedidoResponse }
     * 
     */
    public AgregarPedidoResponse createAgregarPedidoResponse() {
        return new AgregarPedidoResponse();
    }

    /**
     * Create an instance of {@link ListarPedidoResponse.Pedido }
     * 
     */
    public ListarPedidoResponse.Pedido createListarPedidoResponsePedido() {
        return new ListarPedidoResponse.Pedido();
    }

    /**
     * Create an instance of {@link BorrarPedidoRequest }
     * 
     */
    public BorrarPedidoRequest createBorrarPedidoRequest() {
        return new BorrarPedidoRequest();
    }

    /**
     * Create an instance of {@link BorrarPedidoResponse }
     * 
     */
    public BorrarPedidoResponse createBorrarPedidoResponse() {
        return new BorrarPedidoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://tis.uv.mx/pedido", name = "listarPedidoRequest")
    public JAXBElement<Object> createListarPedidoRequest(Object value) {
        return new JAXBElement<Object>(_ListarPedidoRequest_QNAME, Object.class, null, value);
    }

}
