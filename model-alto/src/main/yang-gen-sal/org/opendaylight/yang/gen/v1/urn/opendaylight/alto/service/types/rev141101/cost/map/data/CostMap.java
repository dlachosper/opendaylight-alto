package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostMapData;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.PidName;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMapKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.cost.map.DstCosts;


/**
 * The list represents the outer part of the cost matrix.CostMapData. RFC7285 Sec. 
 * 11.2.3.6. object-map { PIDName -> DstCosts; } CostMapData;
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * list cost-map {
 *     key "src"
 *     leaf src {
 *         type pid-name;
 *     }
 *     list dst-costs {
 *         key "dst"
 *         leaf dst {
 *             type pid-name;
 *         }
 *         anyxml cost;
 *         uses alto-cost;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/cost-map-data/cost-map</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMapBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMapBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMapKey
 */
public interface CostMap
    extends
    ChildOf<CostMapData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap>,
    Identifiable<CostMapKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","cost-map");;

    /**
     * Source PID.
     */
    PidName getSrc();
    
    /**
     * The list represents the inner part of the cost matrix.DstCosts. RFC7285 Sec. 
     * 11.2.3.6. object-map { PIDName -> JSONValue; } DstCosts;
     */
    List<DstCosts> getDstCosts();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    CostMapKey getKey();

}

