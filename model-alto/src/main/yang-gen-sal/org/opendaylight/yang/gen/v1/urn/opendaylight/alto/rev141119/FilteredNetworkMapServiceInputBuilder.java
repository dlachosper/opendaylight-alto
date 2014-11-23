package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointAddressType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.PidName;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ResourceId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput
 */
public class FilteredNetworkMapServiceInputBuilder {

    private List<EndpointAddressType> _addressTypes;
    private List<PidName> _pids;
    private ResourceId _resourceId;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput>> augmentation = new HashMap<>();

    public FilteredNetworkMapServiceInputBuilder() {
    } 

    public FilteredNetworkMapServiceInputBuilder(FilteredNetworkMapServiceInput base) {
        this._addressTypes = base.getAddressTypes();
        this._pids = base.getPids();
        this._resourceId = base.getResourceId();
        if (base instanceof FilteredNetworkMapServiceInputImpl) {
            FilteredNetworkMapServiceInputImpl _impl = (FilteredNetworkMapServiceInputImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public List<EndpointAddressType> getAddressTypes() {
        return _addressTypes;
    }
    
    public List<PidName> getPids() {
        return _pids;
    }
    
    public ResourceId getResourceId() {
        return _resourceId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public FilteredNetworkMapServiceInputBuilder setAddressTypes(List<EndpointAddressType> value) {
        this._addressTypes = value;
        return this;
    }
    
    public FilteredNetworkMapServiceInputBuilder setPids(List<PidName> value) {
        this._pids = value;
        return this;
    }
    
    public FilteredNetworkMapServiceInputBuilder setResourceId(ResourceId value) {
        this._resourceId = value;
        return this;
    }
    
    public FilteredNetworkMapServiceInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public FilteredNetworkMapServiceInput build() {
        return new FilteredNetworkMapServiceInputImpl(this);
    }

    private static final class FilteredNetworkMapServiceInputImpl implements FilteredNetworkMapServiceInput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput.class;
        }

        private final List<EndpointAddressType> _addressTypes;
        private final List<PidName> _pids;
        private final ResourceId _resourceId;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput>> augmentation = new HashMap<>();

        private FilteredNetworkMapServiceInputImpl(FilteredNetworkMapServiceInputBuilder base) {
            this._addressTypes = base.getAddressTypes();
            this._pids = base.getPids();
            this._resourceId = base.getResourceId();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<EndpointAddressType> getAddressTypes() {
            return _addressTypes;
        }
        
        @Override
        public List<PidName> getPids() {
            return _pids;
        }
        
        @Override
        public ResourceId getResourceId() {
            return _resourceId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_addressTypes == null) ? 0 : _addressTypes.hashCode());
            result = prime * result + ((_pids == null) ? 0 : _pids.hashCode());
            result = prime * result + ((_resourceId == null) ? 0 : _resourceId.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput)obj;
            if (_addressTypes == null) {
                if (other.getAddressTypes() != null) {
                    return false;
                }
            } else if(!_addressTypes.equals(other.getAddressTypes())) {
                return false;
            }
            if (_pids == null) {
                if (other.getPids() != null) {
                    return false;
                }
            } else if(!_pids.equals(other.getPids())) {
                return false;
            }
            if (_resourceId == null) {
                if (other.getResourceId() != null) {
                    return false;
                }
            } else if(!_resourceId.equals(other.getResourceId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FilteredNetworkMapServiceInputImpl otherImpl = (FilteredNetworkMapServiceInputImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("FilteredNetworkMapServiceInput [");
            boolean first = true;
        
            if (_addressTypes != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_addressTypes=");
                builder.append(_addressTypes);
             }
            if (_pids != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_pids=");
                builder.append(_pids);
             }
            if (_resourceId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_resourceId=");
                builder.append(_resourceId);
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
