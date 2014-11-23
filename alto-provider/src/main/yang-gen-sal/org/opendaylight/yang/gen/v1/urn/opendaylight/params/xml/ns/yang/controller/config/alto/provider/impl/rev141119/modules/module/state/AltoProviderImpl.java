package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.alto.provider.impl.rev141119.modules.module.state;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.State;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-provider-impl</b>
 * <br />(Source path: <i>META-INF/yang/alto-provider-impl.yang</i>):
 * <pre>
 * case alto-provider-impl {
 *     leaf toasts-made {
 *         type uint32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-provider-impl/modules/module/state/(urn:opendaylight:params:xml:ns:yang:controller:config:alto-provider:impl?revision=2014-11-19)alto-provider-impl</i>
 */
public interface AltoProviderImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.alto.provider.impl.rev141119.modules.module.state.AltoProviderImpl>,
    State
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:alto-provider:impl","2014-11-19","alto-provider-impl");;

    java.lang.Long getToastsMade();

}

