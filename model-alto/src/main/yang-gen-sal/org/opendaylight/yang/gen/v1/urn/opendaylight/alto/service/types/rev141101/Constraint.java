package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.List;
import java.beans.ConstructorProperties;
import java.util.Arrays;


/**
 * RFC7285 Sec. 11.3.2.3. The second part must be in thesame unit as cost-metric, IEEE 754 2008 floating point.
 */
public class Constraint
 implements Serializable {
    private static final long serialVersionUID = 4760368416520029342L; 
    private static final List<Pattern> patterns = new ArrayList<Pattern>();
    public static final List<String> PATTERN_CONSTANTS = Arrays.asList("^(gt|ge|lt|le|eq) [0-9]+$");
    
    static {
        for (String regEx : PATTERN_CONSTANTS) {
            patterns.add(Pattern.compile(regEx));
        }
    }
    final private java.lang.String _value;
    
    @ConstructorProperties("value")
    public Constraint(java.lang.String _value) {
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Constraint(Constraint source) {
        this._value = source._value;
    }

    public static Constraint getDefaultInstance(String defaultValue) {
        return new Constraint(defaultValue);
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
        Constraint other = (Constraint) obj;
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
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Constraint.class.getSimpleName()).append(" [");
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
