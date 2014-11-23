package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output;
import com.google.common.collect.Range;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ResourceId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.TagString;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.Meta;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService
 */
public class FilteredCostMapServiceBuilder {

    private List<Map> _map;
    private Meta _meta;
    private ResourceId _resourceId;
    private TagString _tag;
    private static List<Range<BigInteger>> _tag_length;

    java.util.Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService>> augmentation = new HashMap<>();

    public FilteredCostMapServiceBuilder() {
    } 
    
    public FilteredCostMapServiceBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.CostMap arg) {
        this._resourceId = arg.getResourceId();
        this._tag = arg.getTag();
        this._meta = arg.getMeta();
        this._map = arg.getMap();
    }
    
    public FilteredCostMapServiceBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.CostMapData arg) {
        this._map = arg.getMap();
    }

    public FilteredCostMapServiceBuilder(FilteredCostMapService base) {
        this._map = base.getMap();
        this._meta = base.getMeta();
        this._resourceId = base.getResourceId();
        this._tag = base.getTag();
        if (base instanceof FilteredCostMapServiceImpl) {
            FilteredCostMapServiceImpl _impl = (FilteredCostMapServiceImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.CostMap</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.CostMapData</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.CostMap) {
            this._resourceId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.CostMap)arg).getResourceId();
            this._tag = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.CostMap)arg).getTag();
            this._meta = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.CostMap)arg).getMeta();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.CostMapData) {
            this._map = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.CostMapData)arg).getMap();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.CostMap, org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.CostMapData] \n" +
              "but was: " + arg
            );
        }
    }

    public List<Map> getMap() {
        return _map;
    }
    
    public Meta getMeta() {
        return _meta;
    }
    
    public ResourceId getResourceId() {
        return _resourceId;
    }
    
    public TagString getTag() {
        return _tag;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public FilteredCostMapServiceBuilder setMap(List<Map> value) {
        this._map = value;
        return this;
    }
    
    public FilteredCostMapServiceBuilder setMeta(Meta value) {
        this._meta = value;
        return this;
    }
    
    public FilteredCostMapServiceBuilder setResourceId(ResourceId value) {
        this._resourceId = value;
        return this;
    }
    
    public FilteredCostMapServiceBuilder setTag(TagString value) {
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
            synchronized (FilteredCostMapServiceBuilder.class) {
                if (_tag_length == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ONE, BigInteger.valueOf(64L)));
                    _tag_length = builder.build();
                }
            }
        }
        return _tag_length;
    }
    
    public FilteredCostMapServiceBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public FilteredCostMapService build() {
        return new FilteredCostMapServiceImpl(this);
    }

    private static final class FilteredCostMapServiceImpl implements FilteredCostMapService {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService.class;
        }

        private final List<Map> _map;
        private final Meta _meta;
        private final ResourceId _resourceId;
        private final TagString _tag;

        private java.util.Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService>> augmentation = new HashMap<>();

        private FilteredCostMapServiceImpl(FilteredCostMapServiceBuilder base) {
            this._map = base.getMap();
            this._meta = base.getMeta();
            this._resourceId = base.getResourceId();
            this._tag = base.getTag();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final java.util.Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<Map> getMap() {
            return _map;
        }
        
        @Override
        public Meta getMeta() {
            return _meta;
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
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_map == null) ? 0 : _map.hashCode());
            result = prime * result + ((_meta == null) ? 0 : _meta.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService)obj;
            if (_map == null) {
                if (other.getMap() != null) {
                    return false;
                }
            } else if(!_map.equals(other.getMap())) {
                return false;
            }
            if (_meta == null) {
                if (other.getMeta() != null) {
                    return false;
                }
            } else if(!_meta.equals(other.getMeta())) {
                return false;
            }
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
                FilteredCostMapServiceImpl otherImpl = (FilteredCostMapServiceImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (java.util.Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("FilteredCostMapService [");
            boolean first = true;
        
            if (_map != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_map=");
                builder.append(_map);
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
