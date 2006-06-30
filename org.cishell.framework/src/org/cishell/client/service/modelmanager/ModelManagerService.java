/* **************************************************************************** 
 * CIShell: Cyberinfrastructure Shell, An Algorithm Integration Framework.
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Apache License v2.0 which accompanies
 * this distribution, and is available at:
 * http://www.apache.org/licenses/LICENSE-2.0.html
 * 
 * Created on Jun 14, 2006 at Indiana University.
 * 
 * Contributors:
 *     Indiana University - Initial API
 * ***************************************************************************/
package org.cishell.client.service.modelmanager;

import org.cishell.framework.datamodel.DataModel;

/**
 * A service for managing loaded {@link DataModel}s. 
 * {@link ModelManagerListener}s may be registered to be notified of changes
 * in the model manager.
 * 
 * Clients are encouraged to use this service for managing the models they have 
 * loaded into memory. Algorithm writers are encouraged not to use this service 
 * as it is not guaranteed to be available like the standard CIShell services 
 * are.
 * 
 * @author Bruce Herr (bh2@bh2.net)
 */
public interface ModelManagerService {
	/**
	 * Adds a DataModel to the manager
	 * 
	 * @param model The data model
	 */
    public void addModel(DataModel model);
    
    /**
     * Removes a DataModel from the manager
     * 
     * @param model The data model
     */
    public void removeModel(DataModel model);
    
    /**
     * Sets which data models are selected in the manager. If a given DataModel
     * in the array of DataModels is not in the model manager, then it will be
     * automatically added before selection.
     * 
     * @param models The data models to select
     */
    public void setSelectedModels(DataModel[] models);
    
    /**
     * Returns the models that have been selected in the manager
     * 
     * @return An array of DataModels, length may be zero
     */
    public DataModel[] getSelectedModels();
    
    /**
     * Returns all of the DataModels loaded into the manager
     * 
     * @return An array of DataModels, length may be zero
     */
    public DataModel[] getAllModels();
    
    /**
     * Adds a {@link ModelManagerListener} that will be notified as DataModels
     * are added, removed, and selected
     * 
     * @param listener The listener to be notified of events
     */
    public void addModelManagerListener(ModelManagerListener listener);
    
    /**
     * Removes the {@link ModelManagerListener} from the listener group and will
     * no longer notify it of events
     * 
     * @param listener The listener to be removed
     */
    public void removeModelManagerListener(ModelManagerListener listener);
}
