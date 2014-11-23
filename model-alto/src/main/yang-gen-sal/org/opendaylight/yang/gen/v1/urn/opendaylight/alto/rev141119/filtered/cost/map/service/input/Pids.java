package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.input;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.PidName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.FilteredCostMapServiceInput;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service</b>
 * <br />(Source path: <i>META-INF/yang/alto-service.yang</i>):
 * <pre>
 * container pids {
 *     leaf-list srcs {
 *         type pid-name;
 *     }
 *     leaf-list dsts {
 *         type pid-name;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service/filtered-cost-map-service/input/pids</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.input.PidsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.input.PidsBuilder
 */
public interface Pids
    extends
    ChildOf<FilteredCostMapServiceInput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.rev141119.filtered.cost.map.service.input.Pids>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto","2014-11-19","pids");;

    List<PidName> getSrcs();
    
    List<PidName> getDsts();

}

