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
package org.koin.androidx.compose

import androidx.compose.runtime.Composable
import org.koin.compose.currentKoinScope
import org.koin.compose.getKoin
import org.koin.compose.koinInject
import org.koin.core.Koin
import org.koin.core.annotation.KoinInternalApi
import org.koin.core.parameter.ParametersDefinition
import org.koin.core.qualifier.Qualifier
import org.koin.core.scope.Scope

/**
 * Resolve a dependency for [Composable] functions
 * @param qualifier
 * @param parameters
 *
 * @return Lazy instance of type T
 *
 * @author Arnaud Giuliani
 * @author Henrique Horbovyi
 */
@OptIn(KoinInternalApi::class)
@Composable
@Deprecated("get() function is deprecated. Use koinInject() instead.", level = DeprecationLevel.ERROR, replaceWith = ReplaceWith("koinInject()","org.koin.compose"))
inline fun <reified T> get(
    qualifier: Qualifier? = null,
    scope: Scope = currentKoinScope(),
    noinline parameters: ParametersDefinition? = null,
): T = koinInject(qualifier,scope)

@Composable
@Deprecated("getKoin() function has been moved to koin-compose.", replaceWith = ReplaceWith("getKoin()","org.koin.compose"), level = DeprecationLevel.ERROR)
fun getKoin(): Koin = getKoin()
