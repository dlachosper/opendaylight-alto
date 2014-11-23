package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput
 */
public class EndpointPropertyServiceOutputBuilder {

    private EndpointPropertyService _endpointPropertyService;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput>> augmentation = new HashMap<>();

    public EndpointPropertyServiceOutputBuilder() {
    } 

    public EndpointPropertyServiceOutputBuilder(EndpointPropertyServiceOutput base) {
        this._endpointPropertyService = base.getEndpointPropertyService();
        if (base instanceof EndpointPropertyServiceOutputImpl) {
            EndpointPropertyServiceOutputImpl _impl = (EndpointPropertyServiceOutputImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public EndpointPropertyService getEndpointPropertyService() {
        return _endpointPropertyService;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public EndpointPropertyServiceOutputBuilder setEndpointPropertyService(EndpointPropertyService value) {
        this._endpointPropertyService = value;
        return this;
    }
    
    public EndpointPropertyServiceOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public EndpointPropertyServiceOutput build() {
        return new EndpointPropertyServiceOutputImpl(this);
    }

    private static final class EndpointPropertyServiceOutputImpl implements EndpointPropertyServiceOutput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput.class;
        }

        private final EndpointPropertyService _endpointPropertyService;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput>> augmentation = new HashMap<>();

        private EndpointPropertyServiceOutputImpl(EndpointPropertyServiceOutputBuilder base) {
            this._endpointPropertyService = base.getEndpointPropertyService();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public EndpointPropertyService getEndpointPropertyService() {
            return _endpointPropertyService;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_endpointPropertyService == null) ? 0 : _endpointPropertyService.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput)obj;
            if (_endpointPropertyService == null) {
                if (other.getEndpointPropertyService() != null) {
                    return false;
                }
            } else if(!_endpointPropertyService.equals(other.getEndpointPropertyService())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EndpointPropertyServiceOutputImpl otherImpl = (EndpointPropertyServiceOutputImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("EndpointPropertyServiceOutput [");
            boolean first = true;
        
            if (_endpointPropertyService != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_endpointPropertyService=");
                builder.append(_endpointPropertyService);
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
