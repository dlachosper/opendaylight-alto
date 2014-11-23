package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.PidName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class MapKey
 implements Identifier<Map> {
    private static final long serialVersionUID = 666787817821993346L; 
    final private PidName _pid;
    
    public MapKey(PidName _pid) {
        this._pid = _pid;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MapKey(MapKey source) {
        this._pid = source._pid;
    }


    public PidName getPid() {
        return _pid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_pid == null) ? 0 : _pid.hashCode());
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
        MapKey other = (MapKey) obj;
        if (_pid == null) {
            if (other._pid != null) {
                return false;
            }
        } else if(!_pid.equals(other._pid)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.MapKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_pid != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_pid=");
            builder.append(_pid);
         }
        return builder.append(']').toString();
    }



}
