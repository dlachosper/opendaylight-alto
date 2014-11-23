package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.cost.map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.AltoCost;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.PidName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.cost.map.DstCostsKey;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The list represents the inner part of the cost matrix.DstCosts. RFC7285 Sec. 
 * 11.2.3.6. object-map { PIDName -> JSONValue; } DstCosts;
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * list dst-costs {
 *     key "dst"
 *     leaf dst {
 *         type pid-name;
 *     }
 *     anyxml cost;
 *     uses alto-cost;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/cost-map-data/cost-map/dst-costs</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.cost.map.DstCostsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.cost.map.DstCostsBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.cost.map.DstCostsKey
 */
public interface DstCosts
    extends
    ChildOf<CostMap>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.cost.map.DstCosts>,
    AltoCost,
    Identifiable<DstCostsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","dst-costs");;

    /**
     * Destination PID.
     */
    PidName getDst();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    DstCostsKey getKey();

}

