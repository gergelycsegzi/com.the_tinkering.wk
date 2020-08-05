/*
 * Copyright 2019-2020 Ernst Jan Plugge <rmc@dds.nl>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.the_tinkering.wk.db.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Room entity for the search_preset table, which stores the user's search presets.
 */
@Entity(tableName = "search_preset")
public final class SearchPreset {
    /**
     * Name of this preset.
     */
    @NonNull
    @PrimaryKey
    public String name = "";

    /**
     * Type of this preset. 0 = level browse, 1 = simple keyword search, 2 = advanced search
     */
    @ColumnInfo(defaultValue = "0")
    public int type = 0;

    /**
     * Type-specific string that encodes the parameters for the search preset.
     */
    @NonNull
    @ColumnInfo(defaultValue = "")
    public String data = "";
}
