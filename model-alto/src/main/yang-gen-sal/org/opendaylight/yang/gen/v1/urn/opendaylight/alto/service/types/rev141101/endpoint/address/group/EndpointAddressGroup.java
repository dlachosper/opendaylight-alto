package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointAddressType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPrefix;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroupKey;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * list endpoint-address-group {
 *     key "address-type"
 *     leaf address-type {
 *         type endpoint-address-type;
 *     }
 *     leaf-list endpoint-prefix {
 *         type endpoint-prefix;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/endpoint-address-group/endpoint-address-group</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroupBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroupBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroupKey
 */
public interface EndpointAddressGroup
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointAddressGroup>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup>,
    Identifiable<EndpointAddressGroupKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","endpoint-address-group");;

    EndpointAddressType getAddressType();
    
    List<EndpointPrefix> getEndpointPrefix();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    EndpointAddressGroupKey getKey();

}

