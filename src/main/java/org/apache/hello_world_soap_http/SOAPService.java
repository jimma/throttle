/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.hello_world_soap_http;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.3-SNAPSHOT-2fc62cf0f53912b53a93409802f43418d067faf1
 * 2015-09-07T15:47:14.481+08:00
 * Generated source version: 3.1.3-SNAPSHOT
 * 
 */
@WebServiceClient(name = "SOAPService", 
                  wsdlLocation = "file:/home/jimma/code/cxf-git/stage/cxf/distribution/target/apache-cxf-3.1.3-SNAPSHOT/apache-cxf-3.1.3-SNAPSHOT/samples/throttling/src/main/config/hello_world.wsdl",
                  targetNamespace = "http://apache.org/hello_world_soap_http") 
public class SOAPService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://apache.org/hello_world_soap_http", "SOAPService");
    public final static QName SoapPort = new QName("http://apache.org/hello_world_soap_http", "SoapPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/jimma/code/cxf-git/stage/cxf/distribution/target/apache-cxf-3.1.3-SNAPSHOT/apache-cxf-3.1.3-SNAPSHOT/samples/throttling/src/main/config/hello_world.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SOAPService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/jimma/code/cxf-git/stage/cxf/distribution/target/apache-cxf-3.1.3-SNAPSHOT/apache-cxf-3.1.3-SNAPSHOT/samples/throttling/src/main/config/hello_world.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SOAPService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SOAPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SOAPService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SOAPService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SOAPService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SOAPService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns Greeter
     */
    @WebEndpoint(name = "SoapPort")
    public Greeter getSoapPort() {
        return super.getPort(SoapPort, Greeter.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Greeter
     */
    @WebEndpoint(name = "SoapPort")
    public Greeter getSoapPort(WebServiceFeature... features) {
        return super.getPort(SoapPort, Greeter.class, features);
    }

}
