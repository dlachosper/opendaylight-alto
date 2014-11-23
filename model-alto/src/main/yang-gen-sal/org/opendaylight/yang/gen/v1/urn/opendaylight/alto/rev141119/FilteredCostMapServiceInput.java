package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ResourceId;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Constraint;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.input.CostType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.input.Pids;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service</b>
 * <br />(Source path: <i>META-INF/yang/alto-service.yang</i>):
 * <pre>
 * container input {
 *     leaf resource-id {
 *         type resource-id;
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
 *     leaf-list constraints {
 *         type constraint;
 *     }
 *     container pids {
 *         leaf-list srcs {
 *             type pid-name;
 *         }
 *         leaf-list dsts {
 *             type pid-name;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service/filtered-cost-map-service/input</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInputBuilder
 */
public interface FilteredCostMapServiceInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto","2014-11-19","input");;

    ResourceId getResourceId();
    
    CostType getCostType();
    
    List<Constraint> getConstraints();
    
    Pids getPids();

}

