package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ResourceId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.input.CostType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Constraint;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.input.Pids;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput
 */
public class FilteredCostMapServiceInputBuilder {

    private List<Constraint> _constraints;
    private CostType _costType;
    private Pids _pids;
    private ResourceId _resourceId;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput>> augmentation = new HashMap<>();

    public FilteredCostMapServiceInputBuilder() {
    } 

    public FilteredCostMapServiceInputBuilder(FilteredCostMapServiceInput base) {
        this._constraints = base.getConstraints();
        this._costType = base.getCostType();
        this._pids = base.getPids();
        this._resourceId = base.getResourceId();
        if (base instanceof FilteredCostMapServiceInputImpl) {
            FilteredCostMapServiceInputImpl _impl = (FilteredCostMapServiceInputImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public List<Constraint> getConstraints() {
        return _constraints;
    }
    
    public CostType getCostType() {
        return _costType;
    }
    
    public Pids getPids() {
        return _pids;
    }
    
    public ResourceId getResourceId() {
        return _resourceId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public FilteredCostMapServiceInputBuilder setConstraints(List<Constraint> value) {
        this._constraints = value;
        return this;
    }
    
    public FilteredCostMapServiceInputBuilder setCostType(CostType value) {
        this._costType = value;
        return this;
    }
    
    public FilteredCostMapServiceInputBuilder setPids(Pids value) {
        this._pids = value;
        return this;
    }
    
    public FilteredCostMapServiceInputBuilder setResourceId(ResourceId value) {
        this._resourceId = value;
        return this;
    }
    
    public FilteredCostMapServiceInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public FilteredCostMapServiceInput build() {
        return new FilteredCostMapServiceInputImpl(this);
    }

    private static final class FilteredCostMapServiceInputImpl implements FilteredCostMapServiceInput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput.class;
        }

        private final List<Constraint> _constraints;
        private final CostType _costType;
        private final Pids _pids;
        private final ResourceId _resourceId;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput>> augmentation = new HashMap<>();

        private FilteredCostMapServiceInputImpl(FilteredCostMapServiceInputBuilder base) {
            this._constraints = base.getConstraints();
            this._costType = base.getCostType();
            this._pids = base.getPids();
            this._resourceId = base.getResourceId();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<Constraint> getConstraints() {
            return _constraints;
        }
        
        @Override
        public CostType getCostType() {
            return _costType;
        }
        
        @Override
        public Pids getPids() {
            return _pids;
        }
        
        @Override
        public ResourceId getResourceId() {
            return _resourceId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_constraints == null) ? 0 : _constraints.hashCode());
            result = prime * result + ((_costType == null) ? 0 : _costType.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput)obj;
            if (_constraints == null) {
                if (other.getConstraints() != null) {
                    return false;
                }
            } else if(!_constraints.equals(other.getConstraints())) {
                return false;
            }
            if (_costType == null) {
                if (other.getCostType() != null) {
                    return false;
                }
            } else if(!_costType.equals(other.getCostType())) {
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
                FilteredCostMapServiceInputImpl otherImpl = (FilteredCostMapServiceInputImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("FilteredCostMapServiceInput [");
            boolean first = true;
        
            if (_constraints != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_constraints=");
                builder.append(_constraints);
             }
            if (_costType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_costType=");
                builder.append(_costType);
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
