package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.ird.Meta;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101.IRDData;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>alto-service-types</b>
 * <br />(Source path: <i>META-INF/yang/alto-service-types.yang</i>):
 * <pre>
 * grouping IRD {
 *     container meta {
 *         list cost-types {
 *             key "cost-type-name"
 *             leaf cost-type-name {
 *                 type cost-type-name;
 *             }
 *             leaf cost-mode {
 *                 type cost-mode;
 *             }
 *             leaf cost-metric {
 *                 type cost-metric;
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             uses cost-type;
 *         }
 *         leaf default-alto-network-map {
 *             type resource-id;
 *         }
 *         uses IRD-meta;
 *     }
 *     list resources {
 *         key "resource-id"
 *         leaf resource-id {
 *             type resource-id;
 *         }
 *         leaf uri {
 *             type uri;
 *         }
 *         leaf media-type {
 *             type media-type;
 *         }
 *         leaf-list uses {
 *             type resource-id;
 *         }
 *         leaf-list accepts {
 *             type media-type;
 *         }
 *         container capabilities {
 *             leaf cost-constraints {
 *                 type boolean;
 *             }
 *             leaf-list cost-type-names {
 *                 type cost-type-name;
 *             }
 *             leaf-list prop-types {
 *                 type endpoint-property-type;
 *             }
 *         }
 *         uses uses;
 *         uses accepts;
 *         uses IRD-capabilities;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>alto-service-types/IRD</i>
 */
public interface IRD
    extends
    DataObject,
    IRDData
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto-service-types","2014-11-01","IRD");;

    Meta getMeta();

}

