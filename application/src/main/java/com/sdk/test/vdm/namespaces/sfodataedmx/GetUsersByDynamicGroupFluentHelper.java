
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.15.1
 */

package com.sdk.test.vdm.namespaces.sfodataedmx;

import java.net.URI;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestinationProperties;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperFunction;
import com.sap.cloud.sdk.datamodel.odata.helper.ODataTypeValueSerializer;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.olingo.odata2.api.edm.EdmSimpleTypeKind;


/**
 * Fluent helper for the <b>getUsersByDynamicGroup</b> OData function import.
 * 
 */
public class GetUsersByDynamicGroupFluentHelper
    extends FluentHelperFunction<GetUsersByDynamicGroupFluentHelper, DynamicGroupUserBean, List<DynamicGroupUserBean>>
{

    private final Map<String, Object> values = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will execute the <b>getUsersByDynamicGroup</b> OData function import with the provided parameters. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param activeOnly
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>activeOnly</b></p>
     * @param servicePath
     *     Service path to be used to call the functions against.
     * @param groupId
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>groupId</b></p>
     */
    public GetUsersByDynamicGroupFluentHelper(
        @Nonnull
        final String servicePath, final Long groupId, final Boolean activeOnly) {
        super(servicePath);
        values.put("groupId", ODataTypeValueSerializer.of(EdmSimpleTypeKind.Int64).toUri(groupId));
        values.put("activeOnly", ODataTypeValueSerializer.of(EdmSimpleTypeKind.Boolean).toUri(activeOnly));
    }

    @Override
    @Nonnull
    protected Class<DynamicGroupUserBean> getEntityClass() {
        return DynamicGroupUserBean.class;
    }

    @Override
    @Nonnull
    protected String getFunctionName() {
        return "getUsersByDynamicGroup";
    }

    @Override
    @Nullable
    protected JsonElement refineJsonResponse(
        @Nullable
        JsonElement jsonElement) {
        if ((jsonElement instanceof JsonObject)&&((JsonObject) jsonElement).has(getFunctionName())) {
            jsonElement = ((JsonObject) jsonElement).get(getFunctionName());
        }
        return super.refineJsonResponse(jsonElement);
    }

    @Override
    @Nonnull
    protected Map<String, Object> getParameters() {
        return values;
    }

    @Override
    @Nonnull
    protected HttpUriRequest createRequest(
        @Nonnull
        final URI uri) {
        return new HttpGet(uri);
    }

    @Override
    @Nonnull
    public List<DynamicGroupUserBean> execute(
        @Nonnull
        final HttpDestinationProperties destination)
        throws ODataException
    {
        return super.executeMultiple(destination);
    }

}