package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointAddressType;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup;


public class EndpointAddressGroupKey
 implements Identifier<EndpointAddressGroup> {
    private static final long serialVersionUID = 6019283632544926499L; 
    final private EndpointAddressType _addressType;
    
    public EndpointAddressGroupKey(EndpointAddressType _addressType) {
        this._addressType = _addressType;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public EndpointAddressGroupKey(EndpointAddressGroupKey source) {
        this._addressType = source._addressType;
    }


    public EndpointAddressType getAddressType() {
        return _addressType;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_addressType == null) ? 0 : _addressType.hashCode());
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
        EndpointAddressGroupKey other = (EndpointAddressGroupKey) obj;
        if (_addressType == null) {
            if (other._addressType != null) {
                return false;
            }
        } else if(!_addressType.equals(other._addressType)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroupKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_addressType != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_addressType=");
            builder.append(_addressType);
         }
        return builder.append(']').toString();
    }



}
