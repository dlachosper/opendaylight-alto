package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.cost.map.data.Map;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-did</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-did.yang</i>):
 * <pre>
 * grouping cost-map-data {
 *     list map {
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
 * <i>alto-service-did/cost-map-data</i>
 */
public interface CostMapData
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-did","2014-11-01","cost-map-data");;

    List<Map> getMap();

}

