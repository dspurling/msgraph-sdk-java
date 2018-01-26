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
 * The class for the Base Workbook Pivot Table Refresh Request Builder.
 */
public class BaseWorkbookPivotTableRefreshRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookPivotTableRefresh
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookPivotTableRefreshRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookPivotTableRefreshRequest
     *
     * @return The IWorkbookPivotTableRefreshRequest instance
     */
    public IWorkbookPivotTableRefreshRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookPivotTableRefreshRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookPivotTableRefreshRequest instance
     */
    public IWorkbookPivotTableRefreshRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookPivotTableRefreshRequest request = new WorkbookPivotTableRefreshRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
