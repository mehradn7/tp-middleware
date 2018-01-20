package com.malaikaconsultants.ZipCodeWebService;

public class ZipCodeDistanceSoapProxy implements com.malaikaconsultants.ZipCodeWebService.ZipCodeDistanceSoap {
  private String _endpoint = null;
  private com.malaikaconsultants.ZipCodeWebService.ZipCodeDistanceSoap zipCodeDistanceSoap = null;
  
  public ZipCodeDistanceSoapProxy() {
    _initZipCodeDistanceSoapProxy();
  }
  
  public ZipCodeDistanceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initZipCodeDistanceSoapProxy();
  }
  
  private void _initZipCodeDistanceSoapProxy() {
    try {
      zipCodeDistanceSoap = (new com.malaikaconsultants.ZipCodeWebService.ZipCodeDistanceLocator()).getZipCodeDistanceSoap();
      if (zipCodeDistanceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)zipCodeDistanceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)zipCodeDistanceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (zipCodeDistanceSoap != null)
      ((javax.xml.rpc.Stub)zipCodeDistanceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.malaikaconsultants.ZipCodeWebService.ZipCodeDistanceSoap getZipCodeDistanceSoap() {
    if (zipCodeDistanceSoap == null)
      _initZipCodeDistanceSoapProxy();
    return zipCodeDistanceSoap;
  }
  
  public com.malaikaconsultants.ZipCodeWebService.ZIPCodeWithinRadius[] getZIPCodesWithinRadius(java.lang.String ZIPCode, java.lang.String radiusInMiles) throws java.rmi.RemoteException{
    if (zipCodeDistanceSoap == null)
      _initZipCodeDistanceSoapProxy();
    return zipCodeDistanceSoap.getZIPCodesWithinRadius(ZIPCode, radiusInMiles);
  }
  
  public com.malaikaconsultants.ZipCodeWebService.ZIPCodeDistance getDistanceBetweenTwoZIPCodes(java.lang.String ZIPCode1, java.lang.String ZIPCode2) throws java.rmi.RemoteException{
    if (zipCodeDistanceSoap == null)
      _initZipCodeDistanceSoapProxy();
    return zipCodeDistanceSoap.getDistanceBetweenTwoZIPCodes(ZIPCode1, ZIPCode2);
  }
  
  
}