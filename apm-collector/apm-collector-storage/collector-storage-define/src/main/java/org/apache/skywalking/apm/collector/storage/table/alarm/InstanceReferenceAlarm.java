/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.apm.collector.storage.table.alarm;

import org.apache.skywalking.apm.collector.core.data.Column;
import org.apache.skywalking.apm.collector.core.data.Data;
import org.apache.skywalking.apm.collector.core.data.operator.CoverOperation;
import org.apache.skywalking.apm.collector.core.data.operator.NonOperation;

/**
 * @author peng-yongsheng
 */
public class InstanceReferenceAlarm extends Data implements Alarm {

    private static final Column[] STRING_COLUMNS = {
        new Column(InstanceReferenceAlarmTable.COLUMN_ID, new NonOperation()),
        new Column(InstanceReferenceAlarmTable.COLUMN_ALARM_CONTENT, new CoverOperation()),
    };

    private static final Column[] LONG_COLUMNS = {
        new Column(InstanceReferenceAlarmTable.COLUMN_LAST_TIME_BUCKET, new CoverOperation()),
    };

    private static final Column[] DOUBLE_COLUMNS = {};

    private static final Column[] INTEGER_COLUMNS = {
        new Column(InstanceReferenceAlarmTable.COLUMN_ALARM_TYPE, new NonOperation()),
        new Column(InstanceReferenceAlarmTable.COLUMN_SOURCE_VALUE, new NonOperation()),
        new Column(InstanceReferenceAlarmTable.COLUMN_FRONT_APPLICATION_ID, new NonOperation()),
        new Column(InstanceReferenceAlarmTable.COLUMN_BEHIND_APPLICATION_ID, new NonOperation()),
        new Column(InstanceReferenceAlarmTable.COLUMN_FRONT_INSTANCE_ID, new NonOperation()),
        new Column(InstanceReferenceAlarmTable.COLUMN_BEHIND_INSTANCE_ID, new NonOperation()),
    };

    private static final Column[] BOOLEAN_COLUMNS = {};

    private static final Column[] BYTE_COLUMNS = {};

    public InstanceReferenceAlarm(String id) {
        super(id, STRING_COLUMNS, LONG_COLUMNS, DOUBLE_COLUMNS, INTEGER_COLUMNS, BOOLEAN_COLUMNS, BYTE_COLUMNS);
    }

    @Override
    public Integer getAlarmType() {
        return getDataInteger(0);
    }

    @Override
    public void setAlarmType(Integer alarmType) {
        setDataInteger(0, alarmType);
    }

    @Override
    public Integer getSourceValue() {
        return getDataInteger(1);
    }

    @Override
    public void setSourceValue(Integer sourceValue) {
        setDataInteger(1, sourceValue);
    }

    public Integer getFrontApplicationId() {
        return getDataInteger(2);
    }

    public void setFrontApplicationId(Integer frontApplicationId) {
        setDataInteger(2, frontApplicationId);
    }

    public Integer getBehindApplicationId() {
        return getDataInteger(3);
    }

    public void setBehindApplicationId(Integer behindApplicationId) {
        setDataInteger(3, behindApplicationId);
    }

    public Integer getFrontInstanceId() {
        return getDataInteger(4);
    }

    public void setFrontInstanceId(Integer frontInstanceId) {
        setDataInteger(4, frontInstanceId);
    }

    public Integer getBehindInstanceId() {
        return getDataInteger(5);
    }

    public void setBehindInstanceId(Integer behindInstanceId) {
        setDataInteger(5, behindInstanceId);
    }

    @Override
    public Long getLastTimeBucket() {
        return getDataLong(0);
    }

    @Override
    public void setLastTimeBucket(Long lastTimeBucket) {
        setDataLong(0, lastTimeBucket);
    }

    @Override
    public String getAlarmContent() {
        return getDataString(1);
    }

    @Override
    public void setAlarmContent(String alarmContent) {
        setDataString(1, alarmContent);
    }
}
