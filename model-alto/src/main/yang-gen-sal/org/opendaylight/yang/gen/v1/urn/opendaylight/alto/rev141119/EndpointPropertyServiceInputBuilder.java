package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.TypedEndpointAddress;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput
 */
public class EndpointPropertyServiceInputBuilder {

    private List<TypedEndpointAddress> _endpoints;
    private List<EndpointPropertyType> _properties;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput>> augmentation = new HashMap<>();

    public EndpointPropertyServiceInputBuilder() {
    } 

    public EndpointPropertyServiceInputBuilder(EndpointPropertyServiceInput base) {
        this._endpoints = base.getEndpoints();
        this._properties = base.getProperties();
        if (base instanceof EndpointPropertyServiceInputImpl) {
            EndpointPropertyServiceInputImpl _impl = (EndpointPropertyServiceInputImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public List<TypedEndpointAddress> getEndpoints() {
        return _endpoints;
    }
    
    public List<EndpointPropertyType> getProperties() {
        return _properties;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public EndpointPropertyServiceInputBuilder setEndpoints(List<TypedEndpointAddress> value) {
        this._endpoints = value;
        return this;
    }
    
    public EndpointPropertyServiceInputBuilder setProperties(List<EndpointPropertyType> value) {
        this._properties = value;
        return this;
    }
    
    public EndpointPropertyServiceInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public EndpointPropertyServiceInput build() {
        return new EndpointPropertyServiceInputImpl(this);
    }

    private static final class EndpointPropertyServiceInputImpl implements EndpointPropertyServiceInput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput.class;
        }

        private final List<TypedEndpointAddress> _endpoints;
        private final List<EndpointPropertyType> _properties;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput>> augmentation = new HashMap<>();

        private EndpointPropertyServiceInputImpl(EndpointPropertyServiceInputBuilder base) {
            this._endpoints = base.getEndpoints();
            this._properties = base.getProperties();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<TypedEndpointAddress> getEndpoints() {
            return _endpoints;
        }
        
        @Override
        public List<EndpointPropertyType> getProperties() {
            return _properties;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_endpoints == null) ? 0 : _endpoints.hashCode());
            result = prime * result + ((_properties == null) ? 0 : _properties.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput)obj;
            if (_endpoints == null) {
                if (other.getEndpoints() != null) {
                    return false;
                }
            } else if(!_endpoints.equals(other.getEndpoints())) {
                return false;
            }
            if (_properties == null) {
                if (other.getProperties() != null) {
                    return false;
                }
            } else if(!_properties.equals(other.getProperties())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EndpointPropertyServiceInputImpl otherImpl = (EndpointPropertyServiceInputImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("EndpointPropertyServiceInput [");
            boolean first = true;
        
            if (_endpoints != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_endpoints=");
                builder.append(_endpoints);
             }
            if (_properties != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_properties=");
                builder.append(_properties);
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
