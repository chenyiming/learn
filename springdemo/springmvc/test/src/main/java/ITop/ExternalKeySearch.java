/**
 * ExternalKeySearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ITop;

public class ExternalKeySearch  implements java.io.Serializable {
    private ITop.SearchCondition[] conditions;

    public ExternalKeySearch() {
    }

    public ExternalKeySearch(
           ITop.SearchCondition[] conditions) {
           this.conditions = conditions;
    }


    /**
     * Gets the conditions value for this ExternalKeySearch.
     * 
     * @return conditions
     */
    public ITop.SearchCondition[] getConditions() {
        return conditions;
    }


    /**
     * Sets the conditions value for this ExternalKeySearch.
     * 
     * @param conditions
     */
    public void setConditions(ITop.SearchCondition[] conditions) {
        this.conditions = conditions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExternalKeySearch)) return false;
        ExternalKeySearch other = (ExternalKeySearch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.conditions==null && other.getConditions()==null) || 
             (this.conditions!=null &&
              java.util.Arrays.equals(this.conditions, other.getConditions())));
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
        if (getConditions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConditions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConditions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExternalKeySearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ITop", "ExternalKeySearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ITop", "SearchCondition"));
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
