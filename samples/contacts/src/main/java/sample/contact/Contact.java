/*
 * The Acegi Security System for Spring is published under the terms
 * of the Apache Software License.
 *
 * Visit http://acegisecurity.sourceforge.net for further details.
 */

package sample.contact;

/**
 * Represents a contact.
 * 
 * <P>
 * <code>id</code> and <code>owner</code> are immutable.
 * </p>
 *
 * @author Ben Alex
 * @version $Id$
 */
public class Contact {
    //~ Instance fields ========================================================

    private Integer id;
    private String email;
    private String name;
    private String owner;

    //~ Constructors ===========================================================

    public Contact(Integer id, String name, String email, String owner) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.owner = owner;
    }

    private Contact() {
        super();
    }

    //~ Methods ================================================================

    /**
     * DOCUMENT ME!
     *
     * @param email The email to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * DOCUMENT ME!
     *
     * @return Returns the email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * DOCUMENT ME!
     *
     * @return Returns the id.
     */
    public Integer getId() {
        return id;
    }

    /**
     * DOCUMENT ME!
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * DOCUMENT ME!
     *
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * DOCUMENT ME!
     *
     * @return Returns the owner.
     */
    public String getOwner() {
        return owner;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(super.toString() + ": ");
        sb.append("Id: " + this.getId() + "; ");
        sb.append("Name: " + this.getName() + "; ");
        sb.append("Email: " + this.getEmail() + "; ");
        sb.append("Owner: " + this.getOwner());

        return sb.toString();
    }
}
