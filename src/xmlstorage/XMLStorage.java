/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlstorage;

import java.util.List;
import javax.rad.model.SortDefinition;
import javax.rad.model.condition.ICondition;
import javax.rad.persist.DataSourceException;
import javax.rad.persist.MetaData;

/**
 *
 * @author stefanpopp
 */
public class XMLStorage implements IStorage{

    @Override
    public MetaData getMetaData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getEstimatedRowCount(ICondition pFilter) throws DataSourceException {
        throw new DataSourceException("Not supported yet.");
    }

    @Override
    public List<Object[]> fetch(ICondition pFilter, SortDefinition pSort, int pFromRow, int pMinimumRowCount) throws DataSourceException {
        throw new DataSourceException("Not supported yet.");
    }

    @Override
    public Object[] refetchRow(Object[] pDataRow) throws DataSourceException {
        throw new DataSourceException("Not supported yet.");
    }

    @Override
    public Object[] insert(Object[] pDataRow) throws DataSourceException {
        throw new DataSourceException("Not supported yet.");
    }

    @Override
    public Object[] update(Object[] pOldDataRow, Object[] pNewDataRow) throws DataSourceException {
        throw new DataSourceException("Not supported yet.");
    }

    @Override
    public void delete(Object[] pDeleteDataRow) throws DataSourceException {
        throw new DataSourceException("Not supported yet.");
    }
   
}
