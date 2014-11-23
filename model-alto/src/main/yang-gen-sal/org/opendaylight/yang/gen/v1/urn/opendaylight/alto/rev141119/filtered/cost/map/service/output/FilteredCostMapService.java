package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.CostMap;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service</b>
 * <br />(Source path: <i>META-INF/yang/alto-service.yang</i>):
 * <pre>
 * container filtered-cost-map-service {
 *     leaf resource-id {
 *         type resource-id;
 *     }
 *     leaf tag {
 *         type tag-string;
 *     }
 *     container meta {
 *         list dependent-vtags {
 *             key     leaf resource-id {
 *                 type resource-id;
 *             }
 *             leaf tag {
 *                 type tag-string;
 *             }
 *             uses vtag;
 *         }
 *         container cost-type {
 *             leaf cost-mode {
 *                 type cost-mode;
 *             }
 *             leaf cost-metric {
 *                 type cost-metric;
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             uses cost-type;
 *         }
 *         uses cost-map-meta;
 *     }
 *     list map {
 *         key "src"
 *         leaf src {
 *             type pid-name;
 *         }
 *         list dst-costs {
 *             key "dst"
 *             leaf dst {
 *                 type pid-name;
 *             }
 *             anyxml cost;
 *             uses alto-cost;
 *         }
 *     }
 *     uses cost-map;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service/filtered-cost-map-service/output/filtered-cost-map-service</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapServiceBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapServiceBuilder
 */
public interface FilteredCostMapService
    extends
    ChildOf<FilteredCostMapServiceOutput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService>,
    CostMap
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto","2014-11-19","filtered-cost-map-service");;


}

