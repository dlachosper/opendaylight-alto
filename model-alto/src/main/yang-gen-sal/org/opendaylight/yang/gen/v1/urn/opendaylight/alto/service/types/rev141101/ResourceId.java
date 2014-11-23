package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ValidIdString;
import java.io.Serializable;
import java.beans.ConstructorProperties;


/**
 * Resource-ID.
 */
public class ResourceId extends ValidIdString
 implements Serializable {
    private static final long serialVersionUID = -2143851143186763228L; 
    
    @ConstructorProperties("value")
    public ResourceId(java.lang.String _value) {
        super(_value);
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ResourceId(ResourceId source) {
        super(source);
    }
    /**
     * Creates a new instance from ValidIdString
     *
     * @param source Source object
     */
    public ResourceId(ValidIdString source) {
            super(source);
    }

    public static ResourceId getDefaultInstance(String defaultValue) {
        return new ResourceId(defaultValue);
    }







}
