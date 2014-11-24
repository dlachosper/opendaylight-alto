package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.data;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.PidName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.data.NetworkMapKey;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.NetworkMapData;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointAddressGroup;


/**
 * RFC7285 Sec. 11.2.1.6. object-map { PIDName -> EndpointAddrGroup; } 
 * NetworkMapData;
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * list network-map {
 *     key "pid"
 *     leaf pid {
 *         type pid-name;
 *     }
 *     list endpoint-address-group {
 *         key "address-type"
 *         leaf address-type {
 *             type endpoint-address-type;
 *         }
 *         leaf-list endpoint-prefix {
 *             type ip-prefix;
 *         }
 *     }
 *     uses endpoint-address-group;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/network-map-data/network-map</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.data.NetworkMapBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.data.NetworkMapBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.data.NetworkMapKey
 */
public interface NetworkMap
    extends
    ChildOf<NetworkMapData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.data.NetworkMap>,
    EndpointAddressGroup,
    Identifiable<NetworkMapKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","network-map");;

    PidName getPid();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    NetworkMapKey getKey();

}

