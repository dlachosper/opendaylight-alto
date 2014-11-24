package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;


/**
 * EndpointAddrGroup. RFC7285 Sec. 10.4.5. object-map { AddressType -> 
 * endpoint-prefix<0..*>; } EndpointAddrGroup;
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * grouping endpoint-address-group {
 *     list endpoint-address-group {
 *         key "address-type"
 *         leaf address-type {
 *             type endpoint-address-type;
 *         }
 *         leaf-list endpoint-prefix {
 *             type ip-prefix;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/endpoint-address-group</i>
 */
public interface EndpointAddressGroup
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","endpoint-address-group");;

    List<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.address.group.EndpointAddressGroup> getEndpointAddressGroup();

}

