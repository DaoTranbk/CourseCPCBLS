package khmtk60.miniprojects.G10.localsearch.functions.sum;


import khmtk60.miniprojects.G10.localsearch.model.*;
import khmtk60.miniprojects.G10.localsearch.model.IFunction;
import khmtk60.miniprojects.G10.localsearch.model.VarIntLS;

public class SumFunConstraints extends AbstractInvariant implements IFunction {

	public SumFunConstraints(IFunction[] f, IConstraint[] c){
		// semantic: \sum_{i = 0..f.length-1}f[i]*(c[i].violations() == 0)
	}
	@Override
	public int getMinValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAssignDelta(VarIntLS x, int val) {
		// TODO Auto-generated method stub
		System.exit(1);
		return 0;
	}

	@Override
	public int getSwapDelta(VarIntLS x, VarIntLS y) {
		// TODO Auto-generated method stub
		return 0;
	}

}
