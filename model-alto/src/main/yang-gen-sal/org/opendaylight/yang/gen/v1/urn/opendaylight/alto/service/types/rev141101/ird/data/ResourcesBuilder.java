package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.MediaType;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ResourceId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.ResourcesKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources
 */
public class ResourcesBuilder {

    private List<MediaType> _accepts;
    private Capabilities _capabilities;
    private ResourcesKey _key;
    private MediaType _mediaType;
    private ResourceId _resourceId;
    private Uri _uri;
    private List<ResourceId> _uses;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources>> augmentation = new HashMap<>();

    public ResourcesBuilder() {
    } 
    
    public ResourcesBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Uses arg) {
        this._uses = arg.getUses();
    }
    
    public ResourcesBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Accepts arg) {
        this._accepts = arg.getAccepts();
    }
    
    public ResourcesBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDCapabilities arg) {
        this._capabilities = arg.getCapabilities();
    }

    public ResourcesBuilder(Resources base) {
        if (base.getKey() == null) {
            this._key = new ResourcesKey(
                base.getResourceId()
            );
            this._resourceId = base.getResourceId();
        } else {
            this._key = base.getKey();
            this._resourceId = _key.getResourceId();
        }
        this._accepts = base.getAccepts();
        this._capabilities = base.getCapabilities();
        this._mediaType = base.getMediaType();
        this._uri = base.getUri();
        this._uses = base.getUses();
        if (base instanceof ResourcesImpl) {
            ResourcesImpl _impl = (ResourcesImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Uses</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Accepts</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDCapabilities</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Uses) {
            this._uses = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Uses)arg).getUses();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Accepts) {
            this._accepts = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Accepts)arg).getAccepts();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDCapabilities) {
            this._capabilities = ((org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDCapabilities)arg).getCapabilities();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Uses, org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Accepts, org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDCapabilities] \n" +
              "but was: " + arg
            );
        }
    }

    public List<MediaType> getAccepts() {
        return _accepts;
    }
    
    public Capabilities getCapabilities() {
        return _capabilities;
    }
    
    public ResourcesKey getKey() {
        return _key;
    }
    
    public MediaType getMediaType() {
        return _mediaType;
    }
    
    public ResourceId getResourceId() {
        return _resourceId;
    }
    
    public Uri getUri() {
        return _uri;
    }
    
    public List<ResourceId> getUses() {
        return _uses;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ResourcesBuilder setAccepts(List<MediaType> value) {
        this._accepts = value;
        return this;
    }
    
    public ResourcesBuilder setCapabilities(Capabilities value) {
        this._capabilities = value;
        return this;
    }
    
    public ResourcesBuilder setKey(ResourcesKey value) {
        this._key = value;
        return this;
    }
    
    public ResourcesBuilder setMediaType(MediaType value) {
        this._mediaType = value;
        return this;
    }
    
    public ResourcesBuilder setResourceId(ResourceId value) {
        this._resourceId = value;
        return this;
    }
    
    public ResourcesBuilder setUri(Uri value) {
        this._uri = value;
        return this;
    }
    
    public ResourcesBuilder setUses(List<ResourceId> value) {
        this._uses = value;
        return this;
    }
    
    public ResourcesBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Resources build() {
        return new ResourcesImpl(this);
    }

    private static final class ResourcesImpl implements Resources {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources.class;
        }

        private final List<MediaType> _accepts;
        private final Capabilities _capabilities;
        private final ResourcesKey _key;
        private final MediaType _mediaType;
        private final ResourceId _resourceId;
        private final Uri _uri;
        private final List<ResourceId> _uses;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources>> augmentation = new HashMap<>();

        private ResourcesImpl(ResourcesBuilder base) {
            if (base.getKey() == null) {
                this._key = new ResourcesKey(
                    base.getResourceId()
                );
                this._resourceId = base.getResourceId();
            } else {
                this._key = base.getKey();
                this._resourceId = _key.getResourceId();
            }
            this._accepts = base.getAccepts();
            this._capabilities = base.getCapabilities();
            this._mediaType = base.getMediaType();
            this._uri = base.getUri();
            this._uses = base.getUses();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<MediaType> getAccepts() {
            return _accepts;
        }
        
        @Override
        public Capabilities getCapabilities() {
            return _capabilities;
        }
        
        @Override
        public ResourcesKey getKey() {
            return _key;
        }
        
        @Override
        public MediaType getMediaType() {
            return _mediaType;
        }
        
        @Override
        public ResourceId getResourceId() {
            return _resourceId;
        }
        
        @Override
        public Uri getUri() {
            return _uri;
        }
        
        @Override
        public List<ResourceId> getUses() {
            return _uses;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_accepts == null) ? 0 : _accepts.hashCode());
            result = prime * result + ((_capabilities == null) ? 0 : _capabilities.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_mediaType == null) ? 0 : _mediaType.hashCode());
            result = prime * result + ((_resourceId == null) ? 0 : _resourceId.hashCode());
            result = prime * result + ((_uri == null) ? 0 : _uri.hashCode());
            result = prime * result + ((_uses == null) ? 0 : _uses.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources)obj;
            if (_accepts == null) {
                if (other.getAccepts() != null) {
                    return false;
                }
            } else if(!_accepts.equals(other.getAccepts())) {
                return false;
            }
            if (_capabilities == null) {
                if (other.getCapabilities() != null) {
                    return false;
                }
            } else if(!_capabilities.equals(other.getCapabilities())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_mediaType == null) {
                if (other.getMediaType() != null) {
                    return false;
                }
            } else if(!_mediaType.equals(other.getMediaType())) {
                return false;
            }
            if (_resourceId == null) {
                if (other.getResourceId() != null) {
                    return false;
                }
            } else if(!_resourceId.equals(other.getResourceId())) {
                return false;
            }
            if (_uri == null) {
                if (other.getUri() != null) {
                    return false;
                }
            } else if(!_uri.equals(other.getUri())) {
                return false;
            }
            if (_uses == null) {
                if (other.getUses() != null) {
                    return false;
                }
            } else if(!_uses.equals(other.getUses())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ResourcesImpl otherImpl = (ResourcesImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Resources [");
            boolean first = true;
        
            if (_accepts != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_accepts=");
                builder.append(_accepts);
             }
            if (_capabilities != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_capabilities=");
                builder.append(_capabilities);
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
            if (_mediaType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_mediaType=");
                builder.append(_mediaType);
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
            if (_uri != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_uri=");
                builder.append(_uri);
             }
            if (_uses != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_uses=");
                builder.append(_uses);
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
