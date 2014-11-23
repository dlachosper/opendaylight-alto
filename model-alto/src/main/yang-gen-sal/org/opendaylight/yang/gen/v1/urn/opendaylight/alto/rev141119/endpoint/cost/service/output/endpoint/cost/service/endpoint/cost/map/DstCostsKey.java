package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.endpoint.cost.map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.TypedEndpointAddress;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.endpoint.cost.map.DstCosts;


public class DstCostsKey
 implements Identifier<DstCosts> {
    private static final long serialVersionUID = 1578573458205226946L; 
    final private TypedEndpointAddress _dst;
    
    public DstCostsKey(TypedEndpointAddress _dst) {
        this._dst = _dst;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public DstCostsKey(DstCostsKey source) {
        this._dst = source._dst;
    }


    public TypedEndpointAddress getDst() {
        return _dst;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_dst == null) ? 0 : _dst.hashCode());
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
        DstCostsKey other = (DstCostsKey) obj;
        if (_dst == null) {
            if (other._dst != null) {
                return false;
            }
        } else if(!_dst.equals(other._dst)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.endpoint.cost.map.DstCostsKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_dst != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_dst=");
            builder.append(_dst);
         }
        return builder.append(']').toString();
    }



}
