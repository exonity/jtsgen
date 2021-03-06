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

package dz.jtsgen.processor.util;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * Simple class, that marks
 */
public class ToDo {
    public static <R> R todo(String ... msg) {
        throw new NotImplented(msg);
    }

    public static RuntimeException todoEx(String ... msg) {
        return new NotImplented(msg);
    }
}

class NotImplented extends RuntimeException {
    NotImplented(String[] msg) {
        super(createMessageString(msg));
    }

    private static String createMessageString(String[] msg) {
        return msg==null || msg.length == 0 || msg[0] == null ?
                "no description"
                : Arrays.stream(msg).collect(Collectors.joining());
    }
}
