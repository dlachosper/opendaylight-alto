package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.CostMapMeta;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * container meta {
 *     list dependent-vtags {
 *         key     leaf resource-id {
 *             type resource-id;
 *         }
 *         leaf tag {
 *             type tag-string;
 *         }
 *         uses vtag;
 *     }
 *     container cost-type {
 *         leaf cost-mode {
 *             type cost-mode;
 *         }
 *         leaf cost-metric {
 *             type cost-metric;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         uses cost-type;
 *     }
 *     uses cost-map-meta;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/cost-map/meta</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.MetaBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.MetaBuilder
 */
public interface Meta
    extends
    ChildOf<CostMap>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.cost.map.Meta>,
    CostMapMeta
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","meta");;


}

