/*
 * The Acegi Security System for Spring is published under the terms
 * of the Apache Software License.
 *
 * Visit http://acegisecurity.sourceforge.net for further details.
 */

package net.sf.acegisecurity;

/**
 * Processes an {@link Authentication} request.
 *
 * @author Ben Alex
 * @version $Id$
 */
public interface AuthenticationManager {
    //~ Methods ================================================================

    /**
     * Attempts to authenticate the passed {@link Authentication} object,
     * returning a fully populated <code>Authentication</code> object
     * (including granted authorities) if successful.
     * 
     * <p>
     * An <code>AuthenticationManager</code> must honour the following contract
     * concerning exceptions:
     * </p>
     * 
     * <p>
     * A {@link DisabledException} must be thrown if an account is disabled and
     * the <code>AuthenticationManager</code> can test for this state.
     * </p>
     * 
     * <p>
     * A {@link LockedException} must be thrown if an account is locked and the
     * <code>AuthenticationManager</code> can test for account locking.
     * </p>
     * 
     * <p>
     * A {@link BadCredentialsException} must be thrown if incorrect
     * credentials are presented. Whilst the above exceptions are optional, an
     * <code>AuthenticationManager</code> must <B>always</B> test credentials.
     * </p>
     * 
     * <p>
     * Exceptions should be tested for and if applicable thrown in the order
     * expressed above (ie if an account is disabled or locked, the
     * authentication request is immediately rejected and the credentials
     * testing process is not performed). This prevents credentials being
     * tested against  disabled or locked accounts.
     * </p>
     *
     * @param authentication the authentication request object
     *
     * @return a fully authenticated object including credentials
     *
     * @throws AuthenticationException if authentication fails
     */
    public Authentication authenticate(Authentication authentication)
                                throws AuthenticationException;
}
