package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD
 */
public class IRDBuilder {

    private Meta _meta;
    private List<Resources> _resources;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD>> augmentation = new HashMap<>();

    public IRDBuilder() {
    } 
    
    public IRDBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRD arg) {
        this._meta = arg.getMeta();
        this._resources = arg.getResources();
    }
    
    public IRDBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDData arg) {
        this._resources = arg.getResources();
    }

    public IRDBuilder(IRD base) {
        this._meta = base.getMeta();
        this._resources = base.getResources();
        if (base instanceof IRDImpl) {
            IRDImpl _impl = (IRDImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDData</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRD</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDData) {
            this._resources = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDData)arg).getResources();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRD) {
            this._meta = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRD)arg).getMeta();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDData, org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRD] \n" +
              "but was: " + arg
            );
        }
    }

    public Meta getMeta() {
        return _meta;
    }
    
    public List<Resources> getResources() {
        return _resources;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public IRDBuilder setMeta(Meta value) {
        this._meta = value;
        return this;
    }
    
    public IRDBuilder setResources(List<Resources> value) {
        this._resources = value;
        return this;
    }
    
    public IRDBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public IRD build() {
        return new IRDImpl(this);
    }

    private static final class IRDImpl implements IRD {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD.class;
        }

        private final Meta _meta;
        private final List<Resources> _resources;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD>> augmentation = new HashMap<>();

        private IRDImpl(IRDBuilder base) {
            this._meta = base.getMeta();
            this._resources = base.getResources();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public Meta getMeta() {
            return _meta;
        }
        
        @Override
        public List<Resources> getResources() {
            return _resources;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_meta == null) ? 0 : _meta.hashCode());
            result = prime * result + ((_resources == null) ? 0 : _resources.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD)obj;
            if (_meta == null) {
                if (other.getMeta() != null) {
                    return false;
                }
            } else if(!_meta.equals(other.getMeta())) {
                return false;
            }
            if (_resources == null) {
                if (other.getResources() != null) {
                    return false;
                }
            } else if(!_resources.equals(other.getResources())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                IRDImpl otherImpl = (IRDImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("IRD [");
            boolean first = true;
        
            if (_meta != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meta=");
                builder.append(_meta);
             }
            if (_resources != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_resources=");
                builder.append(_resources);
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
