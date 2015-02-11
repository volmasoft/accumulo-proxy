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
 */
/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.accumulo.proxy.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

@SuppressWarnings({"unused"}) public enum PartialKey implements org.apache.thrift.TEnum {
  ROW(0),
  ROW_COLFAM(1),
  ROW_COLFAM_COLQUAL(2),
  ROW_COLFAM_COLQUAL_COLVIS(3),
  ROW_COLFAM_COLQUAL_COLVIS_TIME(4),
  ROW_COLFAM_COLQUAL_COLVIS_TIME_DEL(5);

  private final int value;

  private PartialKey(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static PartialKey findByValue(int value) { 
    switch (value) {
      case 0:
        return ROW;
      case 1:
        return ROW_COLFAM;
      case 2:
        return ROW_COLFAM_COLQUAL;
      case 3:
        return ROW_COLFAM_COLQUAL_COLVIS;
      case 4:
        return ROW_COLFAM_COLQUAL_COLVIS_TIME;
      case 5:
        return ROW_COLFAM_COLQUAL_COLVIS_TIME_DEL;
      default:
        return null;
    }
  }
}
