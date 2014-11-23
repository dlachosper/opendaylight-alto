package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.cost.maps.CostMap;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps
 */
public class CostMapsBuilder {

    private List<CostMap> _costMap;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps>> augmentation = new HashMap<>();

    public CostMapsBuilder() {
    } 

    public CostMapsBuilder(CostMaps base) {
        this._costMap = base.getCostMap();
        if (base instanceof CostMapsImpl) {
            CostMapsImpl _impl = (CostMapsImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public List<CostMap> getCostMap() {
        return _costMap;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public CostMapsBuilder setCostMap(List<CostMap> value) {
        this._costMap = value;
        return this;
    }
    
    public CostMapsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public CostMaps build() {
        return new CostMapsImpl(this);
    }

    private static final class CostMapsImpl implements CostMaps {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps.class;
        }

        private final List<CostMap> _costMap;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps>> augmentation = new HashMap<>();

        private CostMapsImpl(CostMapsBuilder base) {
            this._costMap = base.getCostMap();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<CostMap> getCostMap() {
            return _costMap;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_costMap == null) ? 0 : _costMap.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps)obj;
            if (_costMap == null) {
                if (other.getCostMap() != null) {
                    return false;
                }
            } else if(!_costMap.equals(other.getCostMap())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CostMapsImpl otherImpl = (CostMapsImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("CostMaps [");
            boolean first = true;
        
            if (_costMap != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_costMap=");
                builder.append(_costMap);
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
