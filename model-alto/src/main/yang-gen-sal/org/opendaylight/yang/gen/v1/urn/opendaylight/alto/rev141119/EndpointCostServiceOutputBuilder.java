package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.EndpointCostService;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput
 */
public class EndpointCostServiceOutputBuilder {

    private EndpointCostService _endpointCostService;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput>> augmentation = new HashMap<>();

    public EndpointCostServiceOutputBuilder() {
    } 

    public EndpointCostServiceOutputBuilder(EndpointCostServiceOutput base) {
        this._endpointCostService = base.getEndpointCostService();
        if (base instanceof EndpointCostServiceOutputImpl) {
            EndpointCostServiceOutputImpl _impl = (EndpointCostServiceOutputImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public EndpointCostService getEndpointCostService() {
        return _endpointCostService;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public EndpointCostServiceOutputBuilder setEndpointCostService(EndpointCostService value) {
        this._endpointCostService = value;
        return this;
    }
    
    public EndpointCostServiceOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public EndpointCostServiceOutput build() {
        return new EndpointCostServiceOutputImpl(this);
    }

    private static final class EndpointCostServiceOutputImpl implements EndpointCostServiceOutput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput.class;
        }

        private final EndpointCostService _endpointCostService;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput>> augmentation = new HashMap<>();

        private EndpointCostServiceOutputImpl(EndpointCostServiceOutputBuilder base) {
            this._endpointCostService = base.getEndpointCostService();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public EndpointCostService getEndpointCostService() {
            return _endpointCostService;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_endpointCostService == null) ? 0 : _endpointCostService.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput)obj;
            if (_endpointCostService == null) {
                if (other.getEndpointCostService() != null) {
                    return false;
                }
            } else if(!_endpointCostService.equals(other.getEndpointCostService())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EndpointCostServiceOutputImpl otherImpl = (EndpointCostServiceOutputImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("EndpointCostServiceOutput [");
            boolean first = true;
        
            if (_endpointCostService != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_endpointCostService=");
                builder.append(_endpointCostService);
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
