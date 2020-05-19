
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.15.1
 */

package com.sdk.test.vdm.namespaces.sfodataedmx;

import java.net.URI;
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
 * Fluent helper for the <b>updateStaticGroup</b> OData function import.
 * 
 */
public class UpdateStaticGroupFluentHelper
    extends FluentHelperFunction<UpdateStaticGroupFluentHelper, Integer, Integer>
{

    private final Map<String, Object> values = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will execute the <b>updateStaticGroup</b> OData function import with the provided parameters. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     Service path to be used to call the functions against.
     * @param groupId
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>groupId</b></p>
     * @param userIds
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>userIds</b></p>
     * @param action
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>action</b></p>
     */
    public UpdateStaticGroupFluentHelper(
        @Nonnull
        final String servicePath, final Long groupId, final String action, final String userIds) {
        super(servicePath);
        values.put("groupId", ODataTypeValueSerializer.of(EdmSimpleTypeKind.Int64).toUri(groupId));
        values.put("action", ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(action));
        values.put("userIds", ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(userIds));
    }

    @Override
    @Nonnull
    protected Class<Integer> getEntityClass() {
        return Integer.class;
    }

    @Override
    @Nonnull
    protected String getFunctionName() {
        return "updateStaticGroup";
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
    @Nullable
    public Integer execute(
        @Nonnull
        final HttpDestinationProperties destination)
        throws ODataException
    {
        return super.executeSingle(destination);
    }

}
