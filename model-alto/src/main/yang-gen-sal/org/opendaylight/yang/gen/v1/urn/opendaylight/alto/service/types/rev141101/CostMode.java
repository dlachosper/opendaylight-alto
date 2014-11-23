package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.service.types.rev141101;


/**
 * The enumeration built-in type represents values from a set of assigned names.
 */
public enum CostMode {
    /**
     * Numerical cost mode.
     */
    Numerical(0),
    
    /**
     * Ordinal cost mode.
     */
    Ordinal(1)
    ;


    int value;
    static java.util.Map<java.lang.Integer, CostMode> valueMap;

    static {
        valueMap = new java.util.HashMap<>();
        for (CostMode enumItem : CostMode.values())
        {
            valueMap.put(enumItem.value, enumItem);
        }
    }

    private CostMode(int value) {
        this.value = value;
    }
    
    /**
     * @return integer value
     */
    public int getIntValue() {
        return value;
    }

    /**
     * @param valueArg
     * @return corresponding CostMode item
     */
    public static CostMode forValue(int valueArg) {
        return valueMap.get(valueArg);
    }
}
