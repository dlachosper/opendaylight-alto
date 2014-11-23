package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.data.CostMap;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;


/**
 * Cost map. RFC7285 Sec. 11.2.3.6. object { CostMapData cost-map; } 
 * InfoResourceCostMap : ResponseEntityBase;
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * grouping cost-map-data {
 *     list cost-map {
 *         key "src"
 *         leaf src {
 *             type pid-name;
 *         }
 *         list dst-costs {
 *             key "dst"
 *             leaf dst {
 *                 type pid-name;
 *             }
 *             anyxml cost;
 *             uses alto-cost;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/cost-map-data</i>
 */
public interface CostMapData
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","cost-map-data");;

    /**
     * The list represents the outer part of the cost matrix.CostMapData. RFC7285 Sec. 
     * 11.2.3.6. object-map { PIDName -> DstCosts; } CostMapData;
     */
    List<CostMap> getCostMap();

}

