/*
 * Copyright (C) 2023 The Android Open Source Project
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

package com.android.services.telephony;

import com.android.internal.telephony.flags.Flags;

/**
 * FlagsAdapterImpl should always be used in production when Telephony is checking a flag status.
 * To help with testing, it may be necessary to have a different implementation
 * (e.g. flag is read only).
 */
public class FlagsAdapterImpl implements FlagsAdapter {
    public boolean doNotOverridePreciseLabel() {
        return Flags.doNotOverridePreciseLabel();
    }
}
