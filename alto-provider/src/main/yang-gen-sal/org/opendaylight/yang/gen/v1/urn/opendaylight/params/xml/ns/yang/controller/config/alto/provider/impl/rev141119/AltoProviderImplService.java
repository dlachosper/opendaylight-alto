package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.alto.provider.impl.rev141119;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.alto.provider.impl.rev141119.ClearToastsMadeInput;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>alto-provider-impl</b>
 * <br />(Source path: <i>META-INF/yang/alto-provider-impl.yang</i>):
 * <pre>
 * rpc clear-toasts-made {
 *     "JMX call to clear the toasts-made counter.";
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     status CURRENT;
 * }
 * </pre>
 */
public interface AltoProviderImplService
    extends
    RpcService
{




    /**
     * JMX call to clear the toasts-made counter.
     */
    Future<RpcResult<java.lang.Void>> clearToastsMade(ClearToastsMadeInput input);

}

