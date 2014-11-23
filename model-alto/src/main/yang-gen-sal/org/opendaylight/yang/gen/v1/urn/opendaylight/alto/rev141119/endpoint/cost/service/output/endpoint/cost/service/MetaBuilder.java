package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta
 */
public class MetaBuilder {

    private CostType _costType;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta>> augmentation = new HashMap<>();

    public MetaBuilder() {
    } 

    public MetaBuilder(Meta base) {
        this._costType = base.getCostType();
        if (base instanceof MetaImpl) {
            MetaImpl _impl = (MetaImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public CostType getCostType() {
        return _costType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MetaBuilder setCostType(CostType value) {
        this._costType = value;
        return this;
    }
    
    public MetaBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Meta build() {
        return new MetaImpl(this);
    }

    private static final class MetaImpl implements Meta {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta.class;
        }

        private final CostType _costType;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta>> augmentation = new HashMap<>();

        private MetaImpl(MetaBuilder base) {
            this._costType = base.getCostType();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public CostType getCostType() {
            return _costType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_costType == null) ? 0 : _costType.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta)obj;
            if (_costType == null) {
                if (other.getCostType() != null) {
                    return false;
                }
            } else if(!_costType.equals(other.getCostType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MetaImpl otherImpl = (MetaImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Meta [");
            boolean first = true;
        
            if (_costType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_costType=");
                builder.append(_costType);
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
