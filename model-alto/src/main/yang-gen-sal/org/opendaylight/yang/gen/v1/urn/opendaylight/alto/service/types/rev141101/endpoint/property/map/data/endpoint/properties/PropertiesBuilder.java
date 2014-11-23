package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyValue;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.PropertiesKey;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties
 */
public class PropertiesBuilder {

    private PropertiesKey _key;
    private EndpointPropertyValue _property;
    private EndpointPropertyType _propertyType;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties>> augmentation = new HashMap<>();

    public PropertiesBuilder() {
    } 

    public PropertiesBuilder(Properties base) {
        if (base.getKey() == null) {
            this._key = new PropertiesKey(
                base.getPropertyType()
            );
            this._propertyType = base.getPropertyType();
        } else {
            this._key = base.getKey();
            this._propertyType = _key.getPropertyType();
        }
        this._property = base.getProperty();
        if (base instanceof PropertiesImpl) {
            PropertiesImpl _impl = (PropertiesImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public PropertiesKey getKey() {
        return _key;
    }
    
    public EndpointPropertyValue getProperty() {
        return _property;
    }
    
    public EndpointPropertyType getPropertyType() {
        return _propertyType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public PropertiesBuilder setKey(PropertiesKey value) {
        this._key = value;
        return this;
    }
    
    public PropertiesBuilder setProperty(EndpointPropertyValue value) {
        this._property = value;
        return this;
    }
    
    public PropertiesBuilder setPropertyType(EndpointPropertyType value) {
        this._propertyType = value;
        return this;
    }
    
    public PropertiesBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Properties build() {
        return new PropertiesImpl(this);
    }

    private static final class PropertiesImpl implements Properties {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties.class;
        }

        private final PropertiesKey _key;
        private final EndpointPropertyValue _property;
        private final EndpointPropertyType _propertyType;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties>> augmentation = new HashMap<>();

        private PropertiesImpl(PropertiesBuilder base) {
            if (base.getKey() == null) {
                this._key = new PropertiesKey(
                    base.getPropertyType()
                );
                this._propertyType = base.getPropertyType();
            } else {
                this._key = base.getKey();
                this._propertyType = _key.getPropertyType();
            }
            this._property = base.getProperty();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public PropertiesKey getKey() {
            return _key;
        }
        
        @Override
        public EndpointPropertyValue getProperty() {
            return _property;
        }
        
        @Override
        public EndpointPropertyType getPropertyType() {
            return _propertyType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_property == null) ? 0 : _property.hashCode());
            result = prime * result + ((_propertyType == null) ? 0 : _propertyType.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties)obj;
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_property == null) {
                if (other.getProperty() != null) {
                    return false;
                }
            } else if(!_property.equals(other.getProperty())) {
                return false;
            }
            if (_propertyType == null) {
                if (other.getPropertyType() != null) {
                    return false;
                }
            } else if(!_propertyType.equals(other.getPropertyType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PropertiesImpl otherImpl = (PropertiesImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Properties [");
            boolean first = true;
        
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (_property != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_property=");
                builder.append(_property);
             }
            if (_propertyType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_propertyType=");
                builder.append(_propertyType);
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
