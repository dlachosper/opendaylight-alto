package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMapKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.TypedEndpointAddress;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.endpoint.cost.map.DstCosts;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap
 */
public class EndpointCostMapBuilder {

    private List<DstCosts> _dstCosts;
    private EndpointCostMapKey _key;
    private TypedEndpointAddress _src;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap>> augmentation = new HashMap<>();

    public EndpointCostMapBuilder() {
    } 

    public EndpointCostMapBuilder(EndpointCostMap base) {
        if (base.getKey() == null) {
            this._key = new EndpointCostMapKey(
                base.getSrc()
            );
            this._src = base.getSrc();
        } else {
            this._key = base.getKey();
            this._src = _key.getSrc();
        }
        this._dstCosts = base.getDstCosts();
        if (base instanceof EndpointCostMapImpl) {
            EndpointCostMapImpl _impl = (EndpointCostMapImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public List<DstCosts> getDstCosts() {
        return _dstCosts;
    }
    
    public EndpointCostMapKey getKey() {
        return _key;
    }
    
    public TypedEndpointAddress getSrc() {
        return _src;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public EndpointCostMapBuilder setDstCosts(List<DstCosts> value) {
        this._dstCosts = value;
        return this;
    }
    
    public EndpointCostMapBuilder setKey(EndpointCostMapKey value) {
        this._key = value;
        return this;
    }
    
    public EndpointCostMapBuilder setSrc(TypedEndpointAddress value) {
        this._src = value;
        return this;
    }
    
    public EndpointCostMapBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public EndpointCostMap build() {
        return new EndpointCostMapImpl(this);
    }

    private static final class EndpointCostMapImpl implements EndpointCostMap {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap.class;
        }

        private final List<DstCosts> _dstCosts;
        private final EndpointCostMapKey _key;
        private final TypedEndpointAddress _src;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap>> augmentation = new HashMap<>();

        private EndpointCostMapImpl(EndpointCostMapBuilder base) {
            if (base.getKey() == null) {
                this._key = new EndpointCostMapKey(
                    base.getSrc()
                );
                this._src = base.getSrc();
            } else {
                this._key = base.getKey();
                this._src = _key.getSrc();
            }
            this._dstCosts = base.getDstCosts();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<DstCosts> getDstCosts() {
            return _dstCosts;
        }
        
        @Override
        public EndpointCostMapKey getKey() {
            return _key;
        }
        
        @Override
        public TypedEndpointAddress getSrc() {
            return _src;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_dstCosts == null) ? 0 : _dstCosts.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_src == null) ? 0 : _src.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap)obj;
            if (_dstCosts == null) {
                if (other.getDstCosts() != null) {
                    return false;
                }
            } else if(!_dstCosts.equals(other.getDstCosts())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_src == null) {
                if (other.getSrc() != null) {
                    return false;
                }
            } else if(!_src.equals(other.getSrc())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EndpointCostMapImpl otherImpl = (EndpointCostMapImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("EndpointCostMap [");
            boolean first = true;
        
            if (_dstCosts != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dstCosts=");
                builder.append(_dstCosts);
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
            if (_src != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_src=");
                builder.append(_src);
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
