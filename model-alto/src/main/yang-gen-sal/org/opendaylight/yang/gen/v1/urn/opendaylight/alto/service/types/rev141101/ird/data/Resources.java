package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.MediaType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ResourceId;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Accepts;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Uses;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.ResourcesKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDCapabilities;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDData;


/**
 * IRDResourceEntry. RFC7285 9.2.2. object { JSONString uri; JSONString media-type;
 * [JSONString accepts;] [Capabilities capabilities;] [ResourceID uses<0..*>;] } 
 * IRDResourceEntry;IRDResourceEntries. RFC7285 9.2.2. object-map { ResourceID -> 
 * IRDResourceEntry; } IRDResourceEntries;InformationResourceDirectory. RFC7285 
 * 9.2.2. object { IRDResourceEntries resources; } InfoResourceDirectory : 
 * ResponseEntityBase;
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * list resources {
 *     key "resource-id"
 *     leaf resource-id {
 *         type resource-id;
 *     }
 *     leaf uri {
 *         type uri;
 *     }
 *     leaf media-type {
 *         type media-type;
 *     }
 *     leaf-list uses {
 *         type resource-id;
 *     }
 *     leaf-list accepts {
 *         type media-type;
 *     }
 *     container capabilities {
 *         leaf cost-constraints {
 *             type boolean;
 *         }
 *         leaf-list cost-type-names {
 *             type cost-type-name;
 *         }
 *         leaf-list prop-types {
 *             type endpoint-property-type;
 *         }
 *     }
 *     uses uses;
 *     uses accepts;
 *     uses IRD-capabilities;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/IRD-data/resources</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.ResourcesBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.ResourcesBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.ResourcesKey
 */
public interface Resources
    extends
    ChildOf<IRDData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.data.Resources>,
    Uses,
    Accepts,
    IRDCapabilities,
    Identifiable<ResourcesKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","resources");;

    ResourceId getResourceId();
    
    Uri getUri();
    
    MediaType getMediaType();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    ResourcesKey getKey();

}

