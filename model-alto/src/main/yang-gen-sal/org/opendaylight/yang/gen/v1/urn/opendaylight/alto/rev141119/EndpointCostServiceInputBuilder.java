package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.CostType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Constraint;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput
 */
public class EndpointCostServiceInputBuilder {

    private List<Constraint> _constraints;
    private CostType _costType;
    private Endpoints _endpoints;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput>> augmentation = new HashMap<>();

    public EndpointCostServiceInputBuilder() {
    } 

    public EndpointCostServiceInputBuilder(EndpointCostServiceInput base) {
        this._constraints = base.getConstraints();
        this._costType = base.getCostType();
        this._endpoints = base.getEndpoints();
        if (base instanceof EndpointCostServiceInputImpl) {
            EndpointCostServiceInputImpl _impl = (EndpointCostServiceInputImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public List<Constraint> getConstraints() {
        return _constraints;
    }
    
    public CostType getCostType() {
        return _costType;
    }
    
    public Endpoints getEndpoints() {
        return _endpoints;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public EndpointCostServiceInputBuilder setConstraints(List<Constraint> value) {
        this._constraints = value;
        return this;
    }
    
    public EndpointCostServiceInputBuilder setCostType(CostType value) {
        this._costType = value;
        return this;
    }
    
    public EndpointCostServiceInputBuilder setEndpoints(Endpoints value) {
        this._endpoints = value;
        return this;
    }
    
    public EndpointCostServiceInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public EndpointCostServiceInput build() {
        return new EndpointCostServiceInputImpl(this);
    }

    private static final class EndpointCostServiceInputImpl implements EndpointCostServiceInput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput.class;
        }

        private final List<Constraint> _constraints;
        private final CostType _costType;
        private final Endpoints _endpoints;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput>> augmentation = new HashMap<>();

        private EndpointCostServiceInputImpl(EndpointCostServiceInputBuilder base) {
            this._constraints = base.getConstraints();
            this._costType = base.getCostType();
            this._endpoints = base.getEndpoints();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput>>singletonMap(e.getKey(), e.getValue());       
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
        public Endpoints getEndpoints() {
            return _endpoints;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_endpoints == null) ? 0 : _endpoints.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput)obj;
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
            if (_endpoints == null) {
                if (other.getEndpoints() != null) {
                    return false;
                }
            } else if(!_endpoints.equals(other.getEndpoints())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EndpointCostServiceInputImpl otherImpl = (EndpointCostServiceInputImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("EndpointCostServiceInput [");
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
            if (_endpoints != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_endpoints=");
                builder.append(_endpoints);
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
