package thesis.metamodel.impl;

import thesis.metamodel.entity.*;
import upt.se.parameters.pair.ToString;
import upt.se.parameters.pair.ApertureCoverage;
import upt.se.parameters.pair.IsBounded;
import upt.se.parameters.pair.UsedArgumentsTypes;
import upt.se.parameters.pair.PossibleConcreteTypes;
import upt.se.parameters.pair.UnusedArgumentsTypes;

public class MParameterPairImpl implements MParameterPair {

	private upt.se.utils.ParameterPair underlyingObj_;

	private static final ToString ToString_INSTANCE = new ToString();
	private static final ApertureCoverage ApertureCoverage_INSTANCE = new ApertureCoverage();
	private static final IsBounded IsBounded_INSTANCE = new IsBounded();
	private static final UsedArgumentsTypes UsedArgumentsTypes_INSTANCE = new UsedArgumentsTypes();
	private static final PossibleConcreteTypes PossibleConcreteTypes_INSTANCE = new PossibleConcreteTypes();
	private static final UnusedArgumentsTypes UnusedArgumentsTypes_INSTANCE = new UnusedArgumentsTypes();

	public MParameterPairImpl(upt.se.utils.ParameterPair underlyingObj) {
		underlyingObj_ = underlyingObj;
	}

	@Override
	public upt.se.utils.ParameterPair getUnderlyingObject() {
		return underlyingObj_;
	}

	@Override
	@ro.lrg.xcore.metametamodel.ThisIsAProperty
	public java.lang.String toString() {
		return ToString_INSTANCE.compute(this);
	}

	@Override
	@ro.lrg.xcore.metametamodel.ThisIsAProperty
	public java.lang.Double apertureCoverage() {
		return ApertureCoverage_INSTANCE.compute(this);
	}

	@Override
	@ro.lrg.xcore.metametamodel.ThisIsAProperty
	public java.lang.Boolean isBounded() {
		return IsBounded_INSTANCE.compute(this);
	}

	@Override
	@ro.lrg.xcore.metametamodel.ThisIsARelationBuilder
	public ro.lrg.xcore.metametamodel.Group<MClassPair> usedArgumentsTypes() {
		return UsedArgumentsTypes_INSTANCE.buildGroup(this);
	}

	@Override
	@ro.lrg.xcore.metametamodel.ThisIsARelationBuilder
	public ro.lrg.xcore.metametamodel.Group<MClassPair> possibleConcreteTypes() {
		return PossibleConcreteTypes_INSTANCE.buildGroup(this);
	}

	@Override
	@ro.lrg.xcore.metametamodel.ThisIsARelationBuilder
	public ro.lrg.xcore.metametamodel.Group<MClassPair> unusedArgumentsTypes() {
		return UnusedArgumentsTypes_INSTANCE.buildGroup(this);
	}

	public boolean equals(Object obj) {
		if (null == obj || !(obj instanceof MParameterPairImpl)) {
			return false;
		}
		MParameterPairImpl iObj = (MParameterPairImpl)obj;
		return underlyingObj_.equals(iObj.underlyingObj_);
	}

	public int hashCode() {
		return 97 * underlyingObj_.hashCode();
	}
}
