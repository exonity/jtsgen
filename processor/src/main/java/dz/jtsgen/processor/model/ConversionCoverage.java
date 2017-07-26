/*
 * Copyright (c) 2017 Dragan Zuvic
 *
 * This file is part of jtsgen.
 *
 * jtsgen is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * jtsgen is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jtsgen.  If not, see http://www.gnu.org/licenses/
 *
 */

package dz.jtsgen.processor.model;

/**
 * The conversion can be triggered by a type mapping from a super type, e.g. {@code java.lang.Number -> number }
 *
 */
public enum ConversionCoverage {

    /** direct mapping only*/
    DIRECT("|->"),

    /** include all subtypes of*/
    SUBTYPES("->");

    private final String arrowLiteral;

    ConversionCoverage(String arrowLiteral) {
        this.arrowLiteral = arrowLiteral;
    }

    public String arrowLiteral() {
        return arrowLiteral;
    }
}
