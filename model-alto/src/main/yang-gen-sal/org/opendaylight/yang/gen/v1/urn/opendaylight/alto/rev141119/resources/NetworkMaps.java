package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.network.maps.NetworkMap;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service</b>
 * <br />(Source path: <i>META-INF/yang/alto-service.yang</i>):
 * <pre>
 * container network-maps {
 *     list network-map {
 *         key "resource-id"
 *         leaf resource-id {
 *             type resource-id;
 *         }
 *         leaf tag {
 *             type tag-string;
 *         }
 *         list map {
 *             key "pid"
 *             leaf pid {
 *                 type pid-name;
 *             }
 *             list endpoint-address-group {
 *                 key "address-type"
 *                 leaf address-type {
 *                     type endpoint-address-type;
 *                 }
 *                 leaf-list endpoint-prefix {
 *                     type endpoint-prefix;
 *                 }
 *             }
 *             uses endpoint-address-group;
 *         }
 *         uses network-map;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service/resources/network-maps</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.NetworkMapsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.NetworkMapsBuilder
 */
public interface NetworkMaps
    extends
    ChildOf<Resources>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.NetworkMaps>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto","2014-11-19","network-maps");;

    List<NetworkMap> getNetworkMap();

}

