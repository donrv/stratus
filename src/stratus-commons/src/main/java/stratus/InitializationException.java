/* (c) Planet Labs Inc. - all rights reserved
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package stratus;

/**
 * Created by aaryno on 1/16/18.
 */
public class InitializationException extends Exception {
    public InitializationException(String message, Throwable t){
        super(message, t);
}
}
