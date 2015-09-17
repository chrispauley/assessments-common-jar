package org.hros.assessments.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAnyElement;

/**
 * Generic collection wrapper class.
 *
 * Makes it easier to (un)marshall a collectiono of a single type.
 *
 * @author Arno Moonen <info@arnom.nl>
 */
public class JAXBCollection<T>
{
    @XmlAnyElement (lax = true)
    private List<T> items;

    public JAXBCollection(Collection<T> contents)
    {
        if (contents instanceof List)
        {
            items = (List<T>) contents;
        }
        else
        {
            items = new ArrayList<T>(contents);
        }

    }

    public JAXBCollection()
    {
        this(new ArrayList<T>());
    }

    public List<T> getItems()
    {
        return items;
    }

}
