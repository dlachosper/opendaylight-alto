package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.AltoResources;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-did</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-did.yang</i>):
 * <pre>
 * container endpoint-property-map {
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
 * <i>alto-service-did/alto-resources/endpoint-property-map</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.EndpointPropertyMapBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.EndpointPropertyMapBuilder
 */
public interface EndpointPropertyMap
    extends
    ChildOf<AltoResources>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.EndpointPropertyMap>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyMap
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-did","2014-11-01","endpoint-property-map");;


}

