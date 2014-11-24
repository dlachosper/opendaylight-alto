package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119;
import org.opendaylight.yangtools.yang.binding.DataRoot;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.Resources;


/**
 * This module defines a data model for the ALTO services using restconf. Note this
 * is not interop with RFC7285.
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service</b>
 * <br />Source path: <i>META-INF/yang/alto-service.yang</i>):
 * <pre>
 * module alto-service {
 *     yang-version 1;
 *     namespace "urn:opendaylight:alto";
 *     prefix "alto-restconf";
 *     import alto-service-did { prefix "alto-did"; }
 *     
 *     import alto-service-types { prefix "alto"; }
 *     revision 2014-11-19 {
 *         description "This module defines a data model for the ALTO services using restconf. Note this
 *                     is not interop with RFC7285.
 *         ";
 *     }
 *     container resources {
 *         leaf teststring {
 *             type string;
 *         }
 *         leaf testdatastring {
 *             type string;
 *         }
 *         container network-maps {
 *             list network-map {
 *                 key "resource-id"
 *                 leaf resource-id {
 *                     type resource-id;
 *                 }
 *                 leaf tag {
 *                     type tag-string;
 *                 }
 *                 list map {
 *                     key "pid"
 *                     leaf pid {
 *                         type pid-name;
 *                     }
 *                     list endpoint-address-group {
 *                         key "address-type"
 *                         leaf address-type {
 *                             type endpoint-address-type;
 *                         }
 *                         leaf-list endpoint-prefix {
 *                             type ip-prefix;
 *                         }
 *                     }
 *                     uses endpoint-address-group;
 *                 }
 *                 uses network-map;
 *             }
 *         }
 *     }
 *     rpc endpoint-cost-service {
 *         input {
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
 *             leaf-list constraints {
 *                 type constraint;
 *             }
 *             container endpoints {
 *                 leaf-list srcs {
 *                     type typed-endpoint-address;
 *                 }
 *                 leaf-list dsts {
 *                     type typed-endpoint-address;
 *                 }
 *             }
 *         }
 *         
 *         output {
 *             container endpoint-cost-service {
 *                 container meta {
 *                     container cost-type {
 *                         leaf cost-mode {
 *                             type cost-mode;
 *                         }
 *                         leaf cost-metric {
 *                             type cost-metric;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         uses cost-type;
 *                     }
 *                 }
 *                 list endpoint-cost-map {
 *                     key "src"
 *                     leaf src {
 *                         type typed-endpoint-address;
 *                     }
 *                     list dst-costs {
 *                         key "dst"
 *                         leaf dst {
 *                             type typed-endpoint-address;
 *                         }
 *                         anyxml cost;
 *                         uses alto-cost;
 *                     }
 *                 }
 *             }
 *         }
 *         status CURRENT;
 *     }
 *     rpc endpoint-property-service {
 *         input {
 *             leaf-list properties {
 *                 type endpoint-property-type;
 *             }
 *             leaf-list endpoints {
 *                 type typed-endpoint-address;
 *             }
 *         }
 *         
 *         output {
 *             container endpoint-property-service {
 *                 container meta {
 *                     list dependent-vtags {
 *                         key     leaf resource-id {
 *                             type resource-id;
 *                         }
 *                         leaf tag {
 *                             type tag-string;
 *                         }
 *                         uses vtag;
 *                     }
 *                     uses endpoint-property-meta;
 *                 }
 *                 list endpoint-properties {
 *                     key "endpoint"
 *                     leaf endpoint {
 *                         type typed-endpoint-address;
 *                     }
 *                     list properties {
 *                         key "property-type"
 *                         leaf property-type {
 *                             type endpoint-property-type;
 *                         }
 *                         leaf property {
 *                             type endpoint-property-value;
 *                         }
 *                     }
 *                 }
 *                 uses endpoint-property-map;
 *             }
 *         }
 *         status CURRENT;
 *     }
 *     rpc filtered-cost-map-service {
 *         input {
 *             leaf resource-id {
 *                 type resource-id;
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
 *             leaf-list constraints {
 *                 type constraint;
 *             }
 *             container pids {
 *                 leaf-list srcs {
 *                     type pid-name;
 *                 }
 *                 leaf-list dsts {
 *                     type pid-name;
 *                 }
 *             }
 *         }
 *         
 *         output {
 *             container filtered-cost-map-service {
 *                 leaf resource-id {
 *                     type resource-id;
 *                 }
 *                 leaf tag {
 *                     type tag-string;
 *                 }
 *                 container meta {
 *                     list dependent-vtags {
 *                         key     leaf resource-id {
 *                             type resource-id;
 *                         }
 *                         leaf tag {
 *                             type tag-string;
 *                         }
 *                         uses vtag;
 *                     }
 *                     container cost-type {
 *                         leaf cost-mode {
 *                             type cost-mode;
 *                         }
 *                         leaf cost-metric {
 *                             type cost-metric;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         uses cost-type;
 *                     }
 *                     uses cost-map-meta;
 *                 }
 *                 list map {
 *                     key "src"
 *                     leaf src {
 *                         type pid-name;
 *                     }
 *                     list dst-costs {
 *                         key "dst"
 *                         leaf dst {
 *                             type pid-name;
 *                         }
 *                         anyxml cost;
 *                         uses alto-cost;
 *                     }
 *                 }
 *                 uses cost-map;
 *             }
 *         }
 *         status CURRENT;
 *     }
 *     rpc filtered-network-map-service {
 *         input {
 *             leaf resource-id {
 *                 type resource-id;
 *             }
 *             leaf-list pids {
 *                 type pid-name;
 *             }
 *             leaf-list address-types {
 *                 type endpoint-address-type;
 *             }
 *         }
 *         
 *         output {
 *             container filtered-network-map-service {
 *                 leaf resource-id {
 *                     type resource-id;
 *                 }
 *                 leaf tag {
 *                     type tag-string;
 *                 }
 *                 list map {
 *                     key "pid"
 *                     leaf pid {
 *                         type pid-name;
 *                     }
 *                     list endpoint-address-group {
 *                         key "address-type"
 *                         leaf address-type {
 *                             type endpoint-address-type;
 *                         }
 *                         leaf-list endpoint-prefix {
 *                             type ip-prefix;
 *                         }
 *                     }
 *                     uses endpoint-address-group;
 *                 }
 *                 uses network-map;
 *             }
 *         }
 *         status CURRENT;
 *     }
 * }
 * </pre>
 */
public interface AltoServiceData
    extends
    DataRoot
{




    Resources getResources();

}

