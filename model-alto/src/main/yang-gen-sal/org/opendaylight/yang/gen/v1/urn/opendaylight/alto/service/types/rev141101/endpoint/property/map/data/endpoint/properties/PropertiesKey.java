package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyType;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties;


public class PropertiesKey
 implements Identifier<Properties> {
    private static final long serialVersionUID = -2476908473679940850L; 
    final private EndpointPropertyType _propertyType;
    
    public PropertiesKey(EndpointPropertyType _propertyType) {
        this._propertyType = _propertyType;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PropertiesKey(PropertiesKey source) {
        this._propertyType = source._propertyType;
    }


    public EndpointPropertyType getPropertyType() {
        return _propertyType;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_propertyType == null) ? 0 : _propertyType.hashCode());
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
        PropertiesKey other = (PropertiesKey) obj;
        if (_propertyType == null) {
            if (other._propertyType != null) {
                return false;
            }
        } else if(!_propertyType.equals(other._propertyType)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.PropertiesKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_propertyType != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_propertyType=");
            builder.append(_propertyType);
         }
        return builder.append(']').toString();
    }



}
