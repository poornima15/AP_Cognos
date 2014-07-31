package com.jda.ap.bi.config;

import com.jda.ap.bi.bind.View;
import com.jda.ap.bi.cognos.config.IServiceConfig;
import com.jda.ap.bi.exception.ViewNotFoundException;
import com.jda.ap.reporting.enums.ViewTypeEnum;

import java.util.logging.Logger;

/**
 * User: Lee
 * Date: 7/30/2014
 * Time: 11:18 AM
 */
public class ConfigUtil
{
    private static ConfigUtil ourInstance = null;
    private static IServiceConfig _config = null;
    private static final Logger log = Logger.getLogger(ConfigUtil.class.getName());

    public static ConfigUtil getInstance(IServiceConfig config)
    {

        if (ourInstance == null)
        {
            ourInstance = new ConfigUtil(config);
        }
        return ourInstance;
    }

    private ConfigUtil(IServiceConfig config)
    {

        _config = config;
        log.info("Got config: " + _config);
    }


    /**
     * Get alias name for a hierarchy
     *
     * @param name
     * @return
     */
    public String getHierarchyAlias(String name)
    {
        log.info("Getting hierarchy alias for: " + name);
        return null;
    }


    public View getView(ViewTypeEnum type, String name) throws ViewNotFoundException
    {
        switch (type)
        {
            case HIERARCHY:
            {
                return getHierarchyView(name);
            }
            case PLAN:
            {
                return getPlanView(name);
            }
            case ATTRIBUTE:
            {
                return getAttributeView(name);
            }
        }

        throw new ViewNotFoundException(name);
    }


    /**
     * Get alias name for an attribute
     *
     * @param name
     * @return
     */
    public String getAttributeAlias(String name)
    {
        log.info("Getting attribute alias for: " + name);

        for (View view : _config.getServiceConfig().getViews().getAttributeViews().getView())
        {

            if (view.getAttributeDimensions().equalsIgnoreCase(name))
            {
                return view.getAlias();
            }
        }

        return null;
    }

    /**
     * Get alias name for an attribute
     *
     * @param name
     * @return
     */
    public String getPlanAlias(String name)
    {
        log.info("Getting plan alias for: " + name);

        for (View view : _config.getServiceConfig().getViews().getPlanViews().getView())
        {

            if (view.getAttributeDimensions().equalsIgnoreCase(name))
            {
                return view.getAlias();
            }
        }

        return null;
    }

    /**
     * Get an attribute view - view is a config view , not a database view
     *
     * @param viewName
     * @return
     * @throws ViewNotFoundException
     */
    public View getAttributeView(String viewName) throws ViewNotFoundException
    {
        for (View view : _config.getServiceConfig().getViews().getAttributeViews().getView())
        {

            if (view.getAttributeDimensions().equalsIgnoreCase(viewName))
            {
                return view;
            }
        }

        throw new ViewNotFoundException(viewName);
    }


    /**
     * Get a plan view - view is a config view , not a database view
     *
     * @param viewName
     * @return
     * @throws ViewNotFoundException
     */
    public View getPlanView(String viewName) throws ViewNotFoundException
    {
        for (View view : _config.getServiceConfig().getViews().getPlanViews().getView())
        {
            if (view.getAttributeDimensions().equalsIgnoreCase(viewName))
            {
                return view;
            }
        }

        throw new ViewNotFoundException(viewName);
    }

    /**
     * Get a hierarchy view - view is a config view , not a database view
     *
     * @param viewName
     * @return
     * @throws ViewNotFoundException
     */
    public View getHierarchyView(String viewName) throws ViewNotFoundException
    {
        for (View view : _config.getServiceConfig().getViews().getHierarchyViews().getView())
        {
            if (view.getAttributeDimensions().equalsIgnoreCase(viewName))
            {
                return view;
            }
        }

        throw new ViewNotFoundException(viewName);
    }

    /**
     * Add a view to the config
     *
     * @param type
     * @param viewName
     */
    public void addView(ViewTypeEnum type, String viewName, String alias)
    {
        switch (type)
        {
            //@todo add plan/hierarchy additions
            case ATTRIBUTE:
            {
                View newView = new View();
                newView.setColumns("Name");
                if (alias != null)
                {
                    newView.setAlias(alias);
                }
                else
                {
                    newView.setAlias(viewName);
                }
                newView.setIgnore("false");
                newView.setAttributeDimensions(viewName);
                _config.getServiceConfig().getViews().getAttributeViews().getView().add(newView);
                break;
            }
        }
    }


    /**
     * Returns whether or not to ignore the provided view from the config
     *
     * @param type
     * @param viewName
     * @return
     * @throws ViewNotFoundException
     */
    public boolean isIgnored(ViewTypeEnum type, String viewName) throws ViewNotFoundException
    {
        View view = getView(type, viewName);
        if (view.getIgnore() != null)
        {
            return Boolean.parseBoolean(view.getIgnore());
        }
        return false;
    }
}
