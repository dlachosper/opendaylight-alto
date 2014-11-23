package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.NetworkMapMeta;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * container vtag {
 *     leaf resource-id {
 *         type resource-id;
 *     }
 *     leaf tag {
 *         type tag-string;
 *     }
 *     uses vtag;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/network-map-meta/vtag</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.VtagBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.VtagBuilder
 */
public interface Vtag
    extends
    ChildOf<NetworkMapMeta>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.network.map.meta.Vtag>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Vtag
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","vtag");;


}

