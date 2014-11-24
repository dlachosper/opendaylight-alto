package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredNetworkMapServiceInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointCostServiceOutput;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>alto-service</b>
 * <br />(Source path: <i>META-INF/yang/alto-service.yang</i>):
 * <pre>
 * rpc endpoint-cost-service {
 *     input {
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
 *         leaf-list constraints {
 *             type constraint;
 *         }
 *         container endpoints {
 *             leaf-list srcs {
 *                 type typed-endpoint-address;
 *             }
 *             leaf-list dsts {
 *                 type typed-endpoint-address;
 *             }
 *         }
 *     }
 *     
 *     output {
 *         container endpoint-cost-service {
 *             container meta {
 *                 container cost-type {
 *                     leaf cost-mode {
 *                         type cost-mode;
 *                     }
 *                     leaf cost-metric {
 *                         type cost-metric;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     uses cost-type;
 *                 }
 *             }
 *             list endpoint-cost-map {
 *                 key "src"
 *                 leaf src {
 *                     type typed-endpoint-address;
 *                 }
 *                 list dst-costs {
 *                     key "dst"
 *                     leaf dst {
 *                         type typed-endpoint-address;
 *                     }
 *                     anyxml cost;
 *                     uses alto-cost;
 *                 }
 *             }
 *         }
 *     }
 *     status CURRENT;
 * }
 * rpc endpoint-property-service {
 *     input {
 *         leaf-list properties {
 *             type endpoint-property-type;
 *         }
 *         leaf-list endpoints {
 *             type typed-endpoint-address;
 *         }
 *     }
 *     
 *     output {
 *         container endpoint-property-service {
 *             container meta {
 *                 list dependent-vtags {
 *                     key     leaf resource-id {
 *                         type resource-id;
 *                     }
 *                     leaf tag {
 *                         type tag-string;
 *                     }
 *                     uses vtag;
 *                 }
 *                 uses endpoint-property-meta;
 *             }
 *             list endpoint-properties {
 *                 key "endpoint"
 *                 leaf endpoint {
 *                     type typed-endpoint-address;
 *                 }
 *                 list properties {
 *                     key "property-type"
 *                     leaf property-type {
 *                         type endpoint-property-type;
 *                     }
 *                     leaf property {
 *                         type endpoint-property-value;
 *                     }
 *                 }
 *             }
 *             uses endpoint-property-map;
 *         }
 *     }
 *     status CURRENT;
 * }
 * rpc filtered-cost-map-service {
 *     input {
 *         leaf resource-id {
 *             type resource-id;
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
 *         leaf-list constraints {
 *             type constraint;
 *         }
 *         container pids {
 *             leaf-list srcs {
 *                 type pid-name;
 *             }
 *             leaf-list dsts {
 *                 type pid-name;
 *             }
 *         }
 *     }
 *     
 *     output {
 *         container filtered-cost-map-service {
 *             leaf resource-id {
 *                 type resource-id;
 *             }
 *             leaf tag {
 *                 type tag-string;
 *             }
 *             container meta {
 *                 list dependent-vtags {
 *                     key     leaf resource-id {
 *                         type resource-id;
 *                     }
 *                     leaf tag {
 *                         type tag-string;
 *                     }
 *                     uses vtag;
 *                 }
 *                 container cost-type {
 *                     leaf cost-mode {
 *                         type cost-mode;
 *                     }
 *                     leaf cost-metric {
 *                         type cost-metric;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     uses cost-type;
 *                 }
 *                 uses cost-map-meta;
 *             }
 *             list map {
 *                 key "src"
 *                 leaf src {
 *                     type pid-name;
 *                 }
 *                 list dst-costs {
 *                     key "dst"
 *                     leaf dst {
 *                         type pid-name;
 *                     }
 *                     anyxml cost;
 *                     uses alto-cost;
 *                 }
 *             }
 *             uses cost-map;
 *         }
 *     }
 *     status CURRENT;
 * }
 * rpc filtered-network-map-service {
 *     input {
 *         leaf resource-id {
 *             type resource-id;
 *         }
 *         leaf-list pids {
 *             type pid-name;
 *         }
 *         leaf-list address-types {
 *             type endpoint-address-type;
 *         }
 *     }
 *     
 *     output {
 *         container filtered-network-map-service {
 *             leaf resource-id {
 *                 type resource-id;
 *             }
 *             leaf tag {
 *                 type tag-string;
 *             }
 *             list map {
 *                 key "pid"
 *                 leaf pid {
 *                     type pid-name;
 *                 }
 *                 list endpoint-address-group {
 *                     key "address-type"
 *                     leaf address-type {
 *                         type endpoint-address-type;
 *                     }
 *                     leaf-list endpoint-prefix {
 *                         type ip-prefix;
 *                     }
 *                 }
 *                 uses endpoint-address-group;
 *             }
 *             uses network-map;
 *         }
 *     }
 *     status CURRENT;
 * }
 * </pre>
 */
public interface AltoServiceService
    extends
    RpcService
{




    Future<RpcResult<EndpointCostServiceOutput>> endpointCostService(EndpointCostServiceInput input);
    
    Future<RpcResult<EndpointPropertyServiceOutput>> endpointPropertyService(EndpointPropertyServiceInput input);
    
    Future<RpcResult<FilteredCostMapServiceOutput>> filteredCostMapService(FilteredCostMapServiceInput input);
    
    Future<RpcResult<FilteredNetworkMapServiceOutput>> filteredNetworkMapService(FilteredNetworkMapServiceInput input);

}

