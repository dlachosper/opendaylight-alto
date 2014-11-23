package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ValidIdString;
import java.io.Serializable;
import java.beans.ConstructorProperties;


/**
 * Name for the PID.RFC7285, Section 10.1. Note: the '.' separator MUST NOT beused unless specifically indicated in RFC7285 or an extension document.
 */
public class PidName extends ValidIdString
 implements Serializable {
    private static final long serialVersionUID = 795274246856892845L; 
    
    @ConstructorProperties("value")
    public PidName(java.lang.String _value) {
        super(_value);
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PidName(PidName source) {
        super(source);
    }
    /**
     * Creates a new instance from ValidIdString
     *
     * @param source Source object
     */
    public PidName(ValidIdString source) {
            super(source);
    }

    public static PidName getDefaultInstance(String defaultValue) {
        return new PidName(defaultValue);
    }







}
