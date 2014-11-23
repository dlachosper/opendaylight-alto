package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ResourceSpecificEndpointProperty;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.GlobalEndpointProperty;
import java.util.Arrays;


/**
 * The union built-in type represents a value that corresponds to one of its member types.
 */
public class EndpointPropertyType
 implements Serializable {
    private static final long serialVersionUID = 4406882547732619442L; 
    final private ResourceSpecificEndpointProperty _resourceSpecificEndpointProperty;
    final private GlobalEndpointProperty _globalEndpointProperty;
    final private char[] _value;
    
    public EndpointPropertyType(ResourceSpecificEndpointProperty _resourceSpecificEndpointProperty) {
        super();
        this._resourceSpecificEndpointProperty = _resourceSpecificEndpointProperty;
        this._globalEndpointProperty = null;
        this._value = _resourceSpecificEndpointProperty.getValue().toString().toCharArray();
    }
    
    public EndpointPropertyType(GlobalEndpointProperty _globalEndpointProperty) {
        super();
        this._globalEndpointProperty = _globalEndpointProperty;
        this._resourceSpecificEndpointProperty = null;
        this._value = _globalEndpointProperty.getValue();
                                    }
    
    /**
     * Constructor provided only for using in JMX. Don't use it for
     * construction new object of this union type. 
     */
    @ConstructorProperties("value")
    public EndpointPropertyType(char[] _value) {
        java.lang.String defVal = new java.lang.String(_value);
        EndpointPropertyType defInst = EndpointPropertyTypeBuilder.getDefaultInstance(defVal);
        this._resourceSpecificEndpointProperty = defInst._resourceSpecificEndpointProperty;
        this._globalEndpointProperty = defInst._globalEndpointProperty;
        this._value = _value;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public EndpointPropertyType(EndpointPropertyType source) {
        this._resourceSpecificEndpointProperty = source._resourceSpecificEndpointProperty;
        this._globalEndpointProperty = source._globalEndpointProperty;
        this._value = source._value;
    }


    public ResourceSpecificEndpointProperty getResourceSpecificEndpointProperty() {
        return _resourceSpecificEndpointProperty;
    }
    
    public GlobalEndpointProperty getGlobalEndpointProperty() {
        return _globalEndpointProperty;
    }
    
    public char[] getValue() {
        return _value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_resourceSpecificEndpointProperty == null) ? 0 : _resourceSpecificEndpointProperty.hashCode());
        result = prime * result + ((_globalEndpointProperty == null) ? 0 : _globalEndpointProperty.hashCode());
        result = prime * result + ((_value == null) ? 0 : Arrays.hashCode(_value));
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
        EndpointPropertyType other = (EndpointPropertyType) obj;
        if (_resourceSpecificEndpointProperty == null) {
            if (other._resourceSpecificEndpointProperty != null) {
                return false;
            }
        } else if(!_resourceSpecificEndpointProperty.equals(other._resourceSpecificEndpointProperty)) {
            return false;
        }
        if (_globalEndpointProperty == null) {
            if (other._globalEndpointProperty != null) {
                return false;
            }
        } else if(!_globalEndpointProperty.equals(other._globalEndpointProperty)) {
            return false;
        }
        if (_value == null) {
            if (other._value != null) {
                return false;
            }
        } else if(!Arrays.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyType.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_resourceSpecificEndpointProperty != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_resourceSpecificEndpointProperty=");
            builder.append(_resourceSpecificEndpointProperty);
         }
        if (_globalEndpointProperty != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_globalEndpointProperty=");
            builder.append(_globalEndpointProperty);
         }
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(Arrays.toString(_value));
         }
        return builder.append(']').toString();
    }



}
