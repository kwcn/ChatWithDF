// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package org.owntracks.android.injection.modules;

import android.support.v4.app.FragmentManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class FragmentModule_ProvideDefaultFragmentManagerFactory
    implements Factory<FragmentManager> {
  private final FragmentModule module;

  public FragmentModule_ProvideDefaultFragmentManagerFactory(FragmentModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public FragmentManager get() {
    return Preconditions.checkNotNull(
        module.provideDefaultFragmentManager(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<FragmentManager> create(FragmentModule module) {
    return new FragmentModule_ProvideDefaultFragmentManagerFactory(module);
  }
}
