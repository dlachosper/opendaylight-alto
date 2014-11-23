package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.TypedEndpointAddress;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints
 */
public class EndpointsBuilder {

    private List<TypedEndpointAddress> _dsts;
    private List<TypedEndpointAddress> _srcs;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints>> augmentation = new HashMap<>();

    public EndpointsBuilder() {
    } 

    public EndpointsBuilder(Endpoints base) {
        this._dsts = base.getDsts();
        this._srcs = base.getSrcs();
        if (base instanceof EndpointsImpl) {
            EndpointsImpl _impl = (EndpointsImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public List<TypedEndpointAddress> getDsts() {
        return _dsts;
    }
    
    public List<TypedEndpointAddress> getSrcs() {
        return _srcs;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public EndpointsBuilder setDsts(List<TypedEndpointAddress> value) {
        this._dsts = value;
        return this;
    }
    
    public EndpointsBuilder setSrcs(List<TypedEndpointAddress> value) {
        this._srcs = value;
        return this;
    }
    
    public EndpointsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Endpoints build() {
        return new EndpointsImpl(this);
    }

    private static final class EndpointsImpl implements Endpoints {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints.class;
        }

        private final List<TypedEndpointAddress> _dsts;
        private final List<TypedEndpointAddress> _srcs;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints>> augmentation = new HashMap<>();

        private EndpointsImpl(EndpointsBuilder base) {
            this._dsts = base.getDsts();
            this._srcs = base.getSrcs();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<TypedEndpointAddress> getDsts() {
            return _dsts;
        }
        
        @Override
        public List<TypedEndpointAddress> getSrcs() {
            return _srcs;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_dsts == null) ? 0 : _dsts.hashCode());
            result = prime * result + ((_srcs == null) ? 0 : _srcs.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints)obj;
            if (_dsts == null) {
                if (other.getDsts() != null) {
                    return false;
                }
            } else if(!_dsts.equals(other.getDsts())) {
                return false;
            }
            if (_srcs == null) {
                if (other.getSrcs() != null) {
                    return false;
                }
            } else if(!_srcs.equals(other.getSrcs())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EndpointsImpl otherImpl = (EndpointsImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Endpoints [");
            boolean first = true;
        
            if (_dsts != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dsts=");
                builder.append(_dsts);
             }
            if (_srcs != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_srcs=");
                builder.append(_srcs);
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
