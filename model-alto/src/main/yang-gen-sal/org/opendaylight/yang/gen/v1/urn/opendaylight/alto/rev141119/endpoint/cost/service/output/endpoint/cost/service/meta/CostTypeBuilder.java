package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostMode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostMetric;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType
 */
public class CostTypeBuilder {

    private CostMetric _costMetric;
    private CostMode _costMode;
    private java.lang.String _description;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType>> augmentation = new HashMap<>();

    public CostTypeBuilder() {
    } 
    
    public CostTypeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostType arg) {
        this._costMode = arg.getCostMode();
        this._costMetric = arg.getCostMetric();
        this._description = arg.getDescription();
    }

    public CostTypeBuilder(CostType base) {
        this._costMetric = base.getCostMetric();
        this._costMode = base.getCostMode();
        this._description = base.getDescription();
        if (base instanceof CostTypeImpl) {
            CostTypeImpl _impl = (CostTypeImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostType</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostType) {
            this._costMode = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostType)arg).getCostMode();
            this._costMetric = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostType)arg).getCostMetric();
            this._description = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostType)arg).getDescription();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostType] \n" +
              "but was: " + arg
            );
        }
    }

    public CostMetric getCostMetric() {
        return _costMetric;
    }
    
    public CostMode getCostMode() {
        return _costMode;
    }
    
    public java.lang.String getDescription() {
        return _description;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public CostTypeBuilder setCostMetric(CostMetric value) {
        this._costMetric = value;
        return this;
    }
    
    public CostTypeBuilder setCostMode(CostMode value) {
        this._costMode = value;
        return this;
    }
    
    public CostTypeBuilder setDescription(java.lang.String value) {
        this._description = value;
        return this;
    }
    
    public CostTypeBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public CostType build() {
        return new CostTypeImpl(this);
    }

    private static final class CostTypeImpl implements CostType {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType.class;
        }

        private final CostMetric _costMetric;
        private final CostMode _costMode;
        private final java.lang.String _description;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType>> augmentation = new HashMap<>();

        private CostTypeImpl(CostTypeBuilder base) {
            this._costMetric = base.getCostMetric();
            this._costMode = base.getCostMode();
            this._description = base.getDescription();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public CostMetric getCostMetric() {
            return _costMetric;
        }
        
        @Override
        public CostMode getCostMode() {
            return _costMode;
        }
        
        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_costMetric == null) ? 0 : _costMetric.hashCode());
            result = prime * result + ((_costMode == null) ? 0 : _costMode.hashCode());
            result = prime * result + ((_description == null) ? 0 : _description.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType)obj;
            if (_costMetric == null) {
                if (other.getCostMetric() != null) {
                    return false;
                }
            } else if(!_costMetric.equals(other.getCostMetric())) {
                return false;
            }
            if (_costMode == null) {
                if (other.getCostMode() != null) {
                    return false;
                }
            } else if(!_costMode.equals(other.getCostMode())) {
                return false;
            }
            if (_description == null) {
                if (other.getDescription() != null) {
                    return false;
                }
            } else if(!_description.equals(other.getDescription())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CostTypeImpl otherImpl = (CostTypeImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("CostType [");
            boolean first = true;
        
            if (_costMetric != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_costMetric=");
                builder.append(_costMetric);
             }
            if (_costMode != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_costMode=");
                builder.append(_costMode);
             }
            if (_description != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_description=");
                builder.append(_description);
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
