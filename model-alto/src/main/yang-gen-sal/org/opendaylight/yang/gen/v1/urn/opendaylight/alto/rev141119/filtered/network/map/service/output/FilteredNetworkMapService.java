package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.network.map.service.output;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.NetworkMap;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service</b>
 * <br />(Source path: <i>META-INF/yang/alto-service.yang</i>):
 * <pre>
 * container filtered-network-map-service {
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
 *                 type ip-prefix;
 *             }
 *         }
 *         uses endpoint-address-group;
 *     }
 *     uses network-map;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service/filtered-network-map-service/output/filtered-network-map-service</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.network.map.service.output.FilteredNetworkMapServiceBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.network.map.service.output.FilteredNetworkMapServiceBuilder
 */
public interface FilteredNetworkMapService
    extends
    ChildOf<FilteredNetworkMapServiceOutput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.network.map.service.output.FilteredNetworkMapService>,
    NetworkMap
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto","2014-11-19","filtered-network-map-service");;


}

