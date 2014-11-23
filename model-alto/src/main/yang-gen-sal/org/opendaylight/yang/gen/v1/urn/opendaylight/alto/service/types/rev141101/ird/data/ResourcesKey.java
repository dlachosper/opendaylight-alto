package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ResourceId;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources;


public class ResourcesKey
 implements Identifier<Resources> {
    private static final long serialVersionUID = 4396146728694197146L; 
    final private ResourceId _resourceId;
    
    public ResourcesKey(ResourceId _resourceId) {
        this._resourceId = _resourceId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ResourcesKey(ResourcesKey source) {
        this._resourceId = source._resourceId;
    }


    public ResourceId getResourceId() {
        return _resourceId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_resourceId == null) ? 0 : _resourceId.hashCode());
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
        ResourcesKey other = (ResourcesKey) obj;
        if (_resourceId == null) {
            if (other._resourceId != null) {
                return false;
            }
        } else if(!_resourceId.equals(other._resourceId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.ResourcesKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_resourceId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_resourceId=");
            builder.append(_resourceId);
         }
        return builder.append(']').toString();
    }



}
