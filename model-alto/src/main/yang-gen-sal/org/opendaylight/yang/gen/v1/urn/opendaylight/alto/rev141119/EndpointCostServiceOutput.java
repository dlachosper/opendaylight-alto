package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.cost.service.output.EndpointCostService;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service</b>
 * <br />(Source path: <i>META-INF/yang/alto-service.yang</i>):
 * <pre>
 * container output {
 *     container endpoint-cost-service {
 *         container meta {
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
 *         }
 *         list endpoint-cost-map {
 *             key "src"
 *             leaf src {
 *                 type typed-endpoint-address;
 *             }
 *             list dst-costs {
 *                 key "dst"
 *                 leaf dst {
 *                     type typed-endpoint-address;
 *                 }
 *                 anyxml cost;
 *                 uses alto-cost;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service/endpoint-cost-service/output</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutputBuilder
 */
public interface EndpointCostServiceOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto","2014-11-19","output");;

    EndpointCostService getEndpointCostService();

}

