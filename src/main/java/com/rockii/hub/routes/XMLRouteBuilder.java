package com.rockii.hub.routes;

import com.rockii.hub.dto.PPSImport;
import com.rockii.hub.dto.Person;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import java.util.Date;

@Component
public class XMLRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        this.configPerson();
        this.configPPS();
    }

    public void configPerson() throws Exception {
        // Specify the source XML file
        // 文件名通配方式 Person-202306261053077v1.xml
        String sourceXml = "file:C://rockiihub//input?antInclude=Person*.xml";

        // 暂存处理地址，并改变文件名称
        String processXml = "file:C://rockiihub//process?fileName=Person-"+ new Date().getTime() +".xml";

        // Convert XML to a Java object using the data format
        // XML Data Format
        JaxbDataFormat xmlDataFormat = new JaxbDataFormat();
        JAXBContext con = JAXBContext.newInstance(Person.class);
        xmlDataFormat.setContext(con);

        from(sourceXml).to(processXml)
                .unmarshal(xmlDataFormat)
                .to("bean:com.rockii.hub.importer.PersonImporter?method=processObject");

    }


    public void configPPS() throws Exception {
        // Specify the source XML file
        String sourceXml = "file:C://rockiihub//input?antInclude=prodorder*.xml";

        // 暂存处理地址，并改变文件名称
        String processXml = "file:C://rockiihub//process?fileName=prodorder-ssls-"+ new Date().getTime() +".xml";

        // Convert XML to a Java object using the data format
        // XML Data Format
        JaxbDataFormat xmlDataFormat = new JaxbDataFormat();
        JAXBContext con = JAXBContext.newInstance(PPSImport.class);
        xmlDataFormat.setContext(con);

        from(sourceXml).to(processXml)
                .unmarshal(xmlDataFormat)
                .to("bean:com.rockii.hub.importer.PPSImporter?method=processObject");

    }
}