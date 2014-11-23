package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.PidName;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCostsKey;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts
 */
public class DstCostsBuilder {

    private PidName _dst;
    private DstCostsKey _key;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts>> augmentation = new HashMap<>();

    public DstCostsBuilder() {
    } 
    

    public DstCostsBuilder(DstCosts base) {
        if (base.getKey() == null) {
            this._key = new DstCostsKey(
                base.getDst()
            );
            this._dst = base.getDst();
        } else {
            this._key = base.getKey();
            this._dst = _key.getDst();
        }
        if (base instanceof DstCostsImpl) {
            DstCostsImpl _impl = (DstCostsImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public PidName getDst() {
        return _dst;
    }
    
    public DstCostsKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public DstCostsBuilder setDst(PidName value) {
        this._dst = value;
        return this;
    }
    
    public DstCostsBuilder setKey(DstCostsKey value) {
        this._key = value;
        return this;
    }
    
    public DstCostsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public DstCosts build() {
        return new DstCostsImpl(this);
    }

    private static final class DstCostsImpl implements DstCosts {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts.class;
        }

        private final PidName _dst;
        private final DstCostsKey _key;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts>> augmentation = new HashMap<>();

        private DstCostsImpl(DstCostsBuilder base) {
            if (base.getKey() == null) {
                this._key = new DstCostsKey(
                    base.getDst()
                );
                this._dst = base.getDst();
            } else {
                this._key = base.getKey();
                this._dst = _key.getDst();
            }
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public PidName getDst() {
            return _dst;
        }
        
        @Override
        public DstCostsKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_dst == null) ? 0 : _dst.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts)obj;
            if (_dst == null) {
                if (other.getDst() != null) {
                    return false;
                }
            } else if(!_dst.equals(other.getDst())) {
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
                DstCostsImpl otherImpl = (DstCostsImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("DstCosts [");
            boolean first = true;
        
            if (_dst != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dst=");
                builder.append(_dst);
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
