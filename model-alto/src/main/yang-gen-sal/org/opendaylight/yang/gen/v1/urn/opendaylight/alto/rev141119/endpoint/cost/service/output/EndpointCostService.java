package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.EndpointCostMap;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.endpoint.cost.service.Meta;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service</b>
 * <br />(Source path: <i>META-INF/yang/alto-service.yang</i>):
 * <pre>
 * container endpoint-cost-service {
 *     container meta {
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
 *     }
 *     list endpoint-cost-map {
 *         key "src"
 *         leaf src {
 *             type typed-endpoint-address;
 *         }
 *         list dst-costs {
 *             key "dst"
 *             leaf dst {
 *                 type typed-endpoint-address;
 *             }
 *             anyxml cost;
 *             uses alto-cost;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service/endpoint-cost-service/output/endpoint-cost-service</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.EndpointCostServiceBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.EndpointCostServiceBuilder
 */
public interface EndpointCostService
    extends
    ChildOf<EndpointCostServiceOutput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.EndpointCostService>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto","2014-11-19","endpoint-cost-service");;

    Meta getMeta();
    
    List<EndpointCostMap> getEndpointCostMap();

}

