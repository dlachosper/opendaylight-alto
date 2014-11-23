package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.List;
import java.beans.ConstructorProperties;
import java.util.Arrays;


/**
 * The union built-in type represents a value that corresponds to one of its member types.
 */
public class GlobalEndpointProperty
 implements Serializable {
    private static final long serialVersionUID = 8351670749968733155L; 
    /**
     * The enumeration built-in type represents values from a set of assigned names.
     */
    public enum Enumeration {
        /**
         * PID property.
         */
        Pid(0)
        ;
    
    
        int value;
        static java.util.Map<java.lang.Integer, Enumeration> valueMap;
    
        static {
            valueMap = new java.util.HashMap<>();
            for (Enumeration enumItem : Enumeration.values())
            {
                valueMap.put(enumItem.value, enumItem);
            }
        }
    
        private Enumeration(int value) {
            this.value = value;
        }
        
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg
         * @return corresponding Enumeration item
         */
        public static Enumeration forValue(int valueArg) {
            return valueMap.get(valueArg);
        }
    }
    private static final List<Pattern> patterns = new ArrayList<Pattern>();
    public static final List<String> PATTERN_CONSTANTS = Arrays.asList("^priv:[\\w\\-:@]+$");
    
    static {
        for (String regEx : PATTERN_CONSTANTS) {
            patterns.add(Pattern.compile(regEx));
        }
    }
    final private Enumeration _enumeration;
    final private java.lang.String _string;
    final private char[] _value;
    
    public GlobalEndpointProperty(Enumeration _enumeration) {
        super();
        this._enumeration = _enumeration;
        this._string = null;
        this._value = _enumeration.toString().toCharArray();
    }
    
    public GlobalEndpointProperty(java.lang.String _string) {
        super();
        this._string = _string;
        this._enumeration = null;
        this._value = _string.toCharArray();
    }
    
    /**
     * Constructor provided only for using in JMX. Don't use it for
     * construction new object of this union type. 
     */
    @ConstructorProperties("value")
    public GlobalEndpointProperty(char[] _value) {
        java.lang.String defVal = new java.lang.String(_value);
        GlobalEndpointProperty defInst = GlobalEndpointPropertyBuilder.getDefaultInstance(defVal);
        this._enumeration = defInst._enumeration;
        this._string = defInst._string;
        this._value = _value;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public GlobalEndpointProperty(GlobalEndpointProperty source) {
        this._enumeration = source._enumeration;
        this._string = source._string;
        this._value = source._value;
    }


    public Enumeration getEnumeration() {
        return _enumeration;
    }
    
    public java.lang.String getString() {
        return _string;
    }
    
    public char[] getValue() {
        return _value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_enumeration == null) ? 0 : _enumeration.hashCode());
        result = prime * result + ((_string == null) ? 0 : _string.hashCode());
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
        GlobalEndpointProperty other = (GlobalEndpointProperty) obj;
        if (_enumeration == null) {
            if (other._enumeration != null) {
                return false;
            }
        } else if(!_enumeration.equals(other._enumeration)) {
            return false;
        }
        if (_string == null) {
            if (other._string != null) {
                return false;
            }
        } else if(!_string.equals(other._string)) {
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
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.GlobalEndpointProperty.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_enumeration != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_enumeration=");
            builder.append(_enumeration);
         }
        if (_string != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_string=");
            builder.append(_string);
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
