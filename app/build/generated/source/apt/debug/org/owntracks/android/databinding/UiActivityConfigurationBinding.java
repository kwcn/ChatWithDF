package org.owntracks.android.databinding;
import org.owntracks.android.R;
import org.owntracks.android.BR;
import android.view.View;
public class UiActivityConfigurationBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 2);
    }
    // views
    public final android.widget.TextView effectiveConfiguration;
    public final android.support.design.widget.CoordinatorLayout frame;
    public final android.support.v7.widget.Toolbar toolbar;
    // variables
    private org.owntracks.android.ui.configuration.ConfigurationViewModel mVm;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public UiActivityConfigurationBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds);
        this.effectiveConfiguration = (android.widget.TextView) bindings[1];
        this.effectiveConfiguration.setTag(null);
        this.frame = (android.support.design.widget.CoordinatorLayout) bindings[0];
        this.frame.setTag(null);
        this.toolbar = (android.support.v7.widget.Toolbar) bindings[2];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.vm :
                setVm((org.owntracks.android.ui.configuration.ConfigurationViewModel) variable);
                return true;
        }
        return false;
    }

    public void setVm(org.owntracks.android.ui.configuration.ConfigurationViewModel Vm) {
        updateRegistration(0, Vm);
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public org.owntracks.android.ui.configuration.ConfigurationViewModel getVm() {
        return mVm;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVm((org.owntracks.android.ui.configuration.ConfigurationViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVm(org.owntracks.android.ui.configuration.ConfigurationViewModel Vm, int fieldId) {
        switch (fieldId) {
            case BR.effectiveConfiguration: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
                }
                return true;
            }
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        org.owntracks.android.ui.configuration.ConfigurationViewModel vm = mVm;
        java.lang.String vmEffectiveConfiguration = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (vm != null) {
                    // read vm.effectiveConfiguration
                    vmEffectiveConfiguration = vm.getEffectiveConfiguration();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.effectiveConfiguration, org.owntracks.android.support.widgets.BindingConversions.convertToString(vmEffectiveConfiguration));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static UiActivityConfigurationBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static UiActivityConfigurationBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<UiActivityConfigurationBinding>inflate(inflater, org.owntracks.android.R.layout.ui_activity_configuration, root, attachToRoot, bindingComponent);
    }
    public static UiActivityConfigurationBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static UiActivityConfigurationBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.owntracks.android.R.layout.ui_activity_configuration, null, false), bindingComponent);
    }
    public static UiActivityConfigurationBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static UiActivityConfigurationBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/ui_activity_configuration_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new UiActivityConfigurationBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): vm
        flag 1 (0x2L): vm.effectiveConfiguration
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}