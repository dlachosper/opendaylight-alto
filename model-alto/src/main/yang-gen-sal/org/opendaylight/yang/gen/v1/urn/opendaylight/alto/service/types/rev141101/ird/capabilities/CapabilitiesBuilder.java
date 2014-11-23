package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyType;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostTypeName;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities
 */
public class CapabilitiesBuilder {

    private List<CostTypeName> _costTypeNames;
    private List<EndpointPropertyType> _propTypes;
    private java.lang.Boolean _costConstraints;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities>> augmentation = new HashMap<>();

    public CapabilitiesBuilder() {
    } 

    public CapabilitiesBuilder(Capabilities base) {
        this._costTypeNames = base.getCostTypeNames();
        this._propTypes = base.getPropTypes();
        this._costConstraints = base.isCostConstraints();
        if (base instanceof CapabilitiesImpl) {
            CapabilitiesImpl _impl = (CapabilitiesImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public List<CostTypeName> getCostTypeNames() {
        return _costTypeNames;
    }
    
    public List<EndpointPropertyType> getPropTypes() {
        return _propTypes;
    }
    
    public java.lang.Boolean isCostConstraints() {
        return _costConstraints;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public CapabilitiesBuilder setCostTypeNames(List<CostTypeName> value) {
        this._costTypeNames = value;
        return this;
    }
    
    public CapabilitiesBuilder setPropTypes(List<EndpointPropertyType> value) {
        this._propTypes = value;
        return this;
    }
    
    public CapabilitiesBuilder setCostConstraints(java.lang.Boolean value) {
        this._costConstraints = value;
        return this;
    }
    
    public CapabilitiesBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Capabilities build() {
        return new CapabilitiesImpl(this);
    }

    private static final class CapabilitiesImpl implements Capabilities {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities.class;
        }

        private final List<CostTypeName> _costTypeNames;
        private final List<EndpointPropertyType> _propTypes;
        private final java.lang.Boolean _costConstraints;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities>> augmentation = new HashMap<>();

        private CapabilitiesImpl(CapabilitiesBuilder base) {
            this._costTypeNames = base.getCostTypeNames();
            this._propTypes = base.getPropTypes();
            this._costConstraints = base.isCostConstraints();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<CostTypeName> getCostTypeNames() {
            return _costTypeNames;
        }
        
        @Override
        public List<EndpointPropertyType> getPropTypes() {
            return _propTypes;
        }
        
        @Override
        public java.lang.Boolean isCostConstraints() {
            return _costConstraints;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_costTypeNames == null) ? 0 : _costTypeNames.hashCode());
            result = prime * result + ((_propTypes == null) ? 0 : _propTypes.hashCode());
            result = prime * result + ((_costConstraints == null) ? 0 : _costConstraints.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities)obj;
            if (_costTypeNames == null) {
                if (other.getCostTypeNames() != null) {
                    return false;
                }
            } else if(!_costTypeNames.equals(other.getCostTypeNames())) {
                return false;
            }
            if (_propTypes == null) {
                if (other.getPropTypes() != null) {
                    return false;
                }
            } else if(!_propTypes.equals(other.getPropTypes())) {
                return false;
            }
            if (_costConstraints == null) {
                if (other.isCostConstraints() != null) {
                    return false;
                }
            } else if(!_costConstraints.equals(other.isCostConstraints())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CapabilitiesImpl otherImpl = (CapabilitiesImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Capabilities [");
            boolean first = true;
        
            if (_costTypeNames != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_costTypeNames=");
                builder.append(_costTypeNames);
             }
            if (_propTypes != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_propTypes=");
                builder.append(_propTypes);
             }
            if (_costConstraints != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_costConstraints=");
                builder.append(_costConstraints);
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
