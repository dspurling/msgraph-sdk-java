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
 * The interface for the Base Workbook Functions Percentile_Inc Request Builder.
 */
public interface IBaseWorkbookFunctionsPercentile_IncRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsPercentile_IncRequest
     *
     * @return The IWorkbookFunctionsPercentile_IncRequest instance
     */
    IWorkbookFunctionsPercentile_IncRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsPercentile_IncRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsPercentile_IncRequest instance
     */
    IWorkbookFunctionsPercentile_IncRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
