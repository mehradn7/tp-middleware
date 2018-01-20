/**
 * ZipCodeLookupSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.malaikaconsultants.ZipCodeWebService;

public interface ZipCodeLookupSoap extends java.rmi.Remote {

    /**
     * Returns the information related to the ZIP code : ZIPCode,
     * City, State,County, City Type, Latitude, Longitude, Time Zone, Elevation,
     * Day Light Savings flag, Classification code and Multiple county flag.
     */
    public com.malaikaconsultants.ZipCodeWebService.ZIPCode[] getZIPCodeInformation(java.lang.String ZIPCode) throws java.rmi.RemoteException;

    /**
     * Returns the information related to all the ZIP codes for a
     * city and state : ZIPCode, City, State,County, City Type, Latitude,
     * Longitude, Time Zone, Elevation, Day Light Savings flag, Classification
     * code and Multiple county flag.
     */
    public com.malaikaconsultants.ZipCodeWebService.ZIPCode[] getZIPCodeForCityState(java.lang.String city, java.lang.String state) throws java.rmi.RemoteException;

    /**
     * Returns the information related to all the ZIP codes in a state
     * : ZIPCode, City, State,County, City Type, Latitude, Longitude, Time
     * Zone, Elevation, Day Light Savings flag, Classification code and Multiple
     * county flag.
     */
    public com.malaikaconsultants.ZipCodeWebService.ZIPCode[] getAllZIPCodesForState(java.lang.String state) throws java.rmi.RemoteException;

    /**
     * Returns the information related to the ZIP code for a latitude
     * and longitude position : ZIPCode, City, State,County, City Type, Latitude,
     * Longitude, Time Zone, Elevation, Day Light Savings flag, Classification
     * code and Multiple county flag.
     */
    public com.malaikaconsultants.ZipCodeWebService.ZIPCode[] getZIPCodeForLatitudeLongitude(java.lang.String latitude, java.lang.String longitude) throws java.rmi.RemoteException;

    /**
     * Returns all the area codes associated with a ZIP code.
     */
    public com.malaikaconsultants.ZipCodeWebService.ZIPCode getAllAreaCodesForZIPCode(java.lang.String ZIPCode) throws java.rmi.RemoteException;
}
