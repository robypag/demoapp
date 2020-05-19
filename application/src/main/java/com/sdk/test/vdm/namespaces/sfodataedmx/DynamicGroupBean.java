
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
 * <p>Original complex type name from the Odata EDM: <b>DynamicGroupBean</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class DynamicGroupBean
    extends VdmComplex<DynamicGroupBean>
{

    /**
     * Constraints: Nullable<p>Original property from the Odata EDM: <b>groupId</b></p>
     * 
     * @param groupId
     *     
     */
    @SerializedName("groupId")
    @JsonProperty("groupId")
    @Nullable
    @ODataField(odataName = "groupId")
    private Long groupId;
    /**
     * Constraints: Nullable<p>Original property from the Odata EDM: <b>groupName</b></p>
     * 
     * @param groupName
     *     
     */
    @SerializedName("groupName")
    @JsonProperty("groupName")
    @Nullable
    @ODataField(odataName = "groupName")
    private String groupName;

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<DynamicGroupBean> getType() {
        return DynamicGroupBean.class;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("groupId", getGroupId());
        values.put("groupName", getGroupName());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("groupId")) {
                final Object value = values.remove("groupId");
                if ((value == null)||(!value.equals(getGroupId()))) {
                    setGroupId(((Long) value));
                }
            }
            if (values.containsKey("groupName")) {
                final Object value = values.remove("groupName");
                if ((value == null)||(!value.equals(getGroupName()))) {
                    setGroupName(((String) value));
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