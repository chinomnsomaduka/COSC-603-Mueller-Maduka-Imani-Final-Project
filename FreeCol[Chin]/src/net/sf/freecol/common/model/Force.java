/**
 *  Copyright (C) 2002-2016   The FreeCol Team
 *
 *  This file is part of FreeCol.
 *
 *  FreeCol is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.freecol.common.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;

import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.model.Ability;
import net.sf.freecol.common.model.AbstractUnit;
import net.sf.freecol.common.model.Force;
import net.sf.freecol.common.model.FreeColSpecObject;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.model.UnitType;
import static net.sf.freecol.common.util.CollectionUtils.*;


// TODO: Auto-generated Javadoc
/**
 * A group of units with a common origin and purpose.
 */
public class Force extends FreeColSpecObject {

    /** The number of land units in the REF. */
    private final List<AbstractUnit> landUnits = new ArrayList<>();

    /** The number of naval units in the REF. */
    private final List<AbstractUnit> navalUnits = new ArrayList<>();

    // Internal variables that do not need serialization.
    /** The space required to transport all land units. */
    private int spaceRequired;

    /** The current naval transport capacity. */
    private int capacity;


    /**
     * Basic constructor.
     *
     * @param specification The <code>Specification</code> for this object.
     */
    public Force(Specification specification) {
        super(specification);
    }

    /**
     * Create a new Force.
     *
     * @param specification The <code>Specification</code> for this object.
     * @param units A list of <code>AbstractUnit</code>s defining the force.
     * @param ability An optional ability name required of the units
     *     in the force.
     */
    public Force(Specification specification, List<AbstractUnit> units,
                 String ability) {
        this(specification);
        absractrefac(specification, units, ability);
        updateSpaceAndCapacity();
    }

	/**
	 * Absractrefac.
	 *
	 * @param specification the specification
	 * @param units the units
	 * @param ability the ability
	 */
	private void absractrefac(Specification specification,
			List<AbstractUnit> units, String ability) {
		for (AbstractUnit unit : units) {
            UnitType unitType = unit.getType(specification);
            unittyperefact(ability, unit, unitType);
        }
	}

	/**
	 * Unittyperefact.
	 *
	 * @param ability the ability
	 * @param unit the unit
	 * @param unitType the unit type
	 */
	private void unittyperefact(String ability, AbstractUnit unit,
			UnitType unitType) {
		unitabilityrefac(ability, unit, unitType);
	}

	/**
	 * Unitabilityrefac.
	 *
	 * @param ability the ability
	 * @param unit the unit
	 * @param unitType the unit type
	 */
	private void unitabilityrefac(String ability, AbstractUnit unit,
			UnitType unitType) {
		hasabilityrefact(ability, unit, unitType);
	}

	/**
	 * Hasabilityrefact.
	 *
	 * @param ability the ability
	 * @param unit the unit
	 * @param unitType the unit type
	 */
	private void hasabilityrefact(String ability, AbstractUnit unit,
			UnitType unitType) {
		if (ability == null || unitType.hasAbility(ability)) {
		    if (unitType.hasAbility(Ability.NAVAL_UNIT)) {
		        navalUnits.add(unit);
		    } else {
		        landUnits.add(unit);
		    }
		} else {
		    logger.warning("Found unit lacking required ability \""
		        + ability + "\": " + unit);
		}
	}


    /**
     * Get the cargo space required for the land units of this force.
     *
     * @return The required cargo space.
     */
    public final int getSpaceRequired() {
        return this.spaceRequired;
    }

    /**
     * Get the cargo space provided by the naval units of this force.
     *
     * @return The provided cargo space.
     */
    public final int getCapacity() {
        return this.capacity;
    }

    /**
     * Update the space and capacity variables.
     */
    public final void updateSpaceAndCapacity() {
        getSpecrefac();
    }

	/**
	 * Gets the specrefac.
	 *
	 * @return the specrefac
	 */
	private void getSpecrefac() {
		final Specification spec = getSpecification();
        getspeccapnspacrefac(spec);
	}

