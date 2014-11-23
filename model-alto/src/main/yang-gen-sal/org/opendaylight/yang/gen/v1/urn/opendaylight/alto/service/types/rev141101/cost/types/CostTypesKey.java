package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.types;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.types.CostTypes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostTypeName;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class CostTypesKey
 implements Identifier<CostTypes> {
    private static final long serialVersionUID = 1800017504370003406L; 
    final private CostTypeName _costTypeName;
    
    public CostTypesKey(CostTypeName _costTypeName) {
        this._costTypeName = _costTypeName;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public CostTypesKey(CostTypesKey source) {
        this._costTypeName = source._costTypeName;
    }


    public CostTypeName getCostTypeName() {
        return _costTypeName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_costTypeName == null) ? 0 : _costTypeName.hashCode());
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
        CostTypesKey other = (CostTypesKey) obj;
        if (_costTypeName == null) {
            if (other._costTypeName != null) {
                return false;
            }
        } else if(!_costTypeName.equals(other._costTypeName)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.types.CostTypesKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_costTypeName != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_costTypeName=");
            builder.append(_costTypeName);
         }
        return builder.append(']').toString();
    }



}
