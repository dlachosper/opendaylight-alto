package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta
 */
public class MetaBuilder {

    private Vtag _vtag;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta>> augmentation = new HashMap<>();

    public MetaBuilder() {
    } 
    
    public MetaBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.NetworkMapMeta arg) {
        this._vtag = arg.getVtag();
    }

    public MetaBuilder(Meta base) {
        this._vtag = base.getVtag();
        if (base instanceof MetaImpl) {
            MetaImpl _impl = (MetaImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.NetworkMapMeta</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.NetworkMapMeta) {
            this._vtag = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.NetworkMapMeta)arg).getVtag();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.NetworkMapMeta] \n" +
              "but was: " + arg
            );
        }
    }

    public Vtag getVtag() {
        return _vtag;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MetaBuilder setVtag(Vtag value) {
        this._vtag = value;
        return this;
    }
    
    public MetaBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Meta build() {
        return new MetaImpl(this);
    }

    private static final class MetaImpl implements Meta {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta.class;
        }

        private final Vtag _vtag;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta>> augmentation = new HashMap<>();

        private MetaImpl(MetaBuilder base) {
            this._vtag = base.getVtag();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public Vtag getVtag() {
            return _vtag;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_vtag == null) ? 0 : _vtag.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta)obj;
            if (_vtag == null) {
                if (other.getVtag() != null) {
                    return false;
                }
            } else if(!_vtag.equals(other.getVtag())) {
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
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta>> e : augmentation.entrySet()) {
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
        
            if (_vtag != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_vtag=");
                builder.append(_vtag);
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
