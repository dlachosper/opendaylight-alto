package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.data.NetworkMap;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;


/**
 * Network map. RFC7285 Sec. 11.2.1.6.object { NetworkMapData network-map; } 
 * InfoResourceNetworkMap : ResponseEntityBase;
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * grouping network-map-data {
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
 *                 type ip-prefix;
 *             }
 *         }
 *         uses endpoint-address-group;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/network-map-data</i>
 */
public interface NetworkMapData
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","network-map-data");;

    /**
     * RFC7285 Sec. 11.2.1.6. object-map { PIDName -> EndpointAddrGroup; } 
     * NetworkMapData;
     */
    List<NetworkMap> getNetworkMap();

}

