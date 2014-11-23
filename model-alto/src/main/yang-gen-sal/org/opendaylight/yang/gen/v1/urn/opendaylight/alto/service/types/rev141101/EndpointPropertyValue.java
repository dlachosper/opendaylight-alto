package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import java.io.Serializable;
import java.beans.ConstructorProperties;


/**
 * Endpoint property (value).
 */
public class EndpointPropertyValue
 implements Serializable {
    private static final long serialVersionUID = -3876418796884228004L; 
    final private java.lang.String _value;
    
    @ConstructorProperties("value")
    public EndpointPropertyValue(java.lang.String _value) {
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public EndpointPropertyValue(EndpointPropertyValue source) {
        this._value = source._value;
    }

    public static EndpointPropertyValue getDefaultInstance(String defaultValue) {
        return new EndpointPropertyValue(defaultValue);
    }

    public java.lang.String getValue() {
        return _value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_value == null) ? 0 : _value.hashCode());
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        EndpointPropertyValue other = (EndpointPropertyValue) obj;
        if (_value == null) {
            if (other._value != null) {
                return false;
            }
        } else if(!_value.equals(other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyValue.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(_value);
         }
        return builder.append(']').toString();
    }



}
