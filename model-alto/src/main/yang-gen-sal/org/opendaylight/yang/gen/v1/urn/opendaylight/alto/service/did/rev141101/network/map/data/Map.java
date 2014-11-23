package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.PidName;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.NetworkMapData;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.MapKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointAddressGroup;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-did</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-did.yang</i>):
 * <pre>
 * list map {
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
 *             type endpoint-prefix;
 *         }
 *     }
 *     uses endpoint-address-group;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-did/network-map-data/map</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.MapBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.MapBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.MapKey
 */
public interface Map
    extends
    ChildOf<NetworkMapData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.network.map.data.Map>,
    EndpointAddressGroup,
    Identifiable<MapKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-did","2014-11-01","map");;

    PidName getPid();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    MapKey getKey();

}