	/**
	 * Gets the speccapnspacrefac.
	 *
	 * @param spec the spec
	 * @return the speccapnspacrefac
	 */
	private void getspeccapnspacrefac(final Specification spec) {
		this.capacity = sum(this.navalUnits,
            nu -> nu.getType(spec).canCarryUnits(),
            nu -> nu.getType(spec).getSpace() * nu.getNumber());
        this.spaceRequired = sum(this.landUnits,
            lu -> lu.getType(spec).getSpaceTaken() * lu.getNumber());
	}

    /**
     * Gets all units.
     *
     * @return A copy of the list of all units.
     */
    public final List<AbstractUnit> getUnits() {
        List<AbstractUnit> result = getLandUnits();
        result.addAll(getNavalUnits());
        return result;
    }

    /**
     * Gets the naval units.
     *
     * @return A copy of the list of the naval units.
     */
    public final List<AbstractUnit> getNavalUnits() {
        return AbstractUnit.deepCopy(this.navalUnits);
    }

    /**
     * Gets the land units.
     *
     * @return A list of the  land units.
     */
    public final List<AbstractUnit> getLandUnits() {
        return AbstractUnit.deepCopy(this.landUnits);
    }

    /**
     * Is this Force empty?.
     *
     * @return True if there are no land or naval units.
     */
    public final boolean isEmpty() {
        return this.landUnits.isEmpty() && this.navalUnits.isEmpty();
    }

    /**
     * Adds units to this Force.
     *
     * @param au The addition to this Force.
     */
    public void add(AbstractUnit au) {
        final Specification spec = getSpecification();
        final UnitType unitType = au.getType(spec);
        final int n = au.getNumber();
        boolean added = false;
        hasAbility2refac(au, spec, unitType, n, added);
    }

	/**
	 * Checks for ability2refac.
	 *
	 * @param au the au
	 * @param spec the spec
	 * @param unitType the unit type
	 * @param n the n
	 * @param added the added
	 */
	private void hasAbility2refac(AbstractUnit au, final Specification spec,
			final UnitType unitType, final int n, boolean added) {
		abstractunit3refac(au, spec, unitType, n, added);
        updateSpaceAndCapacity();
	}

	/**
	 * Abstractunit3refac.
	 *
	 * @param au the au
	 * @param spec the spec
	 * @param unitType the unit type
	 * @param n the n
	 * @param added the added
	 */
	private void abstractunit3refac(AbstractUnit au, final Specification spec,
			final UnitType unitType, final int n, boolean added) {
		hasAbility4(au, spec, unitType, n, added);
	}

	/**
	 * Checks for ability4.
	 *
	 * @param au the au
	 * @param spec the spec
	 * @param unitType the unit type
	 * @param n the n
	 * @param added the added
	 */
	private void hasAbility4(AbstractUnit au, final Specification spec,
			final UnitType unitType, final int n, boolean added) {
		if (unitType.hasAbility(Ability.NAVAL_UNIT)) {
            for (AbstractUnit refUnit : navalUnits) {
                if (spec.getUnitType(refUnit.getId()) == unitType) {
                    refUnit.setNumber(refUnit.getNumber() + n);
                    if (unitType.canCarryUnits()) {
                        this.capacity += unitType.getSpace() * n;
                    }
                    added = true;
                    break;
                }
            }
            if (!added) navalUnits.add(au);
        } else {
            for (AbstractUnit refUnit : landUnits) {
                if (spec.getUnitType(refUnit.getId()) == unitType
                    && refUnit.getRoleId().equals(au.getRoleId())) {
                    refUnit.setNumber(refUnit.getNumber() + n);
                    spaceRequired += unitType.getSpaceTaken() * n;
                    added = true;
                    break;
                }
            }
            if (!added) this.landUnits.add(au);
        }
	}

