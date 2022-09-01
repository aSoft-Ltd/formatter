package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class AsoftProjectDependency extends DelegatingProjectDependency {

    @Inject
    public AsoftProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":expect-core"
     */
    public ExpectCoreProjectDependency getExpectCore() { return new ExpectCoreProjectDependency(getFactory(), create(":expect-core")); }

    /**
     * Creates a project dependency on the project at path ":formatter-api"
     */
    public FormatterApiProjectDependency getFormatterApi() { return new FormatterApiProjectDependency(getFactory(), create(":formatter-api")); }

    /**
     * Creates a project dependency on the project at path ":functions-core"
     */
    public FunctionsCoreProjectDependency getFunctionsCore() { return new FunctionsCoreProjectDependency(getFactory(), create(":functions-core")); }

}
