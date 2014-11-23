package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpPrefix;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv4Prefix;
import java.io.Serializable;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv6Prefix;


/**
 * endpoint prefix, identical to ip-prefix defined in RFC6991.
 */
public class EndpointPrefix extends IpPrefix
 implements Serializable {
    private static final long serialVersionUID = -7490827377348664664L; 
    
    public EndpointPrefix(Ipv4Prefix _ipv4Prefix) {
        super(_ipv4Prefix);
    }
    
    public EndpointPrefix(Ipv6Prefix _ipv6Prefix) {
        super(_ipv6Prefix);
    }
    
    public EndpointPrefix(char[] _value) {
        super(_value);
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public EndpointPrefix(EndpointPrefix source) {
        super(source);
    }
    /**
     * Creates a new instance from IpPrefix
     *
     * @param source Source object
     */
    public EndpointPrefix(IpPrefix source) {
            super(source);
    }








}
