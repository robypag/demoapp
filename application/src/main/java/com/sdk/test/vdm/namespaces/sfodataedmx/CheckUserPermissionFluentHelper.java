
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
 * Fluent helper for the <b>checkUserPermission</b> OData function import.
 * 
 */
public class CheckUserPermissionFluentHelper
    extends FluentHelperFunction<CheckUserPermissionFluentHelper, Boolean, Boolean>
{

    private final Map<String, Object> values = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will execute the <b>checkUserPermission</b> OData function import with the provided parameters. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param accessUserId
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>accessUserId</b></p>
     * @param includeTBHUser
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>includeTBHUser</b></p>
     * @param permType
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>permType</b></p>
     * @param permLongValue
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>permLongValue</b></p>
     * @param servicePath
     *     Service path to be used to call the functions against.
     * @param permStringValue
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>permStringValue</b></p>
     * @param includeInactiveUser
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>includeInactiveUser</b></p>
     * @param targetUserId
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>targetUserId</b></p>
     */
    public CheckUserPermissionFluentHelper(
        @Nonnull
        final String servicePath, final String accessUserId, final String permType, final String permStringValue, final Long permLongValue, final String targetUserId, final Boolean includeInactiveUser, final Boolean includeTBHUser) {
        super(servicePath);
        values.put("accessUserId", ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(accessUserId));
        values.put("permType", ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(permType));
        values.put("permStringValue", ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(permStringValue));
        values.put("permLongValue", ODataTypeValueSerializer.of(EdmSimpleTypeKind.Int64).toUri(permLongValue));
        values.put("targetUserId", ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(targetUserId));
        values.put("includeInactiveUser", ODataTypeValueSerializer.of(EdmSimpleTypeKind.Boolean).toUri(includeInactiveUser));
        values.put("includeTBHUser", ODataTypeValueSerializer.of(EdmSimpleTypeKind.Boolean).toUri(includeTBHUser));
    }

    @Override
    @Nonnull
    protected Class<Boolean> getEntityClass() {
        return Boolean.class;
    }

    @Override
    @Nonnull
    protected String getFunctionName() {
        return "checkUserPermission";
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
    public Boolean execute(
        @Nonnull
        final HttpDestinationProperties destination)
        throws ODataException
    {
        return super.executeSingle(destination);
    }

}
