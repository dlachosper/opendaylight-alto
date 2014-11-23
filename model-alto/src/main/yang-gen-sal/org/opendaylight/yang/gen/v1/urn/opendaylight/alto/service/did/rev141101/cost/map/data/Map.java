package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.CostMapData;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.PidName;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.map.DstCosts;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.MapKey;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-did</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-did.yang</i>):
 * <pre>
 * list map {
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
 * <i>alto-service-did/cost-map-data/map</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.MapBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.MapBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.MapKey
 */
public interface Map
    extends
    ChildOf<CostMapData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.Map>,
    Identifiable<MapKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-did","2014-11-01","map");;

    PidName getSrc();
    
    List<DstCosts> getDstCosts();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    MapKey getKey();

}

