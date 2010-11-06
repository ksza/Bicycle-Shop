/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.itu.mdd.nbs.model.nowarebicycleshop.impl;

import dk.itu.mdd.nbs.model.nowarebicycleshop.Bicycle;
import dk.itu.mdd.nbs.model.nowarebicycleshop.CustomerData;
import dk.itu.mdd.nbs.model.nowarebicycleshop.NowarebicycleshopPackage;
import dk.itu.mdd.nbs.model.nowarebicycleshop.Parameter;
import dk.itu.mdd.nbs.model.nowarebicycleshop.Part;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bicycle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.nbs.model.nowarebicycleshop.impl.BicycleImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link dk.itu.mdd.nbs.model.nowarebicycleshop.impl.BicycleImpl#getCustomerData <em>Customer Data</em>}</li>
 *   <li>{@link dk.itu.mdd.nbs.model.nowarebicycleshop.impl.BicycleImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link dk.itu.mdd.nbs.model.nowarebicycleshop.impl.BicycleImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link dk.itu.mdd.nbs.model.nowarebicycleshop.impl.BicycleImpl#getDeliveryDate <em>Delivery Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BicycleImpl extends EObjectImpl implements Bicycle {
	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> parts;

	/**
	 * The cached value of the '{@link #getCustomerData() <em>Customer Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerData()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerData> customerData;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DELIVERY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected Date deliveryDate = DELIVERY_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BicycleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NowarebicycleshopPackage.Literals.BICYCLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentEList<Part>(Part.class, this, NowarebicycleshopPackage.BICYCLE__PARTS);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerData> getCustomerData() {
		if (customerData == null) {
			customerData = new EObjectContainmentEList<CustomerData>(CustomerData.class, this, NowarebicycleshopPackage.BICYCLE__CUSTOMER_DATA);
		}
		return customerData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, NowarebicycleshopPackage.BICYCLE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getPrice() {
		price = 0.0d;
		
		for(Part part: getParts()) {
			price += part.getPrice();
		}
		
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NowarebicycleshopPackage.BICYCLE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryDate(Date newDeliveryDate) {
		Date oldDeliveryDate = deliveryDate;
		deliveryDate = newDeliveryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NowarebicycleshopPackage.BICYCLE__DELIVERY_DATE, oldDeliveryDate, deliveryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NowarebicycleshopPackage.BICYCLE__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
			case NowarebicycleshopPackage.BICYCLE__CUSTOMER_DATA:
				return ((InternalEList<?>)getCustomerData()).basicRemove(otherEnd, msgs);
			case NowarebicycleshopPackage.BICYCLE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NowarebicycleshopPackage.BICYCLE__PARTS:
				return getParts();
			case NowarebicycleshopPackage.BICYCLE__CUSTOMER_DATA:
				return getCustomerData();
			case NowarebicycleshopPackage.BICYCLE__PARAMETERS:
				return getParameters();
			case NowarebicycleshopPackage.BICYCLE__PRICE:
				return getPrice();
			case NowarebicycleshopPackage.BICYCLE__DELIVERY_DATE:
				return getDeliveryDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NowarebicycleshopPackage.BICYCLE__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends Part>)newValue);
				return;
			case NowarebicycleshopPackage.BICYCLE__CUSTOMER_DATA:
				getCustomerData().clear();
				getCustomerData().addAll((Collection<? extends CustomerData>)newValue);
				return;
			case NowarebicycleshopPackage.BICYCLE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case NowarebicycleshopPackage.BICYCLE__PRICE:
				setPrice((Double)newValue);
				return;
			case NowarebicycleshopPackage.BICYCLE__DELIVERY_DATE:
				setDeliveryDate((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NowarebicycleshopPackage.BICYCLE__PARTS:
				getParts().clear();
				return;
			case NowarebicycleshopPackage.BICYCLE__CUSTOMER_DATA:
				getCustomerData().clear();
				return;
			case NowarebicycleshopPackage.BICYCLE__PARAMETERS:
				getParameters().clear();
				return;
			case NowarebicycleshopPackage.BICYCLE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case NowarebicycleshopPackage.BICYCLE__DELIVERY_DATE:
				setDeliveryDate(DELIVERY_DATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NowarebicycleshopPackage.BICYCLE__PARTS:
				return parts != null && !parts.isEmpty();
			case NowarebicycleshopPackage.BICYCLE__CUSTOMER_DATA:
				return customerData != null && !customerData.isEmpty();
			case NowarebicycleshopPackage.BICYCLE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case NowarebicycleshopPackage.BICYCLE__PRICE:
				return price != PRICE_EDEFAULT;
			case NowarebicycleshopPackage.BICYCLE__DELIVERY_DATE:
				return DELIVERY_DATE_EDEFAULT == null ? deliveryDate != null : !DELIVERY_DATE_EDEFAULT.equals(deliveryDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (price: ");
		result.append(price);
		result.append(", deliveryDate: ");
		result.append(deliveryDate);
		result.append(')');
		return result.toString();
	}

} //BicycleImpl
