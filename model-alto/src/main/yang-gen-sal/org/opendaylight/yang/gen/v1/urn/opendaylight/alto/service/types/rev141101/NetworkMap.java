package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.NetworkMapData;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.Meta;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * grouping network-map {
 *     container meta {
 *         container vtag {
 *             leaf resource-id {
 *                 type resource-id;
 *             }
 *             leaf tag {
 *                 type tag-string;
 *             }
 *             uses vtag;
 *         }
 *         uses network-map-meta;
 *     }
 *     list network-map {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/network-map</i>
 */
public interface NetworkMap
    extends
    DataObject,
    NetworkMapData
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","network-map");;

    Meta getMeta();

}

