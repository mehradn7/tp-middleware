/**
 * ZipCodeDistanceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.malaikaconsultants.ZipCodeWebService;

public interface ZipCodeDistanceSoap extends java.rmi.Remote {

    /**
     * Returns all the zip codes within the specified radius (in miles)
     * of a particular zip code.
     */
    public com.malaikaconsultants.ZipCodeWebService.ZIPCodeWithinRadius[] getZIPCodesWithinRadius(java.lang.String ZIPCode, java.lang.String radiusInMiles) throws java.rmi.RemoteException;

    /**
     * Returns the distance (in miles) between 2 zip codes.
     */
    public com.malaikaconsultants.ZipCodeWebService.ZIPCodeDistance getDistanceBetweenTwoZIPCodes(java.lang.String ZIPCode1, java.lang.String ZIPCode2) throws java.rmi.RemoteException;
}
