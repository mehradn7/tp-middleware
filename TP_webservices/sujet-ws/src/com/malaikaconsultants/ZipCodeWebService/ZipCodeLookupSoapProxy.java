package com.malaikaconsultants.ZipCodeWebService;

public class ZipCodeLookupSoapProxy implements com.malaikaconsultants.ZipCodeWebService.ZipCodeLookupSoap {
  private String _endpoint = null;
  private com.malaikaconsultants.ZipCodeWebService.ZipCodeLookupSoap zipCodeLookupSoap = null;
  
  public ZipCodeLookupSoapProxy() {
    _initZipCodeLookupSoapProxy();
  }
  
  public ZipCodeLookupSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initZipCodeLookupSoapProxy();
  }
  
  private void _initZipCodeLookupSoapProxy() {
    try {
      zipCodeLookupSoap = (new com.malaikaconsultants.ZipCodeWebService.ZipCodeLookupLocator()).getZipCodeLookupSoap();
      if (zipCodeLookupSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)zipCodeLookupSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)zipCodeLookupSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (zipCodeLookupSoap != null)
      ((javax.xml.rpc.Stub)zipCodeLookupSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.malaikaconsultants.ZipCodeWebService.ZipCodeLookupSoap getZipCodeLookupSoap() {
    if (zipCodeLookupSoap == null)
      _initZipCodeLookupSoapProxy();
    return zipCodeLookupSoap;
  }
  
  public com.malaikaconsultants.ZipCodeWebService.ZIPCode[] getZIPCodeInformation(java.lang.String ZIPCode) throws java.rmi.RemoteException{
    if (zipCodeLookupSoap == null)
      _initZipCodeLookupSoapProxy();
    return zipCodeLookupSoap.getZIPCodeInformation(ZIPCode);
  }
  
  public com.malaikaconsultants.ZipCodeWebService.ZIPCode[] getZIPCodeForCityState(java.lang.String city, java.lang.String state) throws java.rmi.RemoteException{
    if (zipCodeLookupSoap == null)
      _initZipCodeLookupSoapProxy();
    return zipCodeLookupSoap.getZIPCodeForCityState(city, state);
  }
  
  public com.malaikaconsultants.ZipCodeWebService.ZIPCode[] getAllZIPCodesForState(java.lang.String state) throws java.rmi.RemoteException{
    if (zipCodeLookupSoap == null)
      _initZipCodeLookupSoapProxy();
    return zipCodeLookupSoap.getAllZIPCodesForState(state);
  }
  
  public com.malaikaconsultants.ZipCodeWebService.ZIPCode[] getZIPCodeForLatitudeLongitude(java.lang.String latitude, java.lang.String longitude) throws java.rmi.RemoteException{
    if (zipCodeLookupSoap == null)
      _initZipCodeLookupSoapProxy();
    return zipCodeLookupSoap.getZIPCodeForLatitudeLongitude(latitude, longitude);
  }
  
  public com.malaikaconsultants.ZipCodeWebService.ZIPCode getAllAreaCodesForZIPCode(java.lang.String ZIPCode) throws java.rmi.RemoteException{
    if (zipCodeLookupSoap == null)
      _initZipCodeLookupSoapProxy();
    return zipCodeLookupSoap.getAllAreaCodesForZIPCode(ZIPCode);
  }
  
  
}