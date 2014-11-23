package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta;
import com.google.common.collect.Range;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ResourceId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.TagString;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag
 */
public class VtagBuilder {

    private ResourceId _resourceId;
    private TagString _tag;
    private static List<Range<BigInteger>> _tag_length;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag>> augmentation = new HashMap<>();

    public VtagBuilder() {
    } 
    
    public VtagBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Vtag arg) {
        this._resourceId = arg.getResourceId();
        this._tag = arg.getTag();
    }

    public VtagBuilder(Vtag base) {
        this._resourceId = base.getResourceId();
        this._tag = base.getTag();
        if (base instanceof VtagImpl) {
            VtagImpl _impl = (VtagImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Vtag</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Vtag) {
            this._resourceId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Vtag)arg).getResourceId();
            this._tag = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Vtag)arg).getTag();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Vtag] \n" +
              "but was: " + arg
            );
        }
    }

    public ResourceId getResourceId() {
        return _resourceId;
    }
    
    public TagString getTag() {
        return _tag;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public VtagBuilder setResourceId(ResourceId value) {
        this._resourceId = value;
        return this;
    }
    
    public VtagBuilder setTag(TagString value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue().length());
            boolean isValidLength = false;
            for (Range<BigInteger> r : _tag_length()) {
                if (r.contains(_constraint)) {
                    isValidLength = true;
                }
            }
            if (!isValidLength) {
                throw new IllegalArgumentException(String.format("Invalid length: %s, expected: %s.", value, _tag_length));
            }
        }
        this._tag = value;
        return this;
    }
    public static List<Range<BigInteger>> _tag_length() {
        if (_tag_length == null) {
            synchronized (VtagBuilder.class) {
                if (_tag_length == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ONE, BigInteger.valueOf(64L)));
                    _tag_length = builder.build();
                }
            }
        }
        return _tag_length;
    }
    
    public VtagBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Vtag build() {
        return new VtagImpl(this);
    }

    private static final class VtagImpl implements Vtag {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag.class;
        }

        private final ResourceId _resourceId;
        private final TagString _tag;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag>> augmentation = new HashMap<>();

        private VtagImpl(VtagBuilder base) {
            this._resourceId = base.getResourceId();
            this._tag = base.getTag();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public ResourceId getResourceId() {
            return _resourceId;
        }
        
        @Override
        public TagString getTag() {
            return _tag;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_resourceId == null) ? 0 : _resourceId.hashCode());
            result = prime * result + ((_tag == null) ? 0 : _tag.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag)obj;
            if (_resourceId == null) {
                if (other.getResourceId() != null) {
                    return false;
                }
            } else if(!_resourceId.equals(other.getResourceId())) {
                return false;
            }
            if (_tag == null) {
                if (other.getTag() != null) {
                    return false;
                }
            } else if(!_tag.equals(other.getTag())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VtagImpl otherImpl = (VtagImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Vtag [");
            boolean first = true;
        
            if (_resourceId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_resourceId=");
                builder.append(_resourceId);
             }
            if (_tag != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tag=");
                builder.append(_tag);
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
