package it.reexon.files.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Copyright (c) 2016 Marco Velluto. All rights reserved.
 */

/**
 * @author Marco Velluto
 * @since Java 1.8
 */
public class Shell
{
    private static final Logger logger = LogManager.getLogger(Shell.class);

    public static void main(String[] args)
    {
        logger.debug("Beging");
        try
        {
            
        }
        catch (Exception e)
        {
            logger.fatal("Fatal Error: ", e);
        }
        logger.debug("Finish");
    }

}
