package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointAddressType;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpPrefix;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroupKey;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup
 */
public class EndpointAddressGroupBuilder {

    private EndpointAddressType _addressType;
    private List<IpPrefix> _endpointPrefix;
    private EndpointAddressGroupKey _key;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup>> augmentation = new HashMap<>();

    public EndpointAddressGroupBuilder() {
    } 

    public EndpointAddressGroupBuilder(EndpointAddressGroup base) {
        if (base.getKey() == null) {
            this._key = new EndpointAddressGroupKey(
                base.getAddressType()
            );
            this._addressType = base.getAddressType();
        } else {
            this._key = base.getKey();
            this._addressType = _key.getAddressType();
        }
        this._endpointPrefix = base.getEndpointPrefix();
        if (base instanceof EndpointAddressGroupImpl) {
            EndpointAddressGroupImpl _impl = (EndpointAddressGroupImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public EndpointAddressType getAddressType() {
        return _addressType;
    }
    
    public List<IpPrefix> getEndpointPrefix() {
        return _endpointPrefix;
    }
    
    public EndpointAddressGroupKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public EndpointAddressGroupBuilder setAddressType(EndpointAddressType value) {
        this._addressType = value;
        return this;
    }
    
    public EndpointAddressGroupBuilder setEndpointPrefix(List<IpPrefix> value) {
        this._endpointPrefix = value;
        return this;
    }
    
    public EndpointAddressGroupBuilder setKey(EndpointAddressGroupKey value) {
        this._key = value;
        return this;
    }
    
    public EndpointAddressGroupBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public EndpointAddressGroup build() {
        return new EndpointAddressGroupImpl(this);
    }

    private static final class EndpointAddressGroupImpl implements EndpointAddressGroup {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup.class;
        }

        private final EndpointAddressType _addressType;
        private final List<IpPrefix> _endpointPrefix;
        private final EndpointAddressGroupKey _key;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup>> augmentation = new HashMap<>();

        private EndpointAddressGroupImpl(EndpointAddressGroupBuilder base) {
            if (base.getKey() == null) {
                this._key = new EndpointAddressGroupKey(
                    base.getAddressType()
                );
                this._addressType = base.getAddressType();
            } else {
                this._key = base.getKey();
                this._addressType = _key.getAddressType();
            }
            this._endpointPrefix = base.getEndpointPrefix();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public EndpointAddressType getAddressType() {
            return _addressType;
        }
        
        @Override
        public List<IpPrefix> getEndpointPrefix() {
            return _endpointPrefix;
        }
        
        @Override
        public EndpointAddressGroupKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_addressType == null) ? 0 : _addressType.hashCode());
            result = prime * result + ((_endpointPrefix == null) ? 0 : _endpointPrefix.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup)obj;
            if (_addressType == null) {
                if (other.getAddressType() != null) {
                    return false;
                }
            } else if(!_addressType.equals(other.getAddressType())) {
                return false;
            }
            if (_endpointPrefix == null) {
                if (other.getEndpointPrefix() != null) {
                    return false;
                }
            } else if(!_endpointPrefix.equals(other.getEndpointPrefix())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EndpointAddressGroupImpl otherImpl = (EndpointAddressGroupImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("EndpointAddressGroup [");
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
            if (_endpointPrefix != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_endpointPrefix=");
                builder.append(_endpointPrefix);
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
