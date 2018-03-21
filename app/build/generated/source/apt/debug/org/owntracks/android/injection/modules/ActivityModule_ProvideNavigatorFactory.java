// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package org.owntracks.android.injection.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.owntracks.android.ui.base.navigator.Navigator;

public final class ActivityModule_ProvideNavigatorFactory implements Factory<Navigator> {
  private final ActivityModule module;

  public ActivityModule_ProvideNavigatorFactory(ActivityModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Navigator get() {
    return Preconditions.checkNotNull(
        module.provideNavigator(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Navigator> create(ActivityModule module) {
    return new ActivityModule_ProvideNavigatorFactory(module);
  }
}