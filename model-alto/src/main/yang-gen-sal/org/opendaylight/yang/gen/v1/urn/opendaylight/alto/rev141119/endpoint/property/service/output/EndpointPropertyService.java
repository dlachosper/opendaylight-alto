package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.EndpointPropertyServiceOutput;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyMap;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service</b>
 * <br />(Source path: <i>META-INF/yang/alto-service.yang</i>):
 * <pre>
 * container endpoint-property-service {
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
 *     uses endpoint-property-map;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service/endpoint-property-service/output/endpoint-property-service</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyServiceBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyServiceBuilder
 */
public interface EndpointPropertyService
    extends
    ChildOf<EndpointPropertyServiceOutput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.endpoint.property.service.output.EndpointPropertyService>,
    EndpointPropertyMap
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto","2014-11-19","endpoint-property-service");;


}

