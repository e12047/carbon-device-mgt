/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * you may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.device.mgt.analytics.dashboard;

import org.wso2.carbon.device.mgt.analytics.dashboard.dao.exception.InvalidParameterException;
import org.wso2.carbon.device.mgt.common.PaginationRequest;
import org.wso2.carbon.device.mgt.common.PaginationResult;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * To be updated...
 */
public interface GadgetDataService {

    @SuppressWarnings("unused")
    int getTotalDeviceCount() throws SQLException;

    @SuppressWarnings("unused")
    int getActiveDeviceCount() throws SQLException;

    @SuppressWarnings("unused")
    int getInactiveDeviceCount() throws SQLException;

    @SuppressWarnings("unused")
    int getRemovedDeviceCount() throws SQLException;

    @SuppressWarnings("unused")
    int getNonCompliantDeviceCount() throws SQLException;

    @SuppressWarnings("unused")
    int getUnmonitoredDeviceCount() throws SQLException;

    @SuppressWarnings("unused")
    PaginationResult getNonCompliantDeviceCountsByFeatures(PaginationRequest paginationRequest)
                                                           throws SQLException, InvalidParameterException;

    @SuppressWarnings("unused")
    int getDeviceCount(Map<String, Object> filters) throws SQLException;

    @SuppressWarnings("unused")
    int getFeatureNonCompliantDeviceCount(String nonCompliantFeatureCode,
                                          Map<String, Object> filters) throws SQLException, InvalidParameterException;

    @SuppressWarnings("unused")
    Map<String, Integer> getDeviceCountsByPlatforms(Map<String, Object> filters) throws SQLException;

    @SuppressWarnings("unused")
    Map<String, Integer> getFeatureNonCompliantDeviceCountsByPlatforms(String nonCompliantFeatureCode,
                                          Map<String, Object> filters) throws SQLException, InvalidParameterException;

    @SuppressWarnings("unused")
    Map<String, Integer> getDeviceCountsByOwnershipTypes(Map<String, Object> filters) throws SQLException;

    @SuppressWarnings("unused")
    Map<String, Integer> getFeatureNonCompliantDeviceCountsByOwnershipTypes(String nonCompliantFeatureCode,
                                          Map<String, Object> filters) throws SQLException, InvalidParameterException;

    @SuppressWarnings("unused")
    PaginationResult getDevicesWithDetails(Map<String, Object> filters,
                                  PaginationRequest paginationRequest) throws SQLException, InvalidParameterException;

    @SuppressWarnings("unused")
    PaginationResult getFeatureNonCompliantDevicesWithDetails(String nonCompliantFeatureCode,
                                    Map<String, Object> filters, PaginationRequest paginationRequest)
                                                            throws SQLException, InvalidParameterException;

    @SuppressWarnings("unused")
    List<Map<String, Object>> getDevicesWithDetails(Map<String, Object> filters) throws SQLException;

    @SuppressWarnings("unused")
    List<Map<String, Object>> getFeatureNonCompliantDevicesWithDetails(String nonCompliantFeatureCode,
                                          Map<String, Object> filters) throws SQLException, InvalidParameterException;

}
