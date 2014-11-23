package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.TypedEndpointAddress;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointPropertiesKey;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties
 */
public class EndpointPropertiesBuilder {

    private TypedEndpointAddress _endpoint;
    private EndpointPropertiesKey _key;
    private List<Properties> _properties;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties>> augmentation = new HashMap<>();

    public EndpointPropertiesBuilder() {
    } 

    public EndpointPropertiesBuilder(EndpointProperties base) {
        if (base.getKey() == null) {
            this._key = new EndpointPropertiesKey(
                base.getEndpoint()
            );
            this._endpoint = base.getEndpoint();
        } else {
            this._key = base.getKey();
            this._endpoint = _key.getEndpoint();
        }
        this._properties = base.getProperties();
        if (base instanceof EndpointPropertiesImpl) {
            EndpointPropertiesImpl _impl = (EndpointPropertiesImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public TypedEndpointAddress getEndpoint() {
        return _endpoint;
    }
    
    public EndpointPropertiesKey getKey() {
        return _key;
    }
    
    public List<Properties> getProperties() {
        return _properties;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public EndpointPropertiesBuilder setEndpoint(TypedEndpointAddress value) {
        this._endpoint = value;
        return this;
    }
    
    public EndpointPropertiesBuilder setKey(EndpointPropertiesKey value) {
        this._key = value;
        return this;
    }
    
    public EndpointPropertiesBuilder setProperties(List<Properties> value) {
        this._properties = value;
        return this;
    }
    
    public EndpointPropertiesBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public EndpointProperties build() {
        return new EndpointPropertiesImpl(this);
    }

    private static final class EndpointPropertiesImpl implements EndpointProperties {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties.class;
        }

        private final TypedEndpointAddress _endpoint;
        private final EndpointPropertiesKey _key;
        private final List<Properties> _properties;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties>> augmentation = new HashMap<>();

        private EndpointPropertiesImpl(EndpointPropertiesBuilder base) {
            if (base.getKey() == null) {
                this._key = new EndpointPropertiesKey(
                    base.getEndpoint()
                );
                this._endpoint = base.getEndpoint();
            } else {
                this._key = base.getKey();
                this._endpoint = _key.getEndpoint();
            }
            this._properties = base.getProperties();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public TypedEndpointAddress getEndpoint() {
            return _endpoint;
        }
        
        @Override
        public EndpointPropertiesKey getKey() {
            return _key;
        }
        
        @Override
        public List<Properties> getProperties() {
            return _properties;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_endpoint == null) ? 0 : _endpoint.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties)obj;
            if (_endpoint == null) {
                if (other.getEndpoint() != null) {
                    return false;
                }
            } else if(!_endpoint.equals(other.getEndpoint())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
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
                EndpointPropertiesImpl otherImpl = (EndpointPropertiesImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("EndpointProperties [");
            boolean first = true;
        
            if (_endpoint != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_endpoint=");
                builder.append(_endpoint);
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
