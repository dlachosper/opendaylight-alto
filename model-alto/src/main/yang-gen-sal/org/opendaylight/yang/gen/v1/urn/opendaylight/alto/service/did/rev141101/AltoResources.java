package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.IRD;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.EndpointPropertyMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.NetworkMaps;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-did</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-did.yang</i>):
 * <pre>
 * grouping alto-resources {
 *     container IRD {
 *         container meta {
 *             list cost-types {
 *                 key "cost-type-name"
 *                 leaf cost-type-name {
 *                     type cost-type-name;
 *                 }
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
 *             leaf default-alto-network-map {
 *                 type resource-id;
 *             }
 *             uses IRD-meta;
 *         }
 *         list resources {
 *             key "resource-id"
 *             leaf resource-id {
 *                 type resource-id;
 *             }
 *             leaf uri {
 *                 type uri;
 *             }
 *             leaf media-type {
 *                 type media-type;
 *             }
 *             leaf-list uses {
 *                 type resource-id;
 *             }
 *             leaf-list accepts {
 *                 type media-type;
 *             }
 *             container capabilities {
 *                 leaf cost-constraints {
 *                     type boolean;
 *                 }
 *                 leaf-list cost-type-names {
 *                     type cost-type-name;
 *                 }
 *                 leaf-list prop-types {
 *                     type endpoint-property-type;
 *                 }
 *             }
 *             uses uses;
 *             uses accepts;
 *             uses IRD-capabilities;
 *         }
 *         uses IRD;
 *     }
 *     container network-maps {
 *         list network-map {
 *             key "resource-id"
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
 *     container cost-maps {
 *         list cost-map {
 *             key "resource-id"
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
 *     container endpoint-property-map {
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
 *             uses endpoint-property-meta;
 *         }
 *         list endpoint-properties {
 *             key "endpoint"
 *             leaf endpoint {
 *                 type typed-endpoint-address;
 *             }
 *             list properties {
 *                 key "property-type"
 *                 leaf property-type {
 *                     type endpoint-property-type;
 *                 }
 *                 leaf property {
 *                     type endpoint-property-value;
 *                 }
 *             }
 *         }
 *         uses endpoint-property-map;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-did/alto-resources</i>
 */
public interface AltoResources
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-did","2014-11-01","alto-resources");;

    IRD getIRD();
    
    NetworkMaps getNetworkMaps();
    
    CostMaps getCostMaps();
    
    EndpointPropertyMap getEndpointPropertyMap();

}

