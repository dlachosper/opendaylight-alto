package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMapKey;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.NetworkMaps;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service</b>
 * <br />(Source path: <i>META-INF/yang/alto-service.yang</i>):
 * <pre>
 * list network-map {
 *     key "resource-id"
 *     leaf resource-id {
 *         type resource-id;
 *     }
 *     leaf tag {
 *         type tag-string;
 *     }
 *     list map {
 *         key "pid"
 *         leaf pid {
 *             type pid-name;
 *         }
 *         list endpoint-address-group {
 *             key "address-type"
 *             leaf address-type {
 *                 type endpoint-address-type;
 *             }
 *             leaf-list endpoint-prefix {
 *                 type endpoint-prefix;
 *             }
 *         }
 *         uses endpoint-address-group;
 *     }
 *     uses network-map;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service/resources/network-maps/network-map</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMapBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMapBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMapKey
 */
public interface NetworkMap
    extends
    ChildOf<NetworkMaps>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.NetworkMap,
    Identifiable<NetworkMapKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto","2014-11-19","network-map");;

    /**
     * Returns Primary Key of Yang List Type
     */
    NetworkMapKey getKey();

}

