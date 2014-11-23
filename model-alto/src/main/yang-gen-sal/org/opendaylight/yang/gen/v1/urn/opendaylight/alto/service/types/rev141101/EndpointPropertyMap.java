package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.Meta;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyMapData;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * grouping endpoint-property-map {
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
 *         uses endpoint-property-meta;
 *     }
 *     list endpoint-properties {
 *         key "endpoint"
 *         leaf endpoint {
 *             type typed-endpoint-address;
 *         }
 *         list properties {
 *             key "property-type"
 *             leaf property-type {
 *                 type endpoint-property-type;
 *             }
 *             leaf property {
 *                 type endpoint-property-value;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/endpoint-property-map</i>
 */
public interface EndpointPropertyMap
    extends
    DataObject,
    EndpointPropertyMapData
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","endpoint-property-map");;

    Meta getMeta();

}

