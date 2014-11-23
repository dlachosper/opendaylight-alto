package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.NetworkMaps;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources
 */
public class ResourcesBuilder {

    private NetworkMaps _networkMaps;
    private java.lang.String _testdatastring;
    private java.lang.String _teststring;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources>> augmentation = new HashMap<>();

    public ResourcesBuilder() {
    } 

    public ResourcesBuilder(Resources base) {
        this._networkMaps = base.getNetworkMaps();
        this._testdatastring = base.getTestdatastring();
        this._teststring = base.getTeststring();
        if (base instanceof ResourcesImpl) {
            ResourcesImpl _impl = (ResourcesImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public NetworkMaps getNetworkMaps() {
        return _networkMaps;
    }
    
    public java.lang.String getTestdatastring() {
        return _testdatastring;
    }
    
    public java.lang.String getTeststring() {
        return _teststring;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ResourcesBuilder setNetworkMaps(NetworkMaps value) {
        this._networkMaps = value;
        return this;
    }
    
    public ResourcesBuilder setTestdatastring(java.lang.String value) {
        this._testdatastring = value;
        return this;
    }
    
    public ResourcesBuilder setTeststring(java.lang.String value) {
        this._teststring = value;
        return this;
    }
    
    public ResourcesBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Resources build() {
        return new ResourcesImpl(this);
    }

    private static final class ResourcesImpl implements Resources {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources.class;
        }

        private final NetworkMaps _networkMaps;
        private final java.lang.String _testdatastring;
        private final java.lang.String _teststring;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources>> augmentation = new HashMap<>();

        private ResourcesImpl(ResourcesBuilder base) {
            this._networkMaps = base.getNetworkMaps();
            this._testdatastring = base.getTestdatastring();
            this._teststring = base.getTeststring();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public NetworkMaps getNetworkMaps() {
            return _networkMaps;
        }
        
        @Override
        public java.lang.String getTestdatastring() {
            return _testdatastring;
        }
        
        @Override
        public java.lang.String getTeststring() {
            return _teststring;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_networkMaps == null) ? 0 : _networkMaps.hashCode());
            result = prime * result + ((_testdatastring == null) ? 0 : _testdatastring.hashCode());
            result = prime * result + ((_teststring == null) ? 0 : _teststring.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources)obj;
            if (_networkMaps == null) {
                if (other.getNetworkMaps() != null) {
                    return false;
                }
            } else if(!_networkMaps.equals(other.getNetworkMaps())) {
                return false;
            }
            if (_testdatastring == null) {
                if (other.getTestdatastring() != null) {
                    return false;
                }
            } else if(!_testdatastring.equals(other.getTestdatastring())) {
                return false;
            }
            if (_teststring == null) {
                if (other.getTeststring() != null) {
                    return false;
                }
            } else if(!_teststring.equals(other.getTeststring())) {
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
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources>> e : augmentation.entrySet()) {
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
        
            if (_networkMaps != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_networkMaps=");
                builder.append(_networkMaps);
             }
            if (_testdatastring != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_testdatastring=");
                builder.append(_testdatastring);
             }
            if (_teststring != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_teststring=");
                builder.append(_teststring);
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
