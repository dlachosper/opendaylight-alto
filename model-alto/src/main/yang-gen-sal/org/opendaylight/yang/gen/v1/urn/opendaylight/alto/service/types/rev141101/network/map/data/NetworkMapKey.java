package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.data;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.data.NetworkMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.PidName;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class NetworkMapKey
 implements Identifier<NetworkMap> {
    private static final long serialVersionUID = -6876339423481588594L; 
    final private PidName _pid;
    
    public NetworkMapKey(PidName _pid) {
        this._pid = _pid;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NetworkMapKey(NetworkMapKey source) {
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
        NetworkMapKey other = (NetworkMapKey) obj;
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
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.data.NetworkMapKey.class.getSimpleName()).append(" [");
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
