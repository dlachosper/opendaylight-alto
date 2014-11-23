package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.dependent.vtags;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.Vtag;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * list dependent-vtags {
 *     key     leaf resource-id {
 *         type resource-id;
 *     }
 *     leaf tag {
 *         type tag-string;
 *     }
 *     uses vtag;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/dependent-vtags/dependent-vtags</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.dependent.vtags.DependentVtagsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.dependent.vtags.DependentVtagsBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.dependent.vtags.DependentVtagsKey
 */
public interface DependentVtags
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.DependentVtags>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.dependent.vtags.DependentVtags>,
    Vtag
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","dependent-vtags");;


}

