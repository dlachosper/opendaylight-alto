package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.meta.CostType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.dependent.vtags.DependentVtags;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta
 */
public class MetaBuilder {

    private CostType _costType;
    private List<DependentVtags> _dependentVtags;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta>> augmentation = new HashMap<>();

    public MetaBuilder() {
    } 
    
    public MetaBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostMapMeta arg) {
        this._costType = arg.getCostType();
        this._dependentVtags = arg.getDependentVtags();
    }
    
    public MetaBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.DependentVtags arg) {
        this._dependentVtags = arg.getDependentVtags();
    }

    public MetaBuilder(Meta base) {
        this._costType = base.getCostType();
        this._dependentVtags = base.getDependentVtags();
        if (base instanceof MetaImpl) {
            MetaImpl _impl = (MetaImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostMapMeta</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.DependentVtags</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostMapMeta) {
            this._costType = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostMapMeta)arg).getCostType();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.DependentVtags) {
            this._dependentVtags = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.DependentVtags)arg).getDependentVtags();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostMapMeta, org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.DependentVtags] \n" +
              "but was: " + arg
            );
        }
    }

    public CostType getCostType() {
        return _costType;
    }
    
    public List<DependentVtags> getDependentVtags() {
        return _dependentVtags;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MetaBuilder setCostType(CostType value) {
        this._costType = value;
        return this;
    }
    
    public MetaBuilder setDependentVtags(List<DependentVtags> value) {
        this._dependentVtags = value;
        return this;
    }
    
    public MetaBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Meta build() {
        return new MetaImpl(this);
    }

    private static final class MetaImpl implements Meta {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta.class;
        }

        private final CostType _costType;
        private final List<DependentVtags> _dependentVtags;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta>> augmentation = new HashMap<>();

        private MetaImpl(MetaBuilder base) {
            this._costType = base.getCostType();
            this._dependentVtags = base.getDependentVtags();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public CostType getCostType() {
            return _costType;
        }
        
        @Override
        public List<DependentVtags> getDependentVtags() {
            return _dependentVtags;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_dependentVtags == null) ? 0 : _dependentVtags.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta)obj;
            if (_costType == null) {
                if (other.getCostType() != null) {
                    return false;
                }
            } else if(!_costType.equals(other.getCostType())) {
                return false;
            }
            if (_dependentVtags == null) {
                if (other.getDependentVtags() != null) {
                    return false;
                }
            } else if(!_dependentVtags.equals(other.getDependentVtags())) {
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
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta>> e : augmentation.entrySet()) {
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
            if (_dependentVtags != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dependentVtags=");
                builder.append(_dependentVtags);
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
