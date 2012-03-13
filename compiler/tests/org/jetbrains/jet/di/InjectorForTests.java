/*
 * Copyright 2000-2012 JetBrains s.r.o.
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


package org.jetbrains.jet.di;

import com.intellij.openapi.project.Project;
import org.jetbrains.jet.lang.resolve.AnnotationResolver;
import org.jetbrains.jet.lang.resolve.DescriptorResolver;
import org.jetbrains.jet.lang.resolve.TypeResolver;
import org.jetbrains.jet.lang.resolve.calls.CallResolver;
import org.jetbrains.jet.lang.resolve.calls.OverloadingConflictResolver;
import org.jetbrains.jet.lang.types.expressions.ExpressionTypingServices;
import org.jetbrains.jet.lang.types.lang.JetStandardLibrary;

/* This file is generated by org.jetbrains.jet.di.InjectorGenerator. DO NOT EDIT! */
public class InjectorForTests {

    private DescriptorResolver descriptorResolver;
    private ExpressionTypingServices expressionTypingServices;
    private TypeResolver typeResolver;
    private CallResolver callResolver;
    private JetStandardLibrary jetStandardLibrary;
    private final Project project;

    public InjectorForTests(
        Project project
    ) {
        this.descriptorResolver = new DescriptorResolver();
        this.expressionTypingServices = new ExpressionTypingServices();
        this.typeResolver = new TypeResolver();
        this.callResolver = new CallResolver();
        this.jetStandardLibrary = JetStandardLibrary.getInstance();
        this.project = project;
        AnnotationResolver annotationResolver = new AnnotationResolver();
        OverloadingConflictResolver overloadingConflictResolver = new OverloadingConflictResolver();

        this.descriptorResolver.setExpressionTypingServices(expressionTypingServices);
        this.descriptorResolver.setTypeResolver(typeResolver);
        this.descriptorResolver.setAnnotationResolver(annotationResolver);

        this.expressionTypingServices.setDescriptorResolver(descriptorResolver);
        this.expressionTypingServices.setCallResolver(callResolver);
        this.expressionTypingServices.setTypeResolver(typeResolver);
        this.expressionTypingServices.setProject(project);

        this.typeResolver.setDescriptorResolver(descriptorResolver);
        this.typeResolver.setAnnotationResolver(annotationResolver);

        this.callResolver.setDescriptorResolver(descriptorResolver);
        this.callResolver.setExpressionTypingServices(expressionTypingServices);
        this.callResolver.setTypeResolver(typeResolver);
        this.callResolver.setOverloadingConflictResolver(overloadingConflictResolver);

        annotationResolver.setExpressionTypingServices(expressionTypingServices);
        annotationResolver.setCallResolver(callResolver);

    }

    public DescriptorResolver getDescriptorResolver() {
        return this.descriptorResolver;
    }

    public ExpressionTypingServices getExpressionTypingServices() {
        return this.expressionTypingServices;
    }

    public TypeResolver getTypeResolver() {
        return this.typeResolver;
    }

    public CallResolver getCallResolver() {
        return this.callResolver;
    }

    public JetStandardLibrary getJetStandardLibrary() {
        return this.jetStandardLibrary;
    }

    public Project getProject() {
        return this.project;
    }

}
