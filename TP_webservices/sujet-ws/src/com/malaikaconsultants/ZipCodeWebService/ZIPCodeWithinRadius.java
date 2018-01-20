/**
 * ZIPCodeWithinRadius.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.malaikaconsultants.ZipCodeWebService;

public class ZIPCodeWithinRadius  implements java.io.Serializable {
    private java.lang.String ZIPCode;

    private java.lang.String distance;

    private java.lang.String errorMessage;

    public ZIPCodeWithinRadius() {
    }

    public ZIPCodeWithinRadius(
           java.lang.String ZIPCode,
           java.lang.String distance,
           java.lang.String errorMessage) {
           this.ZIPCode = ZIPCode;
           this.distance = distance;
           this.errorMessage = errorMessage;
    }


    /**
     * Gets the ZIPCode value for this ZIPCodeWithinRadius.
     * 
     * @return ZIPCode
     */
    public java.lang.String getZIPCode() {
        return ZIPCode;
    }


    /**
     * Sets the ZIPCode value for this ZIPCodeWithinRadius.
     * 
     * @param ZIPCode
     */
    public void setZIPCode(java.lang.String ZIPCode) {
        this.ZIPCode = ZIPCode;
    }


    /**
     * Gets the distance value for this ZIPCodeWithinRadius.
     * 
     * @return distance
     */
    public java.lang.String getDistance() {
        return distance;
    }


    /**
     * Sets the distance value for this ZIPCodeWithinRadius.
     * 
     * @param distance
     */
    public void setDistance(java.lang.String distance) {
        this.distance = distance;
    }


    /**
     * Gets the errorMessage value for this ZIPCodeWithinRadius.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this ZIPCodeWithinRadius.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZIPCodeWithinRadius)) return false;
        ZIPCodeWithinRadius other = (ZIPCodeWithinRadius) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZIPCode==null && other.getZIPCode()==null) || 
             (this.ZIPCode!=null &&
              this.ZIPCode.equals(other.getZIPCode()))) &&
            ((this.distance==null && other.getDistance()==null) || 
             (this.distance!=null &&
              this.distance.equals(other.getDistance()))) &&
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
        if (getZIPCode() != null) {
            _hashCode += getZIPCode().hashCode();
        }
        if (getDistance() != null) {
            _hashCode += getDistance().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZIPCodeWithinRadius.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "ZIPCodeWithinRadius"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZIPCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "ZIPCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "Distance"));
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
