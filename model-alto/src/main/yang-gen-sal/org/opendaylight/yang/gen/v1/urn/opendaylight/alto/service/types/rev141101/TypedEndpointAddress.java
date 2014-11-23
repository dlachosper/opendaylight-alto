package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.TypedIpv6Address;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.TypedIpv4Address;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import java.util.Arrays;


/**
 * The union built-in type represents a value that corresponds to one of its member types.
 */
public class TypedEndpointAddress
 implements Serializable {
    private static final long serialVersionUID = 5394844565928898208L; 
    final private TypedIpv4Address _typedIpv4Address;
    final private TypedIpv6Address _typedIpv6Address;
    final private char[] _value;
    
    public TypedEndpointAddress(TypedIpv4Address _typedIpv4Address) {
        super();
        this._typedIpv4Address = _typedIpv4Address;
        this._typedIpv6Address = null;
        this._value = _typedIpv4Address.getValue().toString().toCharArray();
    }
    
    public TypedEndpointAddress(TypedIpv6Address _typedIpv6Address) {
        super();
        this._typedIpv6Address = _typedIpv6Address;
        this._typedIpv4Address = null;
        this._value = _typedIpv6Address.getValue().toString().toCharArray();
    }
    
    /**
     * Constructor provided only for using in JMX. Don't use it for
     * construction new object of this union type. 
     */
    @ConstructorProperties("value")
    public TypedEndpointAddress(char[] _value) {
        java.lang.String defVal = new java.lang.String(_value);
        TypedEndpointAddress defInst = TypedEndpointAddressBuilder.getDefaultInstance(defVal);
        this._typedIpv4Address = defInst._typedIpv4Address;
        this._typedIpv6Address = defInst._typedIpv6Address;
        this._value = _value;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TypedEndpointAddress(TypedEndpointAddress source) {
        this._typedIpv4Address = source._typedIpv4Address;
        this._typedIpv6Address = source._typedIpv6Address;
        this._value = source._value;
    }


    public TypedIpv4Address getTypedIpv4Address() {
        return _typedIpv4Address;
    }
    
    public TypedIpv6Address getTypedIpv6Address() {
        return _typedIpv6Address;
    }
    
    public char[] getValue() {
        return _value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_typedIpv4Address == null) ? 0 : _typedIpv4Address.hashCode());
        result = prime * result + ((_typedIpv6Address == null) ? 0 : _typedIpv6Address.hashCode());
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
        TypedEndpointAddress other = (TypedEndpointAddress) obj;
        if (_typedIpv4Address == null) {
            if (other._typedIpv4Address != null) {
                return false;
            }
        } else if(!_typedIpv4Address.equals(other._typedIpv4Address)) {
            return false;
        }
        if (_typedIpv6Address == null) {
            if (other._typedIpv6Address != null) {
                return false;
            }
        } else if(!_typedIpv6Address.equals(other._typedIpv6Address)) {
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
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.TypedEndpointAddress.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_typedIpv4Address != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_typedIpv4Address=");
            builder.append(_typedIpv4Address);
         }
        if (_typedIpv6Address != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_typedIpv6Address=");
            builder.append(_typedIpv6Address);
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
