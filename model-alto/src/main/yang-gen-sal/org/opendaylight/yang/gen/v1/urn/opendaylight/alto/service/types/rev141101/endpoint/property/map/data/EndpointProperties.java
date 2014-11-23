package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.TypedEndpointAddress;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointPropertiesKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyMapData;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties;


/**
 * EndpointPropertyMapData. Sec. 11.4.1.6. object-map { TypedEndpointAddr -> 
 * EndpointProps; } EndpointPropertyMapData;
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * list endpoint-properties {
 *     key "endpoint"
 *     leaf endpoint {
 *         type typed-endpoint-address;
 *     }
 *     list properties {
 *         key "property-type"
 *         leaf property-type {
 *             type endpoint-property-type;
 *         }
 *         leaf property {
 *             type endpoint-property-value;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/endpoint-property-map-data/endpoint-properties</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointPropertiesBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointPropertiesBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointPropertiesKey
 */
public interface EndpointProperties
    extends
    ChildOf<EndpointPropertyMapData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties>,
    Identifiable<EndpointPropertiesKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","endpoint-properties");;

    TypedEndpointAddress getEndpoint();
    
    /**
     * EndpointProps. RFC7285 Sec. 11.4.1.6. object { EndpointPropertyType -> 
     * JSONValue; } EndpointProps;
     */
    List<Properties> getProperties();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    EndpointPropertiesKey getKey();

}

