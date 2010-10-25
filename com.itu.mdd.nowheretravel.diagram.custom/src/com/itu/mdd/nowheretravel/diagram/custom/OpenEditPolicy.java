package com.itu.mdd.nowheretravel.diagram.custom;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;

import com.itu.mdd.nowheretravel.model.nowheretravel.CarRental;

public class OpenEditPolicy extends org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy {

	private EditPart editpart;

	public OpenEditPolicy(EditPart editpart) {
		this.editpart = editpart;
	}

	@Override
	protected Command getOpenCommand(Request request) {
		return new Command() {
			
			@Override
			public void execute() {
				InputDialog d = new InputDialog(Display.getCurrent()
						.getActiveShell(), "Enter name of insurance",
						"Enter the name of the car insurance node",
						"Car insurance", null);
				if (d.open() == Window.OK) {
					// Now, create a command which creates an insurance node
					Node node = (Node) editpart.getModel();
					Diagram diagram = node.getDiagram();
					CarRental element = (CarRental) node.getElement();
					TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(element);
					CreateCarInsuranceCommand cmd = new CreateCarInsuranceCommand(domain, element, d.getValue(), diagram);
					try {
						cmd.execute(new NullProgressMonitor(), null);
					} catch (ExecutionException e) {
						e.printStackTrace();
					}
				}
			}
		};
	}
}
