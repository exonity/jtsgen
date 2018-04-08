/*
 * Copyright (c) 2018 Dragan Zuvic
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

package dz.jtsgen.processor.mapper.name;

/**
 * This mapper represents the identity function
 */
public class JacksonDefaultNameMapper implements NameMapper {

    @Override
    public String mapMemberName(String rawName) {
        if (rawName == null) return null;
        else if (rawName.length()==0) return "";
        else if (rawName.length()==1) return String.valueOf(Character.toLowerCase(rawName.charAt(0)));
        // TODO fully implement, e.g. handling _
        return Character.toLowerCase(rawName.charAt(0)) + rawName.substring(1);
    }

}