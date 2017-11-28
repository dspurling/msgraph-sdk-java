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
 * The interface for the Base Directory Object Request.
 */
public interface IBaseDirectoryObjectRequest extends IHttpRequest {

    /**
     * Gets the DirectoryObject from the service
     * @param callback The callback to be called after success or failure.
     */
    void getDirectoryObject(final ICallback<DirectoryObject> callback);

    /**
     * Gets the DirectoryObject from the service
     * @return The DirectoryObject from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DirectoryObject getDirectoryObject() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DirectoryObject with a source
     * @param sourceDirectoryObject The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final DirectoryObject sourceDirectoryObject, final ICallback<DirectoryObject> callback);

    /**
     * Patches this DirectoryObject with a source
     * @param sourceDirectoryObject The source object with updates
     * @return The updated DirectoryObject
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DirectoryObject patch(final DirectoryObject sourceDirectoryObject) throws ClientException;

    /**
     * Posts a DirectoryObject with a new object
     * @param newDirectoryObject The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final DirectoryObject newDirectoryObject, final ICallback<DirectoryObject> callback);

    /**
     * Posts a DirectoryObject with a new object
     * @param newDirectoryObject The new object to create
     * @return The created DirectoryObject
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DirectoryObject post(final DirectoryObject newDirectoryObject) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseDirectoryObjectRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseDirectoryObjectRequest expand(final String value);

}
