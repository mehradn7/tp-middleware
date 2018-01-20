/**
 * ZIPCodeDistance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.malaikaconsultants.ZipCodeWebService;

public class ZIPCodeDistance  implements java.io.Serializable {
    private java.lang.String ZIPCode1;

    private java.lang.String ZIPCode2;

    private java.lang.String distance;

    private java.lang.String errorMessage;

    public ZIPCodeDistance() {
    }

    public ZIPCodeDistance(
           java.lang.String ZIPCode1,
           java.lang.String ZIPCode2,
           java.lang.String distance,
           java.lang.String errorMessage) {
           this.ZIPCode1 = ZIPCode1;
           this.ZIPCode2 = ZIPCode2;
           this.distance = distance;
           this.errorMessage = errorMessage;
    }


    /**
     * Gets the ZIPCode1 value for this ZIPCodeDistance.
     * 
     * @return ZIPCode1
     */
    public java.lang.String getZIPCode1() {
        return ZIPCode1;
    }


    /**
     * Sets the ZIPCode1 value for this ZIPCodeDistance.
     * 
     * @param ZIPCode1
     */
    public void setZIPCode1(java.lang.String ZIPCode1) {
        this.ZIPCode1 = ZIPCode1;
    }


    /**
     * Gets the ZIPCode2 value for this ZIPCodeDistance.
     * 
     * @return ZIPCode2
     */
    public java.lang.String getZIPCode2() {
        return ZIPCode2;
    }


    /**
     * Sets the ZIPCode2 value for this ZIPCodeDistance.
     * 
     * @param ZIPCode2
     */
    public void setZIPCode2(java.lang.String ZIPCode2) {
        this.ZIPCode2 = ZIPCode2;
    }


    /**
     * Gets the distance value for this ZIPCodeDistance.
     * 
     * @return distance
     */
    public java.lang.String getDistance() {
        return distance;
    }


    /**
     * Sets the distance value for this ZIPCodeDistance.
     * 
     * @param distance
     */
    public void setDistance(java.lang.String distance) {
        this.distance = distance;
    }


    /**
     * Gets the errorMessage value for this ZIPCodeDistance.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this ZIPCodeDistance.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZIPCodeDistance)) return false;
        ZIPCodeDistance other = (ZIPCodeDistance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZIPCode1==null && other.getZIPCode1()==null) || 
             (this.ZIPCode1!=null &&
              this.ZIPCode1.equals(other.getZIPCode1()))) &&
            ((this.ZIPCode2==null && other.getZIPCode2()==null) || 
             (this.ZIPCode2!=null &&
              this.ZIPCode2.equals(other.getZIPCode2()))) &&
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
        if (getZIPCode1() != null) {
            _hashCode += getZIPCode1().hashCode();
        }
        if (getZIPCode2() != null) {
            _hashCode += getZIPCode2().hashCode();
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
        new org.apache.axis.description.TypeDesc(ZIPCodeDistance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "ZIPCodeDistance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZIPCode1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "ZIPCode1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZIPCode2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://malaikaconsultants.com/ZipCodeWebService/", "ZIPCode2"));
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
