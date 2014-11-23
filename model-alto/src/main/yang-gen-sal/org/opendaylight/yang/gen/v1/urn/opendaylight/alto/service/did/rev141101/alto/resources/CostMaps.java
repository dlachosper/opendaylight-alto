package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.cost.maps.CostMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.AltoResources;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-did</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-did.yang</i>):
 * <pre>
 * container cost-maps {
 *     list cost-map {
 *         key "resource-id"
 *         leaf resource-id {
 *             type resource-id;
 *         }
 *         leaf tag {
 *             type tag-string;
 *         }
 *         container meta {
 *             list dependent-vtags {
 *                 key     leaf resource-id {
 *                     type resource-id;
 *                 }
 *                 leaf tag {
 *                     type tag-string;
 *                 }
 *                 uses vtag;
 *             }
 *             container cost-type {
 *                 leaf cost-mode {
 *                     type cost-mode;
 *                 }
 *                 leaf cost-metric {
 *                     type cost-metric;
 *                 }
 *                 leaf description {
 *                     type string;
 *                 }
 *                 uses cost-type;
 *             }
 *             uses cost-map-meta;
 *         }
 *         list map {
 *             key "src"
 *             leaf src {
 *                 type pid-name;
 *             }
 *             list dst-costs {
 *                 key "dst"
 *                 leaf dst {
 *                     type pid-name;
 *                 }
 *                 anyxml cost;
 *                 uses alto-cost;
 *             }
 *         }
 *         uses cost-map;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-did/alto-resources/cost-maps</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMapsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMapsBuilder
 */
public interface CostMaps
    extends
    ChildOf<AltoResources>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.did.rev141101.alto.resources.CostMaps>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-did","2014-11-01","cost-maps");;

    List<CostMap> getCostMap();

}

