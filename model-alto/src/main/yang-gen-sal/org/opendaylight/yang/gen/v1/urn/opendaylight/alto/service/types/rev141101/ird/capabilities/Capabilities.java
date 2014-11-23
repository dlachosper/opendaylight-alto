package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.EndpointPropertyType;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostTypeName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDCapabilities;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * container capabilities {
 *     leaf cost-constraints {
 *         type boolean;
 *     }
 *     leaf-list cost-type-names {
 *         type cost-type-name;
 *     }
 *     leaf-list prop-types {
 *         type endpoint-property-type;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/IRD-capabilities/capabilities</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.CapabilitiesBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.CapabilitiesBuilder
 */
public interface Capabilities
    extends
    ChildOf<IRDCapabilities>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","capabilities");;

    java.lang.Boolean isCostConstraints();
    
    List<CostTypeName> getCostTypeNames();
    
    List<EndpointPropertyType> getPropTypes();

}

