package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.types;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.types.CostTypesKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostType;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostTypeName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * list cost-types {
 *     key "cost-type-name"
 *     leaf cost-type-name {
 *         type cost-type-name;
 *     }
 *     leaf cost-mode {
 *         type cost-mode;
 *     }
 *     leaf cost-metric {
 *         type cost-metric;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     uses cost-type;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/cost-types/cost-types</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.types.CostTypesBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.types.CostTypesBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.types.CostTypesKey
 */
public interface CostTypes
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostTypes>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.types.CostTypes>,
    CostType,
    Identifiable<CostTypesKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","cost-types");;

    CostTypeName getCostTypeName();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    CostTypesKey getKey();

}

