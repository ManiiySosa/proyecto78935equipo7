//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.06.01 a las 02:30:46 AM CDT 
//


package https.tis_uv_mx.catalogo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.tis_uv_mx.catalogo package. 
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

    private final static QName _ListarCategoriasRequest_QNAME = new QName("https://tis.uv.mx/catalogo", "listarCategoriasRequest");
    private final static QName _BuscarProductosRequest_QNAME = new QName("https://tis.uv.mx/catalogo", "buscarProductosRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.tis_uv_mx.catalogo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarCategoriasResponse }
     * 
     */
    public ListarCategoriasResponse createListarCategoriasResponse() {
        return new ListarCategoriasResponse();
    }

    /**
     * Create an instance of {@link BuscarProductosResponse }
     * 
     */
    public BuscarProductosResponse createBuscarProductosResponse() {
        return new BuscarProductosResponse();
    }

    /**
     * Create an instance of {@link BuscarProductosCategoriaResponse }
     * 
     */
    public BuscarProductosCategoriaResponse createBuscarProductosCategoriaResponse() {
        return new BuscarProductosCategoriaResponse();
    }

    /**
     * Create an instance of {@link AgregarCategoriaRequest }
     * 
     */
    public AgregarCategoriaRequest createAgregarCategoriaRequest() {
        return new AgregarCategoriaRequest();
    }

    /**
     * Create an instance of {@link AgregarCategoriaResponse }
     * 
     */
    public AgregarCategoriaResponse createAgregarCategoriaResponse() {
        return new AgregarCategoriaResponse();
    }

    /**
     * Create an instance of {@link ListarCategoriasResponse.Categorias }
     * 
     */
    public ListarCategoriasResponse.Categorias createListarCategoriasResponseCategorias() {
        return new ListarCategoriasResponse.Categorias();
    }

    /**
     * Create an instance of {@link AgregarProductoRequest }
     * 
     */
    public AgregarProductoRequest createAgregarProductoRequest() {
        return new AgregarProductoRequest();
    }

    /**
     * Create an instance of {@link AgregarProductoResponse }
     * 
     */
    public AgregarProductoResponse createAgregarProductoResponse() {
        return new AgregarProductoResponse();
    }

    /**
     * Create an instance of {@link BuscarProductosResponse.Productos }
     * 
     */
    public BuscarProductosResponse.Productos createBuscarProductosResponseProductos() {
        return new BuscarProductosResponse.Productos();
    }

    /**
     * Create an instance of {@link BuscarProductosCategoriaRequest }
     * 
     */
    public BuscarProductosCategoriaRequest createBuscarProductosCategoriaRequest() {
        return new BuscarProductosCategoriaRequest();
    }

    /**
     * Create an instance of {@link BuscarProductosCategoriaResponse.ProductosCategoria }
     * 
     */
    public BuscarProductosCategoriaResponse.ProductosCategoria createBuscarProductosCategoriaResponseProductosCategoria() {
        return new BuscarProductosCategoriaResponse.ProductosCategoria();
    }

    /**
     * Create an instance of {@link ModificarProductoRequest }
     * 
     */
    public ModificarProductoRequest createModificarProductoRequest() {
        return new ModificarProductoRequest();
    }

    /**
     * Create an instance of {@link ModificarproductoResponse }
     * 
     */
    public ModificarproductoResponse createModificarproductoResponse() {
        return new ModificarproductoResponse();
    }

    /**
     * Create an instance of {@link BorrarProductoRequest }
     * 
     */
    public BorrarProductoRequest createBorrarProductoRequest() {
        return new BorrarProductoRequest();
    }

    /**
     * Create an instance of {@link BorrarProductoResponse }
     * 
     */
    public BorrarProductoResponse createBorrarProductoResponse() {
        return new BorrarProductoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://tis.uv.mx/catalogo", name = "listarCategoriasRequest")
    public JAXBElement<Object> createListarCategoriasRequest(Object value) {
        return new JAXBElement<Object>(_ListarCategoriasRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://tis.uv.mx/catalogo", name = "buscarProductosRequest")
    public JAXBElement<Object> createBuscarProductosRequest(Object value) {
        return new JAXBElement<Object>(_BuscarProductosRequest_QNAME, Object.class, null, value);
    }

}
