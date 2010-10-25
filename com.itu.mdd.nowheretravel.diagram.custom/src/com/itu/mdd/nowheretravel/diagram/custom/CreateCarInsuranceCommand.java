package com.itu.mdd.nowheretravel.diagram.custom;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;

import com.itu.mdd.nowheretravel.model.nowheretravel.CarRental;
import com.itu.mdd.nowheretravel.model.nowheretravel.Connection;
import com.itu.mdd.nowheretravel.model.nowheretravel.Insurance;
import com.itu.mdd.nowheretravel.model.nowheretravel.InsuranceType;
import com.itu.mdd.nowheretravel.model.nowheretravel.NowheretravelFactory;
import com.itu.mdd.nowheretravel.model.nowheretravel.NowheretravelPackage;
import com.itu.mdd.nowheretravel.model.nowheretravel.Travel;
import com.itu.mdd.nowheretravel.model.nowheretravel.diagram.part.TravelDiagramEditorPlugin;

public class CreateCarInsuranceCommand extends AbstractTransactionalCommand {
	private String name ;
	private CarRental rental;
	private Diagram diagram;
	
	public CreateCarInsuranceCommand(TransactionalEditingDomain domain, CarRental rental, String name, Diagram diagram) {
		super(domain, "No label", null);
		this.name=name;
		this.rental = rental;
		this.diagram = diagram;
	}
	
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		// Create domain element
		Insurance insurance = NowheretravelFactory.eINSTANCE.createInsurance();
		insurance.setName(name);
		insurance.setType(InsuranceType.CAR_INSURANCE);
		Connection connection = NowheretravelFactory.eINSTANCE.createConnection();
		connection.setSourceNode(rental);
		connection.setTargetNode(insurance);
		Travel travel = (Travel) rental.eContainer();
		travel.getItems().add(insurance);
		travel.getConnections().add(connection);
		
		// Create Node
		Node insuranceNode = ViewService.createNode(diagram, travel,
				NowheretravelPackage.Literals.INSURANCE.getName(),
				TravelDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		
		return CommandResult.newOKCommandResult();
	}
}