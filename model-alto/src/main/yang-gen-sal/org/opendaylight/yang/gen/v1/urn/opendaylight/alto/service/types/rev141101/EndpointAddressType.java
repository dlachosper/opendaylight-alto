package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import java.util.Arrays;


/**
 * The union built-in type represents a value that corresponds to one of its member types.
 */
public class EndpointAddressType
 implements Serializable {
    private static final long serialVersionUID = 4002087466838525286L; 
    /**
     * The enumeration built-in type represents values from a set of assigned names.
     */
    public enum Enumeration {
        Ipv4(0),
        
        Ipv6(1)
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
    final private Enumeration _enumeration;
    final private char[] _value;
    
    public EndpointAddressType(Enumeration _enumeration) {
        super();
        this._enumeration = _enumeration;
        this._value = _enumeration.toString().toCharArray();
    }
    
    /**
     * Constructor provided only for using in JMX. Don't use it for
     * construction new object of this union type. 
     */
    @ConstructorProperties("value")
    public EndpointAddressType(char[] _value) {
        java.lang.String defVal = new java.lang.String(_value);
        EndpointAddressType defInst = EndpointAddressTypeBuilder.getDefaultInstance(defVal);
        this._enumeration = defInst._enumeration;
        this._value = _value;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public EndpointAddressType(EndpointAddressType source) {
        this._enumeration = source._enumeration;
        this._value = source._value;
    }


    public Enumeration getEnumeration() {
        return _enumeration;
    }
    
    public char[] getValue() {
        return _value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_enumeration == null) ? 0 : _enumeration.hashCode());
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
        EndpointAddressType other = (EndpointAddressType) obj;
        if (_enumeration == null) {
            if (other._enumeration != null) {
                return false;
            }
        } else if(!_enumeration.equals(other._enumeration)) {
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
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointAddressType.class.getSimpleName()).append(" [");
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
