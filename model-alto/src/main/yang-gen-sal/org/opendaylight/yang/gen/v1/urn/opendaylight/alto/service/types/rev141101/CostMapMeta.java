package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.meta.CostType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.DependentVtags;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * grouping cost-map-meta {
 *     list dependent-vtags {
 *         key     leaf resource-id {
 *             type resource-id;
 *         }
 *         leaf tag {
 *             type tag-string;
 *         }
 *         uses vtag;
 *     }
 *     container cost-type {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/cost-map-meta</i>
 */
public interface CostMapMeta
    extends
    DataObject,
    DependentVtags
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","cost-map-meta");;

    CostType getCostType();

}

