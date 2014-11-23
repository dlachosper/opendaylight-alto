package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.types.CostTypes;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ResourceId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta
 */
public class MetaBuilder {

    private List<CostTypes> _costTypes;
    private ResourceId _defaultAltoNetworkMap;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta>> augmentation = new HashMap<>();

    public MetaBuilder() {
    } 
    
    public MetaBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDMeta arg) {
        this._defaultAltoNetworkMap = arg.getDefaultAltoNetworkMap();
        this._costTypes = arg.getCostTypes();
    }
    
    public MetaBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostTypes arg) {
        this._costTypes = arg.getCostTypes();
    }

    public MetaBuilder(Meta base) {
        this._costTypes = base.getCostTypes();
        this._defaultAltoNetworkMap = base.getDefaultAltoNetworkMap();
        if (base instanceof MetaImpl) {
            MetaImpl _impl = (MetaImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDMeta</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostTypes</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDMeta) {
            this._defaultAltoNetworkMap = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDMeta)arg).getDefaultAltoNetworkMap();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostTypes) {
            this._costTypes = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostTypes)arg).getCostTypes();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDMeta, org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostTypes] \n" +
              "but was: " + arg
            );
        }
    }

    public List<CostTypes> getCostTypes() {
        return _costTypes;
    }
    
    public ResourceId getDefaultAltoNetworkMap() {
        return _defaultAltoNetworkMap;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MetaBuilder setCostTypes(List<CostTypes> value) {
        this._costTypes = value;
        return this;
    }
    
    public MetaBuilder setDefaultAltoNetworkMap(ResourceId value) {
        this._defaultAltoNetworkMap = value;
        return this;
    }
    
    public MetaBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Meta build() {
        return new MetaImpl(this);
    }

    private static final class MetaImpl implements Meta {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta.class;
        }

        private final List<CostTypes> _costTypes;
        private final ResourceId _defaultAltoNetworkMap;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta>> augmentation = new HashMap<>();

        private MetaImpl(MetaBuilder base) {
            this._costTypes = base.getCostTypes();
            this._defaultAltoNetworkMap = base.getDefaultAltoNetworkMap();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<CostTypes> getCostTypes() {
            return _costTypes;
        }
        
        @Override
        public ResourceId getDefaultAltoNetworkMap() {
            return _defaultAltoNetworkMap;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_costTypes == null) ? 0 : _costTypes.hashCode());
            result = prime * result + ((_defaultAltoNetworkMap == null) ? 0 : _defaultAltoNetworkMap.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta)obj;
            if (_costTypes == null) {
                if (other.getCostTypes() != null) {
                    return false;
                }
            } else if(!_costTypes.equals(other.getCostTypes())) {
                return false;
            }
            if (_defaultAltoNetworkMap == null) {
                if (other.getDefaultAltoNetworkMap() != null) {
                    return false;
                }
            } else if(!_defaultAltoNetworkMap.equals(other.getDefaultAltoNetworkMap())) {
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
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta>> e : augmentation.entrySet()) {
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
        
            if (_costTypes != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_costTypes=");
                builder.append(_costTypes);
             }
            if (_defaultAltoNetworkMap != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_defaultAltoNetworkMap=");
                builder.append(_defaultAltoNetworkMap);
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
