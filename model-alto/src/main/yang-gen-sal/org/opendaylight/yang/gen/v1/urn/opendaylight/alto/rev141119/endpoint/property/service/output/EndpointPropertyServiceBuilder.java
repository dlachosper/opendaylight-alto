package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.Meta;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService
 */
public class EndpointPropertyServiceBuilder {

    private List<EndpointProperties> _endpointProperties;
    private Meta _meta;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService>> augmentation = new HashMap<>();

    public EndpointPropertyServiceBuilder() {
    } 
    
    public EndpointPropertyServiceBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyMap arg) {
        this._meta = arg.getMeta();
        this._endpointProperties = arg.getEndpointProperties();
    }
    
    public EndpointPropertyServiceBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyMapData arg) {
        this._endpointProperties = arg.getEndpointProperties();
    }

    public EndpointPropertyServiceBuilder(EndpointPropertyService base) {
        this._endpointProperties = base.getEndpointProperties();
        this._meta = base.getMeta();
        if (base instanceof EndpointPropertyServiceImpl) {
            EndpointPropertyServiceImpl _impl = (EndpointPropertyServiceImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyMapData</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyMap</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyMapData) {
            this._endpointProperties = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyMapData)arg).getEndpointProperties();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyMap) {
            this._meta = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyMap)arg).getMeta();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyMapData, org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyMap] \n" +
              "but was: " + arg
            );
        }
    }

    public List<EndpointProperties> getEndpointProperties() {
        return _endpointProperties;
    }
    
    public Meta getMeta() {
        return _meta;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public EndpointPropertyServiceBuilder setEndpointProperties(List<EndpointProperties> value) {
        this._endpointProperties = value;
        return this;
    }
    
    public EndpointPropertyServiceBuilder setMeta(Meta value) {
        this._meta = value;
        return this;
    }
    
    public EndpointPropertyServiceBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public EndpointPropertyService build() {
        return new EndpointPropertyServiceImpl(this);
    }

    private static final class EndpointPropertyServiceImpl implements EndpointPropertyService {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService.class;
        }

        private final List<EndpointProperties> _endpointProperties;
        private final Meta _meta;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService>> augmentation = new HashMap<>();

        private EndpointPropertyServiceImpl(EndpointPropertyServiceBuilder base) {
            this._endpointProperties = base.getEndpointProperties();
            this._meta = base.getMeta();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<EndpointProperties> getEndpointProperties() {
            return _endpointProperties;
        }
        
        @Override
        public Meta getMeta() {
            return _meta;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_endpointProperties == null) ? 0 : _endpointProperties.hashCode());
            result = prime * result + ((_meta == null) ? 0 : _meta.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService)obj;
            if (_endpointProperties == null) {
                if (other.getEndpointProperties() != null) {
                    return false;
                }
            } else if(!_endpointProperties.equals(other.getEndpointProperties())) {
                return false;
            }
            if (_meta == null) {
                if (other.getMeta() != null) {
                    return false;
                }
            } else if(!_meta.equals(other.getMeta())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EndpointPropertyServiceImpl otherImpl = (EndpointPropertyServiceImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("EndpointPropertyService [");
            boolean first = true;
        
            if (_endpointProperties != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_endpointProperties=");
                builder.append(_endpointProperties);
             }
            if (_meta != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meta=");
                builder.append(_meta);
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
