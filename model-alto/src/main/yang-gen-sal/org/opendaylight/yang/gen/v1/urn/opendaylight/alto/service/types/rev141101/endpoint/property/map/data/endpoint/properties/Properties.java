package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyValue;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.PropertiesKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties;


/**
 * EndpointProps. RFC7285 Sec. 11.4.1.6. object { EndpointPropertyType -> 
 * JSONValue; } EndpointProps;
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * list properties {
 *     key "property-type"
 *     leaf property-type {
 *         type endpoint-property-type;
 *     }
 *     leaf property {
 *         type endpoint-property-value;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/endpoint-property-map-data/endpoint-properties/properties</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.PropertiesBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.PropertiesBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.PropertiesKey
 */
public interface Properties
    extends
    ChildOf<EndpointProperties>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.endpoint.properties.Properties>,
    Identifiable<PropertiesKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","properties");;

    EndpointPropertyType getPropertyType();
    
    EndpointPropertyValue getProperty();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    PropertiesKey getKey();

}

