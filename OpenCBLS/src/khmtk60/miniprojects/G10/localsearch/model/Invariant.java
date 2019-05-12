package khmtk60.miniprojects.G10.localsearch.model;

public interface Invariant {
	public VarIntLS[] getVariables();
	public void propagateInt(VarIntLS x, int val);
	public void initPropagate();
	public LocalSearchManager getLocalSearchManager();	
	public boolean verify();
}
