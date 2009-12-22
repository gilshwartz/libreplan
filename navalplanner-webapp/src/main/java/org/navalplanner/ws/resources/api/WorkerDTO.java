/*
 * This file is part of ###PROJECT_NAME###
 *
 * Copyright (C) 2009 Fundación para o Fomento da Calidade Industrial e
 *                    Desenvolvemento Tecnolóxico de Galicia
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.navalplanner.ws.resources.api;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * DTO for <code>Worker</code> entity.
 *
 * @author Fernando Bellas Permuy <fbellas@udc.es>
 */
public class WorkerDTO extends ResourceDTO {

    @XmlAttribute(name="first-name")
    public String firstName;

    @XmlAttribute
    public String surname;

    @XmlAttribute
    public String nif;

    public WorkerDTO() {}

    public WorkerDTO(String firstName, String surname, String nif) {
        this.firstName = firstName;
        this.surname = surname;
        this.nif = nif;
    }

    @Override
    public String getUserProvidedId() {

        return "worker" + '-' + firstName + '-' + surname + '-' + nif;
    }

}
