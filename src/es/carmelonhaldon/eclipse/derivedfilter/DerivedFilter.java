package es.carmelonhaldon.eclipse.derivedfilter;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class DerivedFilter extends ViewerFilter {

	public boolean select(Viewer arg0, Object arg1, Object element) {

		// if (element instanceof ICompilationUnit) {
		// try {
		// ICompilationUnit cu = (ICompilationUnit) element;
		// if (cu.getUnderlyingResource() != null) {
		// return !ROO_AJ_PATTERN.matcher(cu.getUnderlyingResource().getName()).matches();
		// }
		// }
		// catch (JavaModelException e) {
		// // just ignore this here
		// }
		// }
		// return true;

		if (!(element instanceof IResource)) {
			return true;
		}

		IResource resource = (IResource) element;

		return !resource.isDerived();
	}
}
