/**
 * ZIPCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.malaikaconsultants.ZipCodeWebService;

public class ZIPCode  implements java.io.Serializable {
    private java.lang.String zipCode;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String county;

    private com.malaikaconsultants.ZipCodeWebService.AreaCode[] areaCodes;

    private java.lang.String cityType;

    private java.lang.String latitude;

    private java.lang.String longitude;

    private java.lang.String elevation;

    private java.lang.String timeZone;

    private java.lang.String dayLightSavings;

    private java.lang.String classification;

    private java.lang.String multiCountyFlag;

    private java.lang.String errorMessage;

    public ZIPCode() {
    }

    public ZIPCode(
           java.lang.String zipCode,
           java.lang.String city,
           java.lang.String state,
           java.lang.String county,
           com.malaikaconsultants.ZipCodeWebService.AreaCode[] areaCodes,
           java.lang.String cityType,
           java.lang.String latitude,
           java.lang.String longitude,
           java.lang.String elevation,
           java.lang.String timeZone,
           java.lang.String dayLightSavings,
           java.lang.String classification,
           java.lang.String multiCountyFlag,
           java.lang.String errorMessage) {
           this.zipCode = zipCode;
           this.city = city;
           this.state = state;
           this.county = county;
           this.areaCodes = areaCodes;
           this.cityType = cityType;
           this.latitude = latitude;
           this.longitude = longitude;
           this.elevation = elevation;
           this.timeZone = timeZone;
           this.dayLightSavings = dayLightSavings;
           this.classification = classification;
           this.multiCountyFlag = multiCountyFlag;
           this.errorMessage = errorMessage;
    }


    /**
     * Gets the zipCode value for this ZIPCode.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this ZIPCode.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the city value for this ZIPCode.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this ZIPCode.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this ZIPCode.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this ZIPCode.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the county value for this ZIPCode.
     * 
     * @return county
     */
    public java.lang.String getCounty() {
        return county;
    }


    /**
     * Sets the county value for this ZIPCode.
     * 
     * @param county
     */
    public void setCounty(java.lang.String county) {
        this.county = county;
    }


    /**
     * Gets the areaCodes value for this ZIPCode.
     * 
     * @return areaCodes
     */
    public com.malaikaconsultants.ZipCodeWebService.AreaCode[] getAreaCodes() {
        return areaCodes;
    }


    /**
     * Sets the areaCodes value for this ZIPCode.
     * 
     * @param areaCodes
     */
    public void setAreaCodes(com.malaikaconsultants.ZipCodeWebService.AreaCode[] areaCodes) {
        this.areaCodes = areaCodes;
    }


    /**
     * Gets the cityType value for this ZIPCode.
     * 
     * @return cityType
     */
    public java.lang.String getCityType() {
        return cityType;
    }


    /**
     * Sets the cityType value for this ZIPCode.
     * 
     * @param cityType
     */
    public void setCityType(java.lang.String cityType) {
        this.cityType = cityType;
    }


    /**
     * Gets the latitude value for this ZIPCode.
     * 
     * @return latitude
     */
    public java.lang.String getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this ZIPCode.
     * 
     * @param latitude
     */
    public void setLatitude(java.lang.String latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this ZIPCode.
     * 
     * @return longitude
     */
    public java.lang.String getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this ZIPCode.
     * 
     * @param longitude
     */
    public void setLongitude(java.lang.String longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the elevation value for this ZIPCode.
     * 
     * @return elevation
     */
    public java.lang.String getElevation() {
        return elevation;
    }


    /**
     * Sets the elevation value for this ZIPCode.
     * 
     * @param elevation
     */
    public void setElevation(java.lang.String elevation) {
        this.elevation = elevation;
    }


    /**
     * Gets the timeZone value for this ZIPCode.
     * 
     * @return timeZone
     */
    public java.lang.String getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this ZIPCode.
     * 
     * @param timeZone
     */
    public void setTimeZone(java.lang.String timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the dayLightSavings value for this ZIPCode.
     * 
     * @return dayLightSavings
     */
    public java.lang.String getDayLightSavings() {
        return dayLightSavings;
    }


    /**
     * Sets the dayLightSavings value for this ZIPCode.
     * 
     * @param dayLightSavings
     */
    public void setDayLightSavings(java.lang.String dayLightSavings) {
        this.dayLightSavings = dayLightSavings;
    }


    /**
     * Gets the classification value for this ZIPCode.
     * 
     * @return classification
     */
    public java.lang.String getClassification() {
        return classification;
    }


    /**
     * Sets the classification value for this ZIPCode.
     * 
     * @param classification
     */
    public void setClassification(java.lang.String classification) {
        this.classification = classification;
    }


    /**
     * Gets the multiCountyFlag value for this ZIPCode.
     * 
     * @return multiCountyFlag
     */
    public java.lang.String getMultiCountyFlag() {
        return multiCountyFlag;
    }


    /**
     * Sets the multiCountyFlag value for this ZIPCode.
     * 
     * @param multiCountyFlag
     */
    public void setMultiCountyFlag(java.lang.String multiCountyFlag) {
        this.multiCountyFlag = multiCountyFlag;
    }


    /**
     * Gets the errorMessage value for this ZIPCode.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this ZIPCode.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZIPCode)) return false;
        ZIPCode other = (ZIPCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.areaCodes==null && other.getAreaCodes()==null) || 
             (this.areaCodes!=null &&
              java.util.Arrays.equals(this.areaCodes, other.getAreaCodes()))) &&
            ((this.cityType==null && other.getCityType()==null) || 
             (this.cityType!=null &&
              this.cityType.equals(other.getCityType()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.elevation==null && other.getElevation()==null) || 
             (this.elevation!=null &&
              this.elevation.equals(other.getElevation()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.dayLightSavings==null && other.getDayLightSavings()==null) || 
             (this.dayLightSavings!=null &&
              this.dayLightSavings.equals(other.getDayLightSavings()))) &&
            ((this.classification==null && other.getClassification()==null) || 
             (this.classification!=null &&
              this.classification.equals(other.getClassification()))) &&
            ((this.multiCountyFlag==null && other.getMultiCountyFlag()==null) || 
             (this.multiCountyFlag!=null &&
              this.multiCountyFlag.equals(other.getMultiCountyFlag()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getAreaCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAreaCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAreaCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCityType() != null) {
            _hashCode += getCityType().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getElevation() != null) {
            _hashCode += getElevation().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getDayLightSavings() != null) {
            _hashCode += getDayLightSavings().hashCode();
        }
        if (getClassification() != null) {
            _hashCode += getClassification().hashCode();
        }
        if (getMultiCountyFlag() != null) {
            _hashCode += getMultiCountyFlag().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZIPCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "ZIPCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "ZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "County"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areaCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "AreaCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "AreaCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "AreaCode"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "CityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "Latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "Longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elevation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "Elevation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "TimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayLightSavings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "DayLightSavings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "Classification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiCountyFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "MultiCountyFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "ErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
