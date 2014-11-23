package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.List;
import java.beans.ConstructorProperties;
import java.util.Arrays;


public class TypedIpv4Address
 implements Serializable {
    private static final long serialVersionUID = 3764548915722019212L; 
    private static final List<Pattern> patterns = new ArrayList<Pattern>();
    public static final List<String> PATTERN_CONSTANTS = Arrays.asList("^ipv4:(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(%[\\p{N}\\p{L}]+)?$");
    
    static {
        for (String regEx : PATTERN_CONSTANTS) {
            patterns.add(Pattern.compile(regEx));
        }
    }
    final private java.lang.String _value;
    
    @ConstructorProperties("value")
    public TypedIpv4Address(java.lang.String _value) {
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TypedIpv4Address(TypedIpv4Address source) {
        this._value = source._value;
    }

    public static TypedIpv4Address getDefaultInstance(String defaultValue) {
        return new TypedIpv4Address(defaultValue);
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
        TypedIpv4Address other = (TypedIpv4Address) obj;
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
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.TypedIpv4Address.class.getSimpleName()).append(" [");
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
