package mx.uv.tis.Catalogo;


import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class CatalogoConf {
    @Bean
    public XsdSchema catalogoSchema(){
        return new SimpleXsdSchema(new ClassPathResource("catalogo.xsd"));
    }

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setTransformWsdlLocations(true);
        servlet.setApplicationContext(applicationContext);
        return new ServletRegistrationBean<>(servlet, "/api/*");
    }

    @Bean(name = "catalogo")
    public DefaultWsdl11Definition defaultWsdlDefinition(XsdSchema catalogoSchema){
        DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
        wsdl.setPortTypeName("catalogoPort");
        wsdl.setLocationUri("/api");
        wsdl.setTargetNamespace("https://tis.uv.mx/catalogo");
        wsdl.setSchema(catalogoSchema);
        return wsdl;
    }
}