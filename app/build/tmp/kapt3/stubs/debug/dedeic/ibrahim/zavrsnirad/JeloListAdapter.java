package dedeic.ibrahim.zavrsnirad;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Ldedeic/ibrahim/zavrsnirad/JeloListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ldedeic/ibrahim/zavrsnirad/JeloListAdapter$JeloViewHolder;", "jela", "", "Ldedeic/ibrahim/zavrsnirad/Jelo;", "(Ljava/util/List;)V", "filterKategorije", "Landroid/widget/Spinner;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateJela", "JeloViewHolder", "app_debug"})
public final class JeloListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<dedeic.ibrahim.zavrsnirad.JeloListAdapter.JeloViewHolder> {
    private android.widget.Spinner filterKategorije;
    private java.util.List<dedeic.ibrahim.zavrsnirad.Jelo> jela;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dedeic.ibrahim.zavrsnirad.JeloListAdapter.JeloViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    dedeic.ibrahim.zavrsnirad.JeloListAdapter.JeloViewHolder holder, int position) {
    }
    
    public final void updateJela(@org.jetbrains.annotations.NotNull()
    java.util.List<dedeic.ibrahim.zavrsnirad.Jelo> jela) {
    }
    
    public JeloListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<dedeic.ibrahim.zavrsnirad.Jelo> jela) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b\u00a8\u0006\u000f"}, d2 = {"Ldedeic/ibrahim/zavrsnirad/JeloListAdapter$JeloViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Ldedeic/ibrahim/zavrsnirad/JeloListAdapter;Landroid/view/View;)V", "cijenaTitle", "Landroid/widget/TextView;", "getCijenaTitle", "()Landroid/widget/TextView;", "jeloImage", "Landroid/widget/ImageView;", "getJeloImage", "()Landroid/widget/ImageView;", "jeloTitle", "getJeloTitle", "app_debug"})
    public final class JeloViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView jeloImage = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView jeloTitle = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView cijenaTitle = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getJeloImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getJeloTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCijenaTitle() {
            return null;
        }
        
        public JeloViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}