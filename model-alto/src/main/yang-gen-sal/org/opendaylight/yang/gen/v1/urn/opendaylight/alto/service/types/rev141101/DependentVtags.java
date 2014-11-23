package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * grouping dependent-vtags {
 *     list dependent-vtags {
 *         key     leaf resource-id {
 *             type resource-id;
 *         }
 *         leaf tag {
 *             type tag-string;
 *         }
 *         uses vtag;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/dependent-vtags</i>
 */
public interface DependentVtags
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","dependent-vtags");;

    List<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.dependent.vtags.DependentVtags> getDependentVtags();

}

