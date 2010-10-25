package com.itu.mdd.nowheretravel.diagram.custom;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;

import com.itu.mdd.nowheretravel.model.nowheretravel.diagram.edit.parts.CarRentalEditPart;

public class EditPolicyProvider extends AbstractProvider implements IEditPolicyProvider {

	@Override
	public void createEditPolicies(EditPart editPart) {
		editPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenEditPolicy(editPart));
	}

	@Override
	public boolean provides(IOperation operation) {
		if(operation instanceof CreateEditPoliciesOperation){
			EditPart part = ((CreateEditPoliciesOperation) operation).getEditPart();
			if(part instanceof CarRentalEditPart){
				return true;
			}
		}
		return false;
	}
}
