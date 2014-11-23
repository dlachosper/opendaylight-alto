package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.AltoServiceData;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.resources.NetworkMaps;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service</b>
 * <br />(Source path: <i>META-INF/yang/alto-service.yang</i>):
 * <pre>
 * container resources {
 *     leaf teststring {
 *         type string;
 *     }
 *     leaf testdatastring {
 *         type string;
 *     }
 *     container network-maps {
 *         list network-map {
 *             key "resource-id"
 *             leaf resource-id {
 *                 type resource-id;
 *             }
 *             leaf tag {
 *                 type tag-string;
 *             }
 *             list map {
 *                 key "pid"
 *                 leaf pid {
 *                     type pid-name;
 *                 }
 *                 list endpoint-address-group {
 *                     key "address-type"
 *                     leaf address-type {
 *                         type endpoint-address-type;
 *                     }
 *                     leaf-list endpoint-prefix {
 *                         type endpoint-prefix;
 *                     }
 *                 }
 *                 uses endpoint-address-group;
 *             }
 *             uses network-map;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service/resources</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.ResourcesBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.ResourcesBuilder
 */
public interface Resources
    extends
    ChildOf<AltoServiceData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto","2014-11-19","resources");;

    java.lang.String getTeststring();
    
    java.lang.String getTestdatastring();
    
    NetworkMaps getNetworkMaps();

}

