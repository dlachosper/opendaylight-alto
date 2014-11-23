package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRD;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDMeta;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * container meta {
 *     list cost-types {
 *         key "cost-type-name"
 *         leaf cost-type-name {
 *             type cost-type-name;
 *         }
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
 *     leaf default-alto-network-map {
 *         type resource-id;
 *     }
 *     uses IRD-meta;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/IRD/meta</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.MetaBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.MetaBuilder
 */
public interface Meta
    extends
    ChildOf<IRD>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta>,
    IRDMeta
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","meta");;


}

