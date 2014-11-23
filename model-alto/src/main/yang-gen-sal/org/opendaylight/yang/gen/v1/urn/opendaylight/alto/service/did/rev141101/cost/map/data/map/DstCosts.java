package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.AltoCost;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.PidName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCostsKey;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.Map;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-did</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-did.yang</i>):
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
 * <i>alto-service-did/cost-map-data/map/dst-costs</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCostsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCostsBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCostsKey
 */
public interface DstCosts
    extends
    ChildOf<Map>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts>,
    AltoCost,
    Identifiable<DstCostsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-did","2014-11-01","dst-costs");;

    PidName getDst();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    DstCostsKey getKey();

}

