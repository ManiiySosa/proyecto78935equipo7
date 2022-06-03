package mx.uv.tis;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

public class PedidoConf {
    @Bean
    public XsdSchema productoSchema(){
        return new SimpleXsdSchema( new ClassPathResource("pedido.xsd"));
    }

    @Bean
    public ServletRegistrationBean <MessageDispatcherServlet> messageDispatcherServlet(
            ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean(name = "pedido")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema pedidoSchema) {
        DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
        wsdl.setPortTypeName("pedidoPort");
        wsdl.setLocationUri("/ws");
        wsdl.setTargetNamespace("https://mx.uv.tis/pedido");
        wsdl.setSchema(pedidoSchema);
        return wsdl;
    }
}
