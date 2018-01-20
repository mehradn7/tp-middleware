/**
 * ZipCodeLookupLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.malaikaconsultants.ZipCodeWebService;

public class ZipCodeLookupLocator extends org.apache.axis.client.Service implements com.malaikaconsultants.ZipCodeWebService.ZipCodeLookup {

    public ZipCodeLookupLocator() {
    }


    public ZipCodeLookupLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ZipCodeLookupLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ZipCodeLookupSoap
    private java.lang.String ZipCodeLookupSoap_address = "http://www.malaikaconsultants.com/Malaika-Consultants/ZipCodeLookup.asmx";

    public java.lang.String getZipCodeLookupSoapAddress() {
        return ZipCodeLookupSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ZipCodeLookupSoapWSDDServiceName = "ZipCodeLookupSoap";

    public java.lang.String getZipCodeLookupSoapWSDDServiceName() {
        return ZipCodeLookupSoapWSDDServiceName;
    }

    public void setZipCodeLookupSoapWSDDServiceName(java.lang.String name) {
        ZipCodeLookupSoapWSDDServiceName = name;
    }

    public com.malaikaconsultants.ZipCodeWebService.ZipCodeLookupSoap getZipCodeLookupSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ZipCodeLookupSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getZipCodeLookupSoap(endpoint);
    }

    public com.malaikaconsultants.ZipCodeWebService.ZipCodeLookupSoap getZipCodeLookupSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.malaikaconsultants.ZipCodeWebService.ZipCodeLookupSoapStub _stub = new com.malaikaconsultants.ZipCodeWebService.ZipCodeLookupSoapStub(portAddress, this);
            _stub.setPortName(getZipCodeLookupSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setZipCodeLookupSoapEndpointAddress(java.lang.String address) {
        ZipCodeLookupSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.malaikaconsultants.ZipCodeWebService.ZipCodeLookupSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.malaikaconsultants.ZipCodeWebService.ZipCodeLookupSoapStub _stub = new com.malaikaconsultants.ZipCodeWebService.ZipCodeLookupSoapStub(new java.net.URL(ZipCodeLookupSoap_address), this);
                _stub.setPortName(getZipCodeLookupSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ZipCodeLookupSoap".equals(inputPortName)) {
            return getZipCodeLookupSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "ZipCodeLookup");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "ZipCodeLookupSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ZipCodeLookupSoap".equals(portName)) {
            setZipCodeLookupSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
