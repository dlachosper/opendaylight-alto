package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service</b>
 * <br />(Source path: <i>META-INF/yang/alto-service.yang</i>):
 * <pre>
 * container cost-type {
 *     leaf cost-mode {
 *         type cost-mode;
 *     }
 *     leaf cost-metric {
 *         type cost-metric;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     uses cost-type;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service/endpoint-cost-service/output/endpoint-cost-service/meta/cost-type</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostTypeBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostTypeBuilder
 */
public interface CostType
    extends
    ChildOf<Meta>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.meta.CostType>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostType
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto","2014-11-19","cost-type");;


}

