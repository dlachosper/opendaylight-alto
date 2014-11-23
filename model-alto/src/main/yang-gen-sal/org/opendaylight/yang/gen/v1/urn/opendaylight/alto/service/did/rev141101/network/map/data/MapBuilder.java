package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.PidName;
import java.util.Collections;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.MapKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map
 */
public class MapBuilder {

    private List<EndpointAddressGroup> _endpointAddressGroup;
    private MapKey _key;
    private PidName _pid;

    java.util.Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map>> augmentation = new HashMap<>();

    public MapBuilder() {
    } 
    
    public MapBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointAddressGroup arg) {
        this._endpointAddressGroup = arg.getEndpointAddressGroup();
    }

    public MapBuilder(Map base) {
        if (base.getKey() == null) {
            this._key = new MapKey(
                base.getPid()
            );
            this._pid = base.getPid();
        } else {
            this._key = base.getKey();
            this._pid = _key.getPid();
        }
        this._endpointAddressGroup = base.getEndpointAddressGroup();
        if (base instanceof MapImpl) {
            MapImpl _impl = (MapImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointAddressGroup</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointAddressGroup) {
            this._endpointAddressGroup = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointAddressGroup)arg).getEndpointAddressGroup();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointAddressGroup] \n" +
              "but was: " + arg
            );
        }
    }

    public List<EndpointAddressGroup> getEndpointAddressGroup() {
        return _endpointAddressGroup;
    }
    
    public MapKey getKey() {
        return _key;
    }
    
    public PidName getPid() {
        return _pid;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MapBuilder setEndpointAddressGroup(List<EndpointAddressGroup> value) {
        this._endpointAddressGroup = value;
        return this;
    }
    
    public MapBuilder setKey(MapKey value) {
        this._key = value;
        return this;
    }
    
    public MapBuilder setPid(PidName value) {
        this._pid = value;
        return this;
    }
    
    public MapBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Map build() {
        return new MapImpl(this);
    }

    private static final class MapImpl implements Map {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map.class;
        }

        private final List<EndpointAddressGroup> _endpointAddressGroup;
        private final MapKey _key;
        private final PidName _pid;

        private java.util.Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map>> augmentation = new HashMap<>();

        private MapImpl(MapBuilder base) {
            if (base.getKey() == null) {
                this._key = new MapKey(
                    base.getPid()
                );
                this._pid = base.getPid();
            } else {
                this._key = base.getKey();
                this._pid = _key.getPid();
            }
            this._endpointAddressGroup = base.getEndpointAddressGroup();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final java.util.Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<EndpointAddressGroup> getEndpointAddressGroup() {
            return _endpointAddressGroup;
        }
        
        @Override
        public MapKey getKey() {
            return _key;
        }
        
        @Override
        public PidName getPid() {
            return _pid;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_endpointAddressGroup == null) ? 0 : _endpointAddressGroup.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_pid == null) ? 0 : _pid.hashCode());
            result = prime * result + ((augmentation == null) ? 0 : augmentation.hashCode());
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map)obj;
            if (_endpointAddressGroup == null) {
                if (other.getEndpointAddressGroup() != null) {
                    return false;
                }
            } else if(!_endpointAddressGroup.equals(other.getEndpointAddressGroup())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_pid == null) {
                if (other.getPid() != null) {
                    return false;
                }
            } else if(!_pid.equals(other.getPid())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MapImpl otherImpl = (MapImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (java.util.Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Map [");
            boolean first = true;
        
            if (_endpointAddressGroup != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_endpointAddressGroup=");
                builder.append(_endpointAddressGroup);
             }
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (_pid != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_pid=");
                builder.append(_pid);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
