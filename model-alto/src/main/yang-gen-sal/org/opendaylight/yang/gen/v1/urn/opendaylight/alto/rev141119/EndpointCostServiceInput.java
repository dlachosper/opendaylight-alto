package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.Endpoints;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Constraint;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.input.CostType;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service</b>
 * <br />(Source path: <i>META-INF/yang/alto-service.yang</i>):
 * <pre>
 * container input {
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
 *     container endpoints {
 *         leaf-list srcs {
 *             type typed-endpoint-address;
 *         }
 *         leaf-list dsts {
 *             type typed-endpoint-address;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service/endpoint-cost-service/input</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInputBuilder
 */
public interface EndpointCostServiceInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto","2014-11-19","input");;

    CostType getCostType();
    
    List<Constraint> getConstraints();
    
    Endpoints getEndpoints();

}

