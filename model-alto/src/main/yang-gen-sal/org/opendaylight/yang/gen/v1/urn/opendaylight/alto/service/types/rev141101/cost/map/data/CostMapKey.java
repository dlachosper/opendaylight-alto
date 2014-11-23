package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.PidName;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class CostMapKey
 implements Identifier<CostMap> {
    private static final long serialVersionUID = -1899306641787097618L; 
    final private PidName _src;
    
    public CostMapKey(PidName _src) {
        this._src = _src;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public CostMapKey(CostMapKey source) {
        this._src = source._src;
    }


    public PidName getSrc() {
        return _src;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_src == null) ? 0 : _src.hashCode());
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
        CostMapKey other = (CostMapKey) obj;
        if (_src == null) {
            if (other._src != null) {
                return false;
            }
        } else if(!_src.equals(other._src)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMapKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_src != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_src=");
            builder.append(_src);
         }
        return builder.append(']').toString();
    }



}
