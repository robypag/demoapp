
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.15.1
 */

package com.sdk.test.vdm.namespaces.sfodataedmx;

import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmComplex;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * <p>Original complex type name from the Odata EDM: <b>SEFEventEntityParam</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class SEFEventEntityParam
    extends VdmComplex<SEFEventEntityParam>
{

    /**
     * Constraints: Not nullable<p>Original property from the Odata EDM: <b>description</b></p>
     * 
     * @param description
     *     
     */
    @SerializedName("description")
    @JsonProperty("description")
    @Nullable
    @ODataField(odataName = "description")
    private String description;
    /**
     * Constraints: Not nullable<p>Original property from the Odata EDM: <b>descriptionMessageKey</b></p>
     * 
     * @param descriptionMessageKey
     *     
     */
    @SerializedName("descriptionMessageKey")
    @JsonProperty("descriptionMessageKey")
    @Nullable
    @ODataField(odataName = "descriptionMessageKey")
    private String descriptionMessageKey;
    /**
     * Constraints: Nullable<p>Original property from the Odata EDM: <b>hasValueAlways</b></p>
     * 
     * @param hasValueAlways
     *     
     */
    @SerializedName("hasValueAlways")
    @JsonProperty("hasValueAlways")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "hasValueAlways")
    private Boolean hasValueAlways;
    /**
     * Constraints: Not nullable<p>Original property from the Odata EDM: <b>name</b></p>
     * 
     * @param name
     *     
     */
    @SerializedName("name")
    @JsonProperty("name")
    @Nullable
    @ODataField(odataName = "name")
    private String name;
    /**
     * Constraints: Not nullable<p>Original property from the Odata EDM: <b>type</b></p>
     * 
     * @param type_2
     *     
     */
    @SerializedName("type")
    @JsonProperty("type")
    @Nullable
    @ODataField(odataName = "type")
    private String type_2;

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<SEFEventEntityParam> getType() {
        return SEFEventEntityParam.class;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("description", getDescription());
        values.put("descriptionMessageKey", getDescriptionMessageKey());
        values.put("hasValueAlways", getHasValueAlways());
        values.put("name", getName());
        values.put("type", getType_2());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("description")) {
                final Object value = values.remove("description");
                if ((value == null)||(!value.equals(getDescription()))) {
                    setDescription(((String) value));
                }
            }
            if (values.containsKey("descriptionMessageKey")) {
                final Object value = values.remove("descriptionMessageKey");
                if ((value == null)||(!value.equals(getDescriptionMessageKey()))) {
                    setDescriptionMessageKey(((String) value));
                }
            }
            if (values.containsKey("hasValueAlways")) {
                final Object value = values.remove("hasValueAlways");
                if ((value == null)||(!value.equals(getHasValueAlways()))) {
                    setHasValueAlways(((Boolean) value));
                }
            }
            if (values.containsKey("name")) {
                final Object value = values.remove("name");
                if ((value == null)||(!value.equals(getName()))) {
                    setName(((String) value));
                }
            }
            if (values.containsKey("type")) {
                final Object value = values.remove("type");
                if ((value == null)||(!value.equals(getType_2()))) {
                    setType_2(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
        }
        super.fromMap(values);
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        return result;
    }

}
