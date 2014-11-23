package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps;
import com.google.common.collect.Range;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ResourceId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMapKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.TagString;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap
 */
public class NetworkMapBuilder {

    private NetworkMapKey _key;
    private List<Map> _map;
    private ResourceId _resourceId;
    private TagString _tag;
    private static List<Range<BigInteger>> _tag_length;

    java.util.Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap>> augmentation = new HashMap<>();

    public NetworkMapBuilder() {
    } 
    
    public NetworkMapBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.NetworkMap arg) {
        this._resourceId = arg.getResourceId();
        this._tag = arg.getTag();
        this._map = arg.getMap();
    }
    
    public NetworkMapBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.NetworkMapData arg) {
        this._map = arg.getMap();
    }

    public NetworkMapBuilder(NetworkMap base) {
        if (base.getKey() == null) {
            this._key = new NetworkMapKey(
                base.getResourceId()
            );
            this._resourceId = base.getResourceId();
        } else {
            this._key = base.getKey();
            this._resourceId = _key.getResourceId();
        }
        this._map = base.getMap();
        this._tag = base.getTag();
        if (base instanceof NetworkMapImpl) {
            NetworkMapImpl _impl = (NetworkMapImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.NetworkMap</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.NetworkMapData</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.NetworkMap) {
            this._resourceId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.NetworkMap)arg).getResourceId();
            this._tag = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.NetworkMap)arg).getTag();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.NetworkMapData) {
            this._map = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.NetworkMapData)arg).getMap();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.NetworkMap, org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.NetworkMapData] \n" +
              "but was: " + arg
            );
        }
    }

    public NetworkMapKey getKey() {
        return _key;
    }
    
    public List<Map> getMap() {
        return _map;
    }
    
    public ResourceId getResourceId() {
        return _resourceId;
    }
    
    public TagString getTag() {
        return _tag;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public NetworkMapBuilder setKey(NetworkMapKey value) {
        this._key = value;
        return this;
    }
    
    public NetworkMapBuilder setMap(List<Map> value) {
        this._map = value;
        return this;
    }
    
    public NetworkMapBuilder setResourceId(ResourceId value) {
        this._resourceId = value;
        return this;
    }
    
    public NetworkMapBuilder setTag(TagString value) {
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
            synchronized (NetworkMapBuilder.class) {
                if (_tag_length == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ONE, BigInteger.valueOf(64L)));
                    _tag_length = builder.build();
                }
            }
        }
        return _tag_length;
    }
    
    public NetworkMapBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public NetworkMap build() {
        return new NetworkMapImpl(this);
    }

    private static final class NetworkMapImpl implements NetworkMap {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap.class;
        }

        private final NetworkMapKey _key;
        private final List<Map> _map;
        private final ResourceId _resourceId;
        private final TagString _tag;

        private java.util.Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap>> augmentation = new HashMap<>();

        private NetworkMapImpl(NetworkMapBuilder base) {
            if (base.getKey() == null) {
                this._key = new NetworkMapKey(
                    base.getResourceId()
                );
                this._resourceId = base.getResourceId();
            } else {
                this._key = base.getKey();
                this._resourceId = _key.getResourceId();
            }
            this._map = base.getMap();
            this._tag = base.getTag();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final java.util.Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public NetworkMapKey getKey() {
            return _key;
        }
        
        @Override
        public List<Map> getMap() {
            return _map;
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
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_map == null) ? 0 : _map.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap)obj;
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_map == null) {
                if (other.getMap() != null) {
                    return false;
                }
            } else if(!_map.equals(other.getMap())) {
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
                NetworkMapImpl otherImpl = (NetworkMapImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (java.util.Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("NetworkMap [");
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
            if (_map != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_map=");
                builder.append(_map);
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
