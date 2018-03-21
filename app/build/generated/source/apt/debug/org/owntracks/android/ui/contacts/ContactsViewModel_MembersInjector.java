// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package org.owntracks.android.ui.contacts;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.owntracks.android.ui.base.navigator.Navigator;

public final class ContactsViewModel_MembersInjector implements MembersInjector<ContactsViewModel> {
  private final Provider<Navigator> navigatorProvider;

  public ContactsViewModel_MembersInjector(Provider<Navigator> navigatorProvider) {
    assert navigatorProvider != null;
    this.navigatorProvider = navigatorProvider;
  }

  public static MembersInjector<ContactsViewModel> create(Provider<Navigator> navigatorProvider) {
    return new ContactsViewModel_MembersInjector(navigatorProvider);
  }

  @Override
  public void injectMembers(ContactsViewModel instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    org.owntracks.android.ui.base.viewmodel.BaseViewModel_MembersInjector.injectNavigator(
        instance, navigatorProvider);
  }
}
