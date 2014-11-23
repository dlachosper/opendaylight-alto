package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.PidName;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMapKey;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.cost.map.DstCosts;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap
 */
public class CostMapBuilder {

    private List<DstCosts> _dstCosts;
    private CostMapKey _key;
    private PidName _src;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap>> augmentation = new HashMap<>();

    public CostMapBuilder() {
    } 

    public CostMapBuilder(CostMap base) {
        if (base.getKey() == null) {
            this._key = new CostMapKey(
                base.getSrc()
            );
            this._src = base.getSrc();
        } else {
            this._key = base.getKey();
            this._src = _key.getSrc();
        }
        this._dstCosts = base.getDstCosts();
        if (base instanceof CostMapImpl) {
            CostMapImpl _impl = (CostMapImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public List<DstCosts> getDstCosts() {
        return _dstCosts;
    }
    
    public CostMapKey getKey() {
        return _key;
    }
    
    public PidName getSrc() {
        return _src;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public CostMapBuilder setDstCosts(List<DstCosts> value) {
        this._dstCosts = value;
        return this;
    }
    
    public CostMapBuilder setKey(CostMapKey value) {
        this._key = value;
        return this;
    }
    
    public CostMapBuilder setSrc(PidName value) {
        this._src = value;
        return this;
    }
    
    public CostMapBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public CostMap build() {
        return new CostMapImpl(this);
    }

    private static final class CostMapImpl implements CostMap {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap.class;
        }

        private final List<DstCosts> _dstCosts;
        private final CostMapKey _key;
        private final PidName _src;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap>> augmentation = new HashMap<>();

        private CostMapImpl(CostMapBuilder base) {
            if (base.getKey() == null) {
                this._key = new CostMapKey(
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
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap>>singletonMap(e.getKey(), e.getValue());       
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
        public CostMapKey getKey() {
            return _key;
        }
        
        @Override
        public PidName getSrc() {
            return _src;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap)obj;
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
                CostMapImpl otherImpl = (CostMapImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("CostMap [");
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
