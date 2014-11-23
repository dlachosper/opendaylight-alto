package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.capabilities.Capabilities;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * grouping IRD-capabilities {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/IRD-capabilities</i>
 */
public interface IRDCapabilities
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","IRD-capabilities");;

    Capabilities getCapabilities();

}

