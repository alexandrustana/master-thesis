package properites.xclass;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.jdt.core.dom.ITypeBinding;

import com.salexandru.xcore.utils.interfaces.IPropertyComputer;
import com.salexandru.xcore.utils.metaAnnotation.PropertyComputer;

import exampletool.metamodel.entity.XClass;
import utils.Pair;

@PropertyComputer
public class GenericParametersApertureProperty implements IPropertyComputer<Double, XClass> {

	@Override
	public Double compute(XClass entity) {
		entity.genericParametersAllUsages();
		List<Pair<List<ITypeBinding>, List<List<ITypeBinding>>>> allUsages = entity.genericParametersAllUsages().getElements().stream()
				.map(t -> t.getUnderlyingObject()).collect(Collectors.toList());
		List<ITypeBinding> allTypes = entity.genericParametersAllTypes().getElements().stream()//FIXME here is something wrong
				.map(t -> t.getUnderlyingObject()).collect(Collectors.toList());

		return 0d;
	}

	// FIXME possible naming; closed aperture | accepted aperture

}
