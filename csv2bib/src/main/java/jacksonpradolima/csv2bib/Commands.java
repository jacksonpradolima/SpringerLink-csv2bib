/*
 * Copyright (C) 2017 Jackson A. Prado Lima <jacksonpradolima at gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package jacksonpradolima.csv2bib;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

/**
 *
 * @author Jackson A. Prado Lima <jacksonpradolima at gmail.com>
 */
@Parameters(separators = " =")
public class Commands {

    @Parameter(names = {"-help", "-h"}, help = true)
    public boolean help;

    @Parameter(names = {"-fileIn", "-fi"}, description = "Input File", required = true)
    public String fileIn;

    @Parameter(names = {"-dl"}, description = "Digital Library", required = true)
    public String digitalLibrary;

    @Parameter(names = {"-doiIndex"}, description = "DOI index", required = true)
    public int doiIndex;

    @Parameter(names = {"-header"}, description = "Contains header?", arity = 1)
    public boolean header;
    
    @Parameter(names = {"-extension"}, description = "Extension for file export")
    public String extension;
}
