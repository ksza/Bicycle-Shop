/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.itu.mdd.nbs.model.nowarebicycleshop.impl;

import dk.itu.mdd.nbs.model.nowarebicycleshop.Manufacturers;
import dk.itu.mdd.nbs.model.nowarebicycleshop.NowarebicycleshopPackage;
import dk.itu.mdd.nbs.model.nowarebicycleshop.Part;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.itu.mdd.nbs.model.nowarebicycleshop.impl.PartImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link dk.itu.mdd.nbs.model.nowarebicycleshop.impl.PartImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link dk.itu.mdd.nbs.model.nowarebicycleshop.impl.PartImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PartImpl extends NodeImpl implements Part {
	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated NOT
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 10.0;

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
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final Manufacturers MANUFACTURER_EDEFAULT = Manufacturers.SUPER_PARTS;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected Manufacturers manufacturer = MANUFACTURER_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final byte ID_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected byte id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NowarebicycleshopPackage.Literals.PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, NowarebicycleshopPackage.PART__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manufacturers getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(Manufacturers newManufacturer) {
		Manufacturers oldManufacturer = manufacturer;
		manufacturer = newManufacturer == null ? MANUFACTURER_EDEFAULT : newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NowarebicycleshopPackage.PART__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(byte newId) {
		byte oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NowarebicycleshopPackage.PART__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NowarebicycleshopPackage.PART__PRICE:
				return getPrice();
			case NowarebicycleshopPackage.PART__MANUFACTURER:
				return getManufacturer();
			case NowarebicycleshopPackage.PART__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NowarebicycleshopPackage.PART__PRICE:
				setPrice((Double)newValue);
				return;
			case NowarebicycleshopPackage.PART__MANUFACTURER:
				setManufacturer((Manufacturers)newValue);
				return;
			case NowarebicycleshopPackage.PART__ID:
				setId((Byte)newValue);
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
			case NowarebicycleshopPackage.PART__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case NowarebicycleshopPackage.PART__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case NowarebicycleshopPackage.PART__ID:
				setId(ID_EDEFAULT);
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
			case NowarebicycleshopPackage.PART__PRICE:
				return price != PRICE_EDEFAULT;
			case NowarebicycleshopPackage.PART__MANUFACTURER:
				return manufacturer != MANUFACTURER_EDEFAULT;
			case NowarebicycleshopPackage.PART__ID:
				return id != ID_EDEFAULT;
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
		result.append(", manufacturer: ");
		result.append(manufacturer);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PartImpl
