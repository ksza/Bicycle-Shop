/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.itu.mdd.nowheretravel.model.nowheretravel.util;

import com.itu.mdd.nowheretravel.model.nowheretravel.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.itu.mdd.nowheretravel.model.nowheretravel.NowheretravelPackage
 * @generated
 */
public class NowheretravelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final NowheretravelValidator INSTANCE = new NowheretravelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.itu.mdd.nowheretravel.model.nowheretravel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NowheretravelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return NowheretravelPackage.eINSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStart(Start start, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(start, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(start, diagnostics, context);
		if (result || diagnostics != null) result &= validateStart_noIngoingConnection(start, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noIngoingConnection constraint of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStart_noIngoingConnection(Start start, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean condition = start.getIngoingConnections().size() == 0;
		
		if (! condition) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "noIngoingConnection", getObjectLabel(start, context) },
						 new Object[] { start },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnd(End end, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(end, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(end, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(end, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnd_noOtgoingConnection(end, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noOtgoingConnection constraint of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEnd_noOtgoingConnection(End end, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean condition = end.getOutgoingConnections().size() == 0;
		
		if (! condition) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "noOtgoingConnection", getObjectLabel(end, context) },
						 new Object[] { end },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(item, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(item, diagnostics, context);
		if (result || diagnostics != null) result &= validateItem_linkedConnections(item, diagnostics, context);
		return result;
	}

	/**
	 * Validates the linkedConnections constraint of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateItem_linkedConnections(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean condition = item.getIngoingConnections().size() >= 1 && item.getOutgoingConnections().size() >= 1;
		
		if (! condition) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "linkedConnections", getObjectLabel(item, context) },
						 new Object[] { item },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarRental(CarRental carRental, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(carRental, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(carRental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(carRental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(carRental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(carRental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(carRental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(carRental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(carRental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(carRental, diagnostics, context);
		if (result || diagnostics != null) result &= validateItem_linkedConnections(carRental, diagnostics, context);
		if (result || diagnostics != null) result &= validateCarRental_followedByCarInsurance(carRental, diagnostics, context);
		return result;
	}

	/**
	 * Validates the followedByCarInsurance constraint of '<em>Car Rental</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCarRental_followedByCarInsurance(CarRental carRental, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean condition = false;
		for(Connection con: carRental.getOutgoingConnections()) {
			if(con.getTargetNode() instanceof Insurance && ((Insurance)con.getTargetNode()).getType() == InsuranceType.CAR_INSURANCE) {
				condition = true;
				break;
			}
		}
		
		if (! condition) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "followedByCarInsurance", getObjectLabel(carRental, context) },
						 new Object[] { carRental },
						 context));
			}
			return false;
		}
		return true;
	}

} //NowheretravelValidator
