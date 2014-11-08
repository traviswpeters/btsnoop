/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    static {
        // Sample Services.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        attributes.put("00001800-0000-1000-8000-00805f9b34fb", "Service GAP_UUID");
        attributes.put("00001801-0000-1000-8000-00805f9b34fb", "Service GATT_UUID");
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put("00002a00-0000-1000-8000-00805f9b34fb", "Device Name");
        attributes.put("00002a01-0000-1000-8000-00805f9b34fb", "Appearance");
        attributes.put("00002a04-0000-1000-8000-00805f9b34fb", "Peripheral Preferred Connection Parameters");
        attributes.put("00002a05-0000-1000-8000-00805f9b34fb", "Service Changed");

        // Parrot specific Services
        attributes.put("9a66fa00-0800-9191-11e4-012d1540cb8e", "Parrot Service - A00");
        attributes.put("9a66fb00-0800-9191-11e4-012d1540cb8e", "Parrot Service - B00");
        attributes.put("9a66fc00-0800-9191-11e4-012d1540cb8e", "Parrot Service - C00");
        attributes.put("9a66fd21-0800-9191-11e4-012d1540cb8e", "Parrot Service - D21");
        attributes.put("9a66fd51-0800-9191-11e4-012d1540cb8e", "Parrot Service - D51");

        // Parrot minidrone Rolling Spider specific characteristics
        attributes.put("9a66fa01-0800-9191-11e4-012d1540cb8e", "Parrot - A01"); // + complete range to A1F
        attributes.put("9a66fa0a-0800-9191-11e4-012d1540cb8e", "Parrot - Power Motors");
        attributes.put("9a66fa1f-0800-9191-11e4-012d1540cb8e", "Parrot - A1F");
        attributes.put("9a66fb01-0800-9191-11e4-012d1540cb8e", "Parrot - B01"); // + complete range to B1F
        attributes.put("9a66fb1f-0800-9191-11e4-012d1540cb8e", "Parrot - B1F");
        attributes.put("9a66ffc1-0800-9191-11e4-012d1540cb8e", "Parrot - FC1");
        attributes.put("9a66fd22-0800-9191-11e4-012d1540cb8e", "Parrot - D22");
        attributes.put("9a66fd23-0800-9191-11e4-012d1540cb8e", "Parrot - D23");
        attributes.put("9a66fd24-0800-9191-11e4-012d1540cb8e", "Parrot - D24");
        attributes.put("9a66fd52-0800-9191-11e4-012d1540cb8e", "Parrot - D52");
        attributes.put("9a66fd53-0800-9191-11e4-012d1540cb8e", "Parrot - D53");
        attributes.put("9a66fd54-0800-9191-11e4-012d1540cb8e", "Parrot - D54");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
