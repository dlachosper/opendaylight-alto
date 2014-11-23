package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ValidIdString;
import java.io.Serializable;
import java.beans.ConstructorProperties;


public class CostTypeName extends ValidIdString
 implements Serializable {
    private static final long serialVersionUID = 1654856162840764626L; 
    
    @ConstructorProperties("value")
    public CostTypeName(java.lang.String _value) {
        super(_value);
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public CostTypeName(CostTypeName source) {
        super(source);
    }
    /**
     * Creates a new instance from ValidIdString
     *
     * @param source Source object
     */
    public CostTypeName(ValidIdString source) {
            super(source);
    }

    public static CostTypeName getDefaultInstance(String defaultValue) {
        return new CostTypeName(defaultValue);
    }







}
