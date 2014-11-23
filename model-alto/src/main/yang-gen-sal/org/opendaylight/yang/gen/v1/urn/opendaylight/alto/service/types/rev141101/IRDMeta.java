package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostTypes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ResourceId;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * grouping IRD-meta {
 *     list cost-types {
 *         key "cost-type-name"
 *         leaf cost-type-name {
 *             type cost-type-name;
 *         }
 *         leaf cost-mode {
 *             type cost-mode;
 *         }
 *         leaf cost-metric {
 *             type cost-metric;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         uses cost-type;
 *     }
 *     leaf default-alto-network-map {
 *         type resource-id;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/IRD-meta</i>
 */
public interface IRDMeta
    extends
    DataObject,
    CostTypes
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","IRD-meta");;

    ResourceId getDefaultAltoNetworkMap();

}

