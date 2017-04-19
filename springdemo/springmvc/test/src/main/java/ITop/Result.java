/**
 * Result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ITop;

public class Result  implements java.io.Serializable {
    private boolean status;

    private ITop.ResultMessage[] result;

    private ITop.ResultLog errors;

    private ITop.ResultLog warnings;

    private ITop.ResultLog infos;

    public Result() {
    }

    public Result(
           boolean status,
           ITop.ResultMessage[] result,
           ITop.ResultLog errors,
           ITop.ResultLog warnings,
           ITop.ResultLog infos) {
           this.status = status;
           this.result = result;
           this.errors = errors;
           this.warnings = warnings;
           this.infos = infos;
    }


    /**
     * Gets the status value for this Result.
     * 
     * @return status
     */
    public boolean isStatus() {
        return status;
    }


    /**
     * Sets the status value for this Result.
     * 
     * @param status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }


    /**
     * Gets the result value for this Result.
     * 
     * @return result
     */
    public ITop.ResultMessage[] getResult() {
        return result;
    }


    /**
     * Sets the result value for this Result.
     * 
     * @param result
     */
    public void setResult(ITop.ResultMessage[] result) {
        this.result = result;
    }


    /**
     * Gets the errors value for this Result.
     * 
     * @return errors
     */
    public ITop.ResultLog getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this Result.
     * 
     * @param errors
     */
    public void setErrors(ITop.ResultLog errors) {
        this.errors = errors;
    }


    /**
     * Gets the warnings value for this Result.
     * 
     * @return warnings
     */
    public ITop.ResultLog getWarnings() {
        return warnings;
    }


    /**
     * Sets the warnings value for this Result.
     * 
     * @param warnings
     */
    public void setWarnings(ITop.ResultLog warnings) {
        this.warnings = warnings;
    }


    /**
     * Gets the infos value for this Result.
     * 
     * @return infos
     */
    public ITop.ResultLog getInfos() {
        return infos;
    }


    /**
     * Sets the infos value for this Result.
     * 
     * @param infos
     */
    public void setInfos(ITop.ResultLog infos) {
        this.infos = infos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Result)) return false;
        Result other = (Result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.status == other.isStatus() &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              java.util.Arrays.equals(this.result, other.getResult()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              this.errors.equals(other.getErrors()))) &&
            ((this.warnings==null && other.getWarnings()==null) || 
             (this.warnings!=null &&
              this.warnings.equals(other.getWarnings()))) &&
            ((this.infos==null && other.getInfos()==null) || 
             (this.infos!=null &&
              this.infos.equals(other.getInfos())));
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
        _hashCode += (isStatus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrors() != null) {
            _hashCode += getErrors().hashCode();
        }
        if (getWarnings() != null) {
            _hashCode += getWarnings().hashCode();
        }
        if (getInfos() != null) {
            _hashCode += getInfos().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ITop", "Result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ITop", "ResultMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ITop", "ResultLog"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warnings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "warnings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ITop", "ResultLog"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infos"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ITop", "ResultLog"));
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
