package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.TypedEndpointAddress;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties;


public class EndpointPropertiesKey
 implements Identifier<EndpointProperties> {
    private static final long serialVersionUID = -2747872193500109666L; 
    final private TypedEndpointAddress _endpoint;
    
    public EndpointPropertiesKey(TypedEndpointAddress _endpoint) {
        this._endpoint = _endpoint;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public EndpointPropertiesKey(EndpointPropertiesKey source) {
        this._endpoint = source._endpoint;
    }


    public TypedEndpointAddress getEndpoint() {
        return _endpoint;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_endpoint == null) ? 0 : _endpoint.hashCode());
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
        EndpointPropertiesKey other = (EndpointPropertiesKey) obj;
        if (_endpoint == null) {
            if (other._endpoint != null) {
                return false;
            }
        } else if(!_endpoint.equals(other._endpoint)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointPropertiesKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_endpoint != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_endpoint=");
            builder.append(_endpoint);
         }
        return builder.append(']').toString();
    }



}
