/*
 * Copyright 2017-present the original author or authors.
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
package org.koin.androidx.scope.dsl

import org.koin.androidx.scope.ActivityScopeArchetype
import org.koin.androidx.scope.FragmentScopeArchetype
import org.koin.androidx.scope.RetainedActivityScopeArchetype
import org.koin.core.annotation.KoinExperimentalAPI
import org.koin.core.annotation.KoinInternalApi
import org.koin.core.module.Module
import org.koin.dsl.ScopeDSL

@OptIn(KoinInternalApi::class)
@KoinExperimentalAPI
fun Module.activityScope(scopeSet: ScopeDSL.() -> Unit) {
    val qualifier = ActivityScopeArchetype
    ScopeDSL(qualifier, this).apply(scopeSet)
}

@OptIn(KoinInternalApi::class)
@KoinExperimentalAPI
fun Module.retainedActivityScope(scopeSet: ScopeDSL.() -> Unit) {
    val qualifier = RetainedActivityScopeArchetype
    ScopeDSL(qualifier, this).apply(scopeSet)
}

@OptIn(KoinInternalApi::class)
@KoinExperimentalAPI
fun Module.fragmentScope(scopeSet: ScopeDSL.() -> Unit) {
    val qualifier = FragmentScopeArchetype
    ScopeDSL(qualifier, this).apply(scopeSet)
}