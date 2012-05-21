/*
 * Copyright 2010-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.j2k.ast;

import org.jetbrains.annotations.NotNull;

/**
 * @author ignatov
 */
public abstract class Modifier {
    @NotNull
    public static final String PUBLIC = "public";
    @NotNull
    public static final String PROTECTED = "protected";
    @NotNull
    public static final String PRIVATE = "private";
    @NotNull
    public static final String INTERNAL = "internal";
    @NotNull
    public static final String STATIC = "static";
    @NotNull
    public static final String ABSTRACT = "abstract";
    @NotNull
    public static final String FINAL = "final";
    @NotNull
    public static final String OPEN = "open";
    @NotNull
    public static final String NOT_OPEN = "not open";
    @NotNull
    public static final String OVERRIDE = "override";
}
