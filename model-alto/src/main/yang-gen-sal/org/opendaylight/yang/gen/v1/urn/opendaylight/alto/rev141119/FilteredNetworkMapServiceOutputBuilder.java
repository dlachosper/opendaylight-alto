package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.network.map.service.output.FilteredNetworkMapService;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput
 */
public class FilteredNetworkMapServiceOutputBuilder {

    private FilteredNetworkMapService _filteredNetworkMapService;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput>> augmentation = new HashMap<>();

    public FilteredNetworkMapServiceOutputBuilder() {
    } 

    public FilteredNetworkMapServiceOutputBuilder(FilteredNetworkMapServiceOutput base) {
        this._filteredNetworkMapService = base.getFilteredNetworkMapService();
        if (base instanceof FilteredNetworkMapServiceOutputImpl) {
            FilteredNetworkMapServiceOutputImpl _impl = (FilteredNetworkMapServiceOutputImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public FilteredNetworkMapService getFilteredNetworkMapService() {
        return _filteredNetworkMapService;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public FilteredNetworkMapServiceOutputBuilder setFilteredNetworkMapService(FilteredNetworkMapService value) {
        this._filteredNetworkMapService = value;
        return this;
    }
    
    public FilteredNetworkMapServiceOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public FilteredNetworkMapServiceOutput build() {
        return new FilteredNetworkMapServiceOutputImpl(this);
    }

    private static final class FilteredNetworkMapServiceOutputImpl implements FilteredNetworkMapServiceOutput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput.class;
        }

        private final FilteredNetworkMapService _filteredNetworkMapService;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput>> augmentation = new HashMap<>();

        private FilteredNetworkMapServiceOutputImpl(FilteredNetworkMapServiceOutputBuilder base) {
            this._filteredNetworkMapService = base.getFilteredNetworkMapService();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public FilteredNetworkMapService getFilteredNetworkMapService() {
            return _filteredNetworkMapService;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_filteredNetworkMapService == null) ? 0 : _filteredNetworkMapService.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput)obj;
            if (_filteredNetworkMapService == null) {
                if (other.getFilteredNetworkMapService() != null) {
                    return false;
                }
            } else if(!_filteredNetworkMapService.equals(other.getFilteredNetworkMapService())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FilteredNetworkMapServiceOutputImpl otherImpl = (FilteredNetworkMapServiceOutputImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("FilteredNetworkMapServiceOutput [");
            boolean first = true;
        
            if (_filteredNetworkMapService != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_filteredNetworkMapService=");
                builder.append(_filteredNetworkMapService);
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
