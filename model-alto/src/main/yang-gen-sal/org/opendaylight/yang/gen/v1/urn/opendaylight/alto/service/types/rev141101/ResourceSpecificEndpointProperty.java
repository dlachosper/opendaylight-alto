package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import com.google.common.collect.Range;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.io.Serializable;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import java.beans.ConstructorProperties;
import java.util.Arrays;


/**
 * Resource-specific endpoint property.
 */
public class ResourceSpecificEndpointProperty
 implements Serializable {
    private static final long serialVersionUID = -8399244339933408931L; 
    private static final List<Pattern> patterns = new ArrayList<Pattern>();
    public static final List<String> PATTERN_CONSTANTS = Arrays.asList("^(priv:)?[\\w\\-:@\\.]+\\.[\\w\\-:_]+$");
    
    static {
        for (String regEx : PATTERN_CONSTANTS) {
            patterns.add(Pattern.compile(regEx));
        }
    }
    private static final List<Range<BigInteger>> _length;
    final private java.lang.String _value;
    
    static {
        ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
        builder.add(Range.closed(BigInteger.valueOf(3L), BigInteger.valueOf(97L)));
        _length = builder.build();
    }
    
    @ConstructorProperties("value")
    public ResourceSpecificEndpointProperty(java.lang.String _value) {
        if (_value != null) {
            BigInteger _constraint = BigInteger.valueOf(_value.length());
            boolean isValidLength = false;
            for (Range<BigInteger> r : length()) {
                if (r.contains(_constraint)) {
                    isValidLength = true;
                }
            }
            if (!isValidLength) {
                throw new IllegalArgumentException(String.format("Invalid length: %s, expected: %s.", _value, length()));
            }
        }
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ResourceSpecificEndpointProperty(ResourceSpecificEndpointProperty source) {
        this._value = source._value;
    }

    public static ResourceSpecificEndpointProperty getDefaultInstance(String defaultValue) {
        return new ResourceSpecificEndpointProperty(defaultValue);
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
        ResourceSpecificEndpointProperty other = (ResourceSpecificEndpointProperty) obj;
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
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ResourceSpecificEndpointProperty.class.getSimpleName()).append(" [");
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

    public static List<Range<BigInteger>> length() {
        return _length;
    }


}
