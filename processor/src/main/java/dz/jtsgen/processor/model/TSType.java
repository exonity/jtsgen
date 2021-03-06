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

import dz.jtsgen.processor.model.rendering.TSTypeElement;
import org.immutables.value.Value;

import javax.lang.model.element.Element;
import java.util.List;
import java.util.Optional;

import static dz.jtsgen.processor.util.StringUtils.lastOf;
import static dz.jtsgen.processor.util.StringUtils.untill;

/**
 * This type contains all iformation about a converted type
 */
public abstract class TSType implements TSTypeElement {


    @Value.Default
    public String getNamespace() {
        return untill(this.getElement().toString());
    }

    @Value.Default
    public String getName() {
        return lastOf(this.getElement().toString());
    }

    public abstract List<TSMember> getMembers();

    public abstract Optional<String> getDocumentString();

    public abstract List<TSType> getSuperTypes();

    public abstract List<TSTypeVariable> getTypeParams();

    @Value.Parameter
    public abstract Element getElement();

    public abstract String getKeyword();
    
    public abstract TSType changedNamespace(String namespace, List<TSMember> members);
}
