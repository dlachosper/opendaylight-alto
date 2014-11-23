package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.endpoint.property.map.data.EndpointProperties;


/**
 * InfoResourceEndpointProperties. Sec. 11.4.1.6. object { EndpointPropertyMapData 
 * endpoint-properties; } InfoResourceEndpointProperties : ResponseEntityBase;
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * grouping endpoint-property-map-data {
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
 * <i>alto-service-types/endpoint-property-map-data</i>
 */
public interface EndpointPropertyMapData
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","endpoint-property-map-data");;

    /**
     * EndpointPropertyMapData. Sec. 11.4.1.6. object-map { TypedEndpointAddr -> 
     * EndpointProps; } EndpointPropertyMapData;
     */
    List<EndpointProperties> getEndpointProperties();

}

