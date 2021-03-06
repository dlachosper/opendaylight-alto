package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.output.FilteredCostMapService;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service</b>
 * <br />(Source path: <i>META-INF/yang/alto-service.yang</i>):
 * <pre>
 * container output {
 *     container filtered-cost-map-service {
 *         leaf resource-id {
 *             type resource-id;
 *         }
 *         leaf tag {
 *             type tag-string;
 *         }
 *         container meta {
 *             list dependent-vtags {
 *                 key     leaf resource-id {
 *                     type resource-id;
 *                 }
 *                 leaf tag {
 *                     type tag-string;
 *                 }
 *                 uses vtag;
 *             }
 *             container cost-type {
 *                 leaf cost-mode {
 *                     type cost-mode;
 *                 }
 *                 leaf cost-metric {
 *                     type cost-metric;
 *                 }
 *                 leaf description {
 *                     type string;
 *                 }
 *                 uses cost-type;
 *             }
 *             uses cost-map-meta;
 *         }
 *         list map {
 *             key "src"
 *             leaf src {
 *                 type pid-name;
 *             }
 *             list dst-costs {
 *                 key "dst"
 *                 leaf dst {
 *                     type pid-name;
 *                 }
 *                 anyxml cost;
 *                 uses alto-cost;
 *             }
 *         }
 *         uses cost-map;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service/filtered-cost-map-service/output</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutputBuilder
 */
public interface FilteredCostMapServiceOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto","2014-11-19","output");;

    FilteredCostMapService getFilteredCostMapService();

}

