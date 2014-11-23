package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;


/**
 * RFC 7285 Sec. 9.2.2.object-map { JSONString -> CostType; } IRDMetaCostTypes;
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * grouping cost-types {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/cost-types</i>
 */
public interface CostTypes
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","cost-types");;

    List<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.types.CostTypes> getCostTypes();

}

