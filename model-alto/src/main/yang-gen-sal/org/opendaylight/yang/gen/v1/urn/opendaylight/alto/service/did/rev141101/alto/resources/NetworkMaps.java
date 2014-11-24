package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.AltoResources;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.network.maps.NetworkMap;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-did</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-did.yang</i>):
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
 *                     type ip-prefix;
 *                 }
 *             }
 *             uses endpoint-address-group;
 *         }
 *         uses network-map;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-did/alto-resources/network-maps</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.NetworkMapsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.NetworkMapsBuilder
 */
public interface NetworkMaps
    extends
    ChildOf<AltoResources>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.NetworkMaps>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-did","2014-11-01","network-maps");;

    List<NetworkMap> getNetworkMap();

}