    /**
     * Calculate the approximate offence power of this force.
     *
     * @param naval If true, consider only naval units, otherwise
     *     consider the land units.
     * @return The approximate offence power.
     */
    public double calculateStrength(boolean naval) {
        return AbstractUnit.calculateStrength(getSpecification(),
            (naval) ? this.navalUnits : this.landUnits);
    }

    /**
     * Fix old ref roles.
     */
    // @compat 0.10.x
    public void fixOldREFRoles() {
        Iterator<AbstractUnit> aui = landUnits.iterator();
        List<AbstractUnit> todo = new ArrayList<>();
        while (aui.hasNext()) {
            AbstractUnit au = aui.next();
            if ("SOLDIER".equals(au.getRoleId())
                || "model.role.soldier".equals(au.getRoleId())) {
                au.setRoleId("model.role.infantry");
                aui.remove();
                todo.add(au);
            } else if ("DRAGOON".equals(au.getRoleId())
                || "model.role.dragoon".equals(au.getRoleId())) {
                au.setRoleId("model.role.cavalry");
                aui.remove();
                todo.add(au);
            }
        }
        while (!todo.isEmpty()) add(todo.remove(0));
    }
    // end @compat 0.10.x

                    
    // Serialization

    /** The Constant LAND_UNITS_TAG. */
    public static final String LAND_UNITS_TAG = "landUnits";
    
    /** The Constant NAVAL_UNITS_TAG. */
    public static final String NAVAL_UNITS_TAG = "navalUnits";
    // @compat 0.10.5
    // public for now, revert to private
    // end @compat


    /**
     * {@inheritDoc}
     */
    @Override
    public void toXML(FreeColXMLWriter xw, String tag) throws XMLStreamException {
        xw.writeStartElement(tag);

        xw.writeStartElement(NAVAL_UNITS_TAG);

        for (AbstractUnit unit : navalUnits) unit.toXML(xw);

        xw.writeEndElement();

        xw.writeStartElement(LAND_UNITS_TAG);

        for (AbstractUnit unit : landUnits) unit.toXML(xw);

        xw.writeEndElement();

        xw.writeEndElement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void readFromXML(FreeColXMLReader xr) throws XMLStreamException {
        // Clear containers.
        navalUnits.clear();
        landUnits.clear();

        while (xr.nextTag() != XMLStreamConstants.END_ELEMENT) {
            freeColXMLRevfac(xr);
        }
    }

	/**
	 * Free col xml revfac.
	 *
	 * @param xr the xr
	 * @throws XMLStreamException the XML stream exception
	 */
	private void freeColXMLRevfac(FreeColXMLReader xr)
			throws XMLStreamException {
		final String tag = xr.getLocalName();

		freeColandStrinrefac(xr, tag);
	}

	/**
	 * Free coland strinrefac.
	 *
	 * @param xr the xr
	 * @param tag the tag
	 * @throws XMLStreamException the XML stream exception
	 */
	private void freeColandStrinrefac(FreeColXMLReader xr, final String tag)
			throws XMLStreamException {
		landUnittagrefac(xr, tag);
	}

	/**
	 * Land unittagrefac.
	 *
	 * @param xr the xr
	 * @param tag the tag
	 * @throws XMLStreamException the XML stream exception
	 */
	private void landUnittagrefac(FreeColXMLReader xr, final String tag)
			throws XMLStreamException {
		if (LAND_UNITS_TAG.equals(tag)) {
		    while (xr.nextTag() != XMLStreamConstants.END_ELEMENT) {
		        add(new AbstractUnit(xr));
		    }
		} else if (NAVAL_UNITS_TAG.equals(tag)) {
		    while (xr.nextTag() != XMLStreamConstants.END_ELEMENT) {
		        add(new AbstractUnit(xr));
		    }
		} else {
		    logger.warning("Bogus Force tag: " + tag);
		}
	}

    /**
     * {@inheritDoc}
     */
    @Override
    public String getXMLTagName() { return getTagName(); }

    /**
     * Gets the tag name of the root element representing this object.
     *
     * @return "force".
     */
    public static String getTagName() {
        return "force";
    }
}

