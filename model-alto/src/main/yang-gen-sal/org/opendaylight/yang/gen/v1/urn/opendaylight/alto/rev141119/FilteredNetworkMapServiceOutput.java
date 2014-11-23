package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.network.map.service.output.FilteredNetworkMapService;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service</b>
 * <br />(Source path: <i>META-INF/yang/alto-service.yang</i>):
 * <pre>
 * container output {
 *     container filtered-network-map-service {
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
 * <i>alto-service/filtered-network-map-service/output</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutputBuilder
 */
public interface FilteredNetworkMapServiceOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto","2014-11-19","output");;

    FilteredNetworkMapService getFilteredNetworkMapService();

}

