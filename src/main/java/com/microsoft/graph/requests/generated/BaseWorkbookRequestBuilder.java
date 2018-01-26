// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Request Builder.
 */
public class BaseWorkbookRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookRequestBuilder {

    /**
     * The request builder for the Workbook
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IWorkbookRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IWorkbookRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WorkbookRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for WorkbookApplication.
     */
    public IWorkbookApplicationRequestBuilder application() {
        return new WorkbookApplicationRequestBuilder(getRequestUrlWithAdditionalSegment("application"), getClient(), null);
    }
    public IWorkbookNamedItemCollectionRequestBuilder names() {
        return new WorkbookNamedItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("names"), getClient(), null);
    }

    public IWorkbookNamedItemRequestBuilder names(final String id) {
        return new WorkbookNamedItemRequestBuilder(getRequestUrlWithAdditionalSegment("names") + "/" + id, getClient(), null);
    }
    public IWorkbookTableCollectionRequestBuilder tables() {
        return new WorkbookTableCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tables"), getClient(), null);
    }

    public IWorkbookTableRequestBuilder tables(final String id) {
        return new WorkbookTableRequestBuilder(getRequestUrlWithAdditionalSegment("tables") + "/" + id, getClient(), null);
    }
    public IWorkbookWorksheetCollectionRequestBuilder worksheets() {
        return new WorkbookWorksheetCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("worksheets"), getClient(), null);
    }

    public IWorkbookWorksheetRequestBuilder worksheets(final String id) {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("worksheets") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookFunctions.
     */
    public IWorkbookFunctionsRequestBuilder functions() {
        return new WorkbookFunctionsRequestBuilder(getRequestUrlWithAdditionalSegment("functions"), getClient(), null);
    }

    public IWorkbookCreateSessionRequestBuilder createSession(final Boolean persistChanges) {
        return new WorkbookCreateSessionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createSession"), getClient(), null, persistChanges);
    }

    public IWorkbookCloseSessionRequestBuilder closeSession() {
        return new WorkbookCloseSessionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.closeSession"), getClient(), null);
    }

    public IWorkbookRefreshSessionRequestBuilder refreshSession() {
        return new WorkbookRefreshSessionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.refreshSession"), getClient(), null);
    }

    public IWorkbookProcessQueryRequestBuilder processQuery(final byte[] input) {
        return new WorkbookProcessQueryRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.processQuery"), getClient(), null, input);
    }
}
